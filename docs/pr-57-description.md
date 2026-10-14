# 📗 Capítulo 09 — Tratamento de Exceções (Java OCA)

## 🧭 Resumo

Este capítulo apresenta os fundamentos do tratamento de exceções em Java, com foco em conceitos essenciais para a certificação OCA. A implementação foi organizada para demonstrar a hierarquia de exceções, a diferença entre exceções verificadas e não verificadas, a propagação de erros, o uso de `try/catch`, `finally`, `throw`, `throws`, `try-with-resources`, `multi-catch` e o uso de exceções personalizadas.

As práticas foram estruturadas em exemplos didáticos que mostram como o fluxo do programa pode ser alterado quando uma exceção é lançada, como capturá-la em nível correto e como garantir a limpeza de recursos e a manutenção do comportamento esperado.

### 🔹 Exemplo 01 — Exceções verificadas e threads

A classe `CEExample` foi criada para demonstrar:

- uso de exceções verificadas (`IOException`, `InterruptedException`);
- relacionamento entre o bloco `try/catch` e a propagação de erro;
- uso de `Thread` e `Runnable` em um cenário prático;
- comportamento de um processo que leva tempo e pode falhar durante a execução.

Esse exemplo reforça a ideia de que exceções verificadas exigem tratamento explícito ou declaração na assinatura do método.

### 🔹 Exemplo 02 — Exceção personalizada

A classe `RecordException` estende `Exception`, representando uma exceção verificada customizada.

Esse exemplo demonstra:

- definição de uma exceção própria;
- uso de construtores com e sem mensagem;
- propagação da exceção pelo fluxo do programa;
- importância de `throw` e `catch` em cenários específicos.

### 🔹 Exemplo 03 — Propagação em cascata

A classe `Thrower` explora o efeito de encadeamento de exceções em chamadas de método: uma exceção lançada em um nível mais profundo é propagada até o ponto de captura mais apropriado.

O exemplo ilustra:

- `throw1() -> throw2() -> throw3() -> throw4()`;
- propagação de `IOException` em sequência;
- importância do bloco `catch` no nível correto;
- leitura do fluxo de execução quando ocorre falha.

### 🔹 Exemplo 04 — `try/catch`

A classe `TryCatch` aborda:

- captura de `NumberFormatException`;
- captura de `IllegalArgumentException`;
- captura de `RuntimeException` e `Exception` em ordenamento específico;
- uso do `throw` dentro do bloco `try` para simular erros.

Esse exemplo reforça que a ordem dos blocos `catch` é relevante e que exceções mais específicas devem aparecer antes das mais genéricas.

### 🔹 Exemplo 05 — `try/finally`

A classe `TryFinally` mostra que o bloco `finally` sempre é executado, mesmo quando uma exceção é lançada.

Os cenários demonstrados incluem:

- execução normal com `finally`;
- execução com exceção e preservação do fluxo;
- comportamento de retorno após o `finally`.

Esse conceito é muito importante para a certificação OCA, porque o `finally` é um ponto crítico em cenários de limpeza e liberação de recursos.

### 🔹 Exemplo 06 — `try-with-resources`

A classe `TryWithResources` compara a abordagem manual de fechamento de recursos com a sintaxe moderna do `try-with-resources`.

Foi demonstrado:

- uso de `BufferedReader` e `FileReader`;
- fechamento manual em bloco `finally`;
- fechamento automático com `try-with-resources`;
- propagação de `IOException` em ambos os cenários.

Esse exemplo destaca a redução de erros e a maior segurança no gerenciamento de recursos.

### 🔹 Exemplo 07 — `multi-catch`

A classe `MultiCatch` mostra a possibilidade de capturar múltiplas exceções em um único bloco `catch` usando a sintaxe:

```java
catch (IOException | IllegalArgumentException e) {
    // tratamento
}
```

O objetivo foi reforçar que o uso de `multi-catch` se aplica a exceções relacionadas e que a sintaxe ajuda a manter o código mais limpo sem perder clareza.

## ✅ Análise da implementação

A implementação contemplou boa parte dos requisitos esperados para o capítulo de exceções em Java:

