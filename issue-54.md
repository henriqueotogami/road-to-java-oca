# 📌 Pull Request — Implementação da Issue #54: Exceções e concorrência no capítulo 09

## 🎯 Objetivo

Implementar os exemplos iniciais do capítulo 09 do projeto, com foco em exceções verificadas, exceções personalizadas, propagação de exceções e criação de threads em Java. A implementação também adiciona testes automatizados e uma tarefa Gradle específica para executar os testes do capítulo de forma isolada.

**Issue relacionada:** #54

## 🧱 Principais Alterações

- **Adição da tarefa `chapter09` no Gradle**
  - Cria uma tarefa de testes dedicada ao pacote `oca.chapter09.*`.
  - Mantém a organização das tarefas por capítulo no grupo `oca-chapters`.
  - Utiliza a plataforma JUnit 5 para execução dos testes.

- **Implementação do exemplo `CEExample`**
  - Implementa a interface `Runnable`.
  - Demonstra a criação e inicialização de uma nova `Thread`.
  - Apresenta o uso de exceções verificadas (`IOException` e `InterruptedException`).
  - Registra a criação, o estado e a finalização da thread usando Log4j.
  - Executa pausas de cinco segundos e trata interrupções durante a execução.
  - Restaura o status de interrupção da thread com `Thread.currentThread().interrupt()`.
  - Disponibiliza `generateNewThread(Runnable)` para centralizar a criação da thread.

- **Criação da exceção personalizada `RecordException`**
  - Estende `Exception`, caracterizando uma checked exception.
  - Disponibiliza construtores sem argumentos e com mensagem personalizada.
  - Demonstra a necessidade de capturar ou declarar exceções verificadas.

- **Implementação da propagação em cascata com `Thrower`**
  - Cria a cadeia `throw1() -> throw2() -> throw3() -> throw4()`.
  - Propaga `IOException` dos métodos inferiores para o método superior.
  - Lança a exceção no método `throw4()` e realiza o tratamento em `cascading()`.
  - Registra cada etapa da execução para tornar o fluxo da exceção observável.

- **Adição dos testes de `ExamplesTest`**
  - Verifica a criação de threads e o lançamento de `IOException` por `CEExample`.
  - Valida a instanciação e captura de `RecordException`.
  - Confirma que todos os métodos da cadeia de `Thrower` lançam `IOException`.
  - Organiza a execução dos cenários com `@Order`.

## 📁 Arquivos/áreas impactadas

- `build.gradle`
  - Adição da tarefa `chapter09` para execução isolada dos testes do capítulo.

- `src/main/java/oca/chapter09/exceptions/example01/CEExample.java`
  - Exemplo de checked exceptions, `Runnable` e criação de threads.

- `src/main/java/oca/chapter09/exceptions/example02/RecordException.java`
  - Exceção personalizada verificada.

- `src/main/java/oca/chapter09/exceptions/example03/Thrower.java`
  - Exemplo de propagação de exceções entre métodos.

- `src/test/java/oca/chapter09/ExamplesTest.java`
  - Testes JUnit 5 dos exemplos do capítulo.

- `docs/prompt-issues-chapters.md`
  - Novo arquivo de documentação, atualmente sem conteúdo.

- `issue-54.md`
  - Descrição desta Pull Request conforme o padrão do repositório.

## 🧪 Testes

Foram adicionados testes JUnit 5 para os três exemplos do capítulo:

- Criação e validação de instâncias de `Thread`.
- Verificação de `IOException` lançada pelo construtor de `CEExample`.
- Captura e validação de `RecordException`.
- Verificação da propagação de `IOException` em `throw1()`, `throw2()`, `throw3()` e `throw4()`.

Para executar somente os testes do capítulo 09:

```bash
./gradlew chapter09
```

Para executar toda a suíte de testes:

```bash
./gradlew test
```

Os testes não dependem de geração aleatória: os cenários utilizam comportamentos e exceções determinísticos.

## 🗂 Logs e artefatos

- Os exemplos utilizam Log4j para registrar a execução das threads e o fluxo de propagação das exceções.
- Não foram adicionados arquivos de log persistentes nem utilitários de limpeza de artefatos.
- A execução de `CEExample` cria threads temporárias para fins didáticos.
- A thread do exemplo permanece ativa por um período limitado de até 30 segundos.

## ✅ Checklist de revisão

- [x] PR tem título claro e issue referenciada (#54).
- [x] Objetivo e escopo da implementação estão descritos.
- [x] Principais alterações estão organizadas por componente.
- [x] Arquivos e áreas impactadas estão listados.
- [x] Foram adicionados testes para os caminhos principais.
- [x] Os testes utilizam cenários determinísticos.
- [x] O tratamento de interrupção restaura o status da thread.
- [x] Não foram adicionados artefatos persistentes de log.
- [ ] Build local e CI validados — preencher após a execução no ambiente de revisão.
- [ ] Milestone e labels confirmados no GitHub.

## 📌 Exemplos e snippets

### Criação de uma thread

```java
Thread thread = CEExample.generateNewThread(runnable);
thread.start();
```

### Declaração de exceções verificadas

```java
public CEExample() throws IOException, InterruptedException {
    // implementação do exemplo
}
```

### Propagação da exceção

```java
public void throw1() throws IOException {
    throw2();
}

public void throw4() throws IOException {
    throw new IOException("Explosion");
}
```

## ℹ️ Notas adicionais / Riscos

- O construtor de `CEExample` inicia uma thread antes de lançar `IOException`. Portanto, mesmo quando a construção falha, a thread criada pode continuar executando.
- O teste de `CEExample` envolve esperas de cinco segundos e pode gerar threads durante a execução da suíte.
- A classe usa `SimpleDateFormat` como estado compartilhado entre a thread principal e a thread criada. Como o exemplo é didático, esse comportamento representa o uso apresentado no capítulo, mas deve ser reavaliado caso o código seja reutilizado em produção.
- `docs/prompt-issues-chapters.md` foi criado, mas ainda não contém documentação adicional.

**Labels sugeridas:** `enhancement`, `tests`, `chapter09`

**Milestone sugerida:** `Chapter09`
