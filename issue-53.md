# Issue #54 — Tratamento de exceções e concorrência no capítulo 09

## Visão geral

A implementação da issue #54 adiciona o conteúdo inicial do capítulo 09 do projeto, dedicado ao tratamento de exceções em Java e a conceitos relacionados à execução de threads. Foram incluídos exemplos práticos de exceções verificadas, exceções personalizadas, propagação de exceções em cadeia e criação/execução de threads com `Runnable`.

## Implementações realizadas

### 1. Tarefa Gradle para o capítulo 09

Foi criada a tarefa `chapter09` no `build.gradle`, seguindo o padrão das tarefas dos capítulos anteriores.

- Grupo: `oca-chapters`
- Descrição: `Run Chapter 09 tests`
- Plataforma: JUnit 5 (`useJUnitPlatform()`)
- Filtro: executa somente os testes do pacote `oca.chapter09.*`

Com isso, os testes do capítulo podem ser executados de forma isolada por meio da tarefa específica do Gradle.

### 2. Exemplo de exceções verificadas e threads

A classe `CEExample` implementa `Runnable` e demonstra a combinação entre exceções verificadas e concorrência:

- Cria uma nova thread durante a construção do objeto.
- Inicia a thread e registra seu nome e o horário de criação.
- Declara `IOException` e `InterruptedException` na assinatura do construtor.
- Aguarda cinco segundos na thread principal.
- Lança explicitamente uma `IOException` ao final do construtor.
- Executa o método `run()` por até 30 segundos, realizando pausas de cinco segundos.
- Registra os momentos em que a thread dorme, acorda e finaliza.
- Trata `InterruptedException` durante a execução e restaura o status de interrupção da thread com `Thread.currentThread().interrupt()`.
- Disponibiliza o método estático `generateNewThread(Runnable)` para encapsular a criação de threads.

O método `main` também exemplifica o tratamento e o relançamento de `IOException` e `InterruptedException`.

### 3. Exceção personalizada verificada

A classe `RecordException` foi adicionada como uma exceção customizada baseada em `Exception`.

Por herdar diretamente de `Exception`, ela representa uma exceção verificada: seu uso exige tratamento com `try/catch` ou declaração com `throws`.

Foram disponibilizados:

- Construtor sem argumentos.
- Construtor que recebe uma mensagem.

### 4. Propagação em cascata de exceções

A classe `Thrower` demonstra como uma exceção pode ser propagada por uma sequência de métodos até chegar ao ponto de tratamento:

```text
throw1() -> throw2() -> throw3() -> throw4()
```

A sequência de retorno da exceção ocorre no sentido inverso:

```text
throw1() <- throw2() <- throw3() <- throw4()
```

Características implementadas:

- Cada método registra sua execução.
- `throw1()`, `throw2()` e `throw3()` delegam a chamada ao método seguinte.
- `throw4()` lança uma `IOException` com a mensagem `Explosion`.
- O método `cascading()` captura a exceção no nível superior e registra a mensagem do erro.
- O método `main` inicia o exemplo de propagação.

### 5. Testes automatizados

Foi criada a classe `oca.chapter09.ExamplesTest`, com execução ordenada dos cenários por meio de `@Order`:

- **`testCEExample`**: valida a criação de threads, verifica o tipo retornado e confirma que a criação de `CEExample` lança `IOException`.
- **`testRecordException`**: instancia e captura `RecordException`, confirmando o tipo da exceção.
- **`testThrower`**: verifica que cada método da cadeia lança `IOException` conforme esperado.

## Arquivos adicionados ou modificados

- `build.gradle`
- `src/main/java/oca/chapter09/exceptions/example01/CEExample.java`
- `src/main/java/oca/chapter09/exceptions/example02/RecordException.java`
- `src/main/java/oca/chapter09/exceptions/example03/Thrower.java`
- `src/test/java/oca/chapter09/ExamplesTest.java`
- `docs/prompt-issues-chapters.md` — novo arquivo, atualmente vazio

## Resultado

A issue #54 introduz a estrutura do capítulo 09 e seus primeiros exemplos executáveis. O código cobre o uso de exceções verificadas, a criação e o controle básico de threads, a definição de exceções próprias e a propagação de erros entre métodos, acompanhado de testes JUnit 5 e de uma tarefa Gradle dedicada.