| Requisito | Situação |
|---|---|
| Hierarquia de exceções | ✅ Implementado |
| Exceções verificadas e não verificadas | ✅ Implementado |
| `throw` e `throws` | ✅ Implementado |
| `try/catch` | ✅ Implementado |
| `finally` | ✅ Implementado |
| `try-with-resources` | ✅ Implementado |
| `multi-catch` | ✅ Implementado |
| Exceção customizada | ✅ Implementado |
| Testes automatizados do capítulo | ✅ Implementado |
| Integração com suíte geral do projeto | ✅ Implementado |

A proposta foi atendida com exemplos práticos e objetivos, alinhados ao conteúdo exigido pela certificação Java OCA.

## 🧪 Análise dos testes unitários

Foi criado o arquivo `src/test/java/oca/chapter09/Chapter09ExamplesTest.java`, contendo testes para os principais exemplos do capítulo.

Os testes validam:

- geração e uso de threads com exceções verificadas;
- criação e captura de exceções customizadas;
- encadeamento de propagação de erros entre métodos;
- uso correto de `catch` para diferentes tipos de exceções;
- execução sempre do bloco `finally`;
- tratamento de recursos com `try-with-resources`; 
- captura múltipla em `multi-catch`.

Também foi incluída a suíte geral do projeto em `src/test/java/oca/JavaOcaSuite.java`, além da atualização do `build.gradle` para habilitar os testes do capítulo 09 e permitir a execução da suíte completa com `allChapters`.

### 📊 Nível de maturidade

A cobertura apresenta um nível bom para o capítulo, pois cobre os principais fluxos conceituais e os cenários mais relevantes da prova OCA.

Ainda há espaço para evolução em alguns pontos:

- revisar nomes de métodos e classes para padronização completa;
- ajustar mensagens e logs para maior clareza didática;
- ampliar os exemplos para casos mais específicos de `NullPointerException` e `IllegalStateException`;
- incluir cenários envolvendo múltiplas exceções e tratamento em níveis diferentes da cadeia de chamadas.

## 📝 Análise do exame final

O exame final do capítulo foi registrado em `src/main/java/oca/chapter09/chapter09Exam.txt` com 17 questões, resultando em:

- ✅ 13 questões corretas;
- ❌ 4 questões incorretas;
- 📈 aproveitamento: 76,5%.

### 🌟 Pontos fortes

O desempenho demonstra domínio em:

- conceito de exceções verificadas e não verificadas;
- uso correto de `throw` e `throws`;
- entendimento do comportamento do `finally`;
- diferenciação entre `IOException` e `RuntimeException`;
- reconhecimento de cenários de `multi-catch` e `try-with-resources`;
- interpretação da hierarquia `Throwable -> Exception -> RuntimeException`.

### ⚠️ Pontos a revisar

As questões incorretas concentram-se principalmente em:

- nuances da hierarquia de exceções;
- diferenças entre erros de compilação e exceções em tempo de execução;
- comportamento de classes que herdam `Error` ou `Exception`;
- identificação correta de casos de `NullPointerException` e outras exceções comuns.

O resultado mostra avanço consistente e indica que o conteúdo foi assimilado em boa parte, com foco específico nas áreas práticas e conceituais mais importantes do capítulo.

## 📚 Conclusão

O capítulo 09 evoluiu de forma sólida e entregou exemplos funcionais que cobrem os principais conceitos de tratamento de exceções em Java.

A implementação apresenta boa base didática para:

- entendimento da hierarquia de exceções;
- uso de `try`, `catch`, `finally` e `throw`;
- diferença entre exceções verificadas e não verificadas;
- gerenciamento de recursos com `try-with-resources`;
- aplicação de `multi-catch`;
- uso de exceções personalizadas;
- construção de cenários práticos alinhados à certificação Java OCA.

Como próximos passos, recomenda-se:

- reforçar o estudo de exceções comuns e suas subclasses;
- complementar os exemplos com `NullPointerException`, `IllegalArgumentException` e `ArrayIndexOutOfBoundsException`;
- aumentar a maturidade dos testes para validar mais casos de propagação e captura de erros.

📌 Status do capítulo: implementação concluída, com boa cobertura conceitual e prática para a certificação Java OCA.

## 🔗 Referência

Capítulo 09 — Tratamento de Exceções
Certificação Java OCA

Closes #56
