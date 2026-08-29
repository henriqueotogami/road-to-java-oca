# 🧪 Guia de Padrão de Testes Unitários - Road to Java OCA

**Versão:** 1.0  
**Autor:** henriqueotogami  
**Data:** 2026-08-29  
**Descrição:** Guia para manter consistência na criação de novos testes unitários no projeto

---

## 📋 Sumário Executivo

Este documento estabelece os padrões, convenções e melhores práticas para criação de testes unitários neste repositório. Agentes de IA e desenvolvedores devem seguir este guia ao criar ou modificar testes.

---

## 🎯 Estrutura Geral

### Organização de Pacotes

```
src/test/java/oca/chapter{XX}/
├── ExamplesTest.java          (Testes dos exemplos do capítulo)
├── ConceptsTest.java           (Testes de conceitos específicos)
└── [NomeSpecificoTest].java    (Testes especializados)
```

**Convenção de Nomenclatura:**
- Sufixo obrigatório: `Test` (ex: `ExamplesTest.java`, `AttributionTest.java`)
- Iniciar com letra maiúscula: `CamelCase`
- Deve estar no pacote `oca.chapter{XX}`

---

## 📝 Estrutura de Classe de Teste

### Template Padrão

```java
package oca.chapter05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * <br>Classe de teste para [descrição do escopo].
 *
 * @author henriqueotogami
 * @since YYYY-MM-DD
 * @version X.X
 */
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
class ExamplesTest {
    
    // Testes aqui...
}
```

### Anotações Obrigatórias da Classe

| Anotação | Obrigatória | Descrição |
|----------|-------------|-----------|
| `@TestMethodOrder(...)` | ✅ SIM | Ordena testes por `@Order` |
| `class` com `Test` suffix | ✅ SIM | Nome deve terminar com `Test` |
| Javadoc completo | ✅ SIM | Ver seção Documentação |

---

## 🔧 Padrão de Método de Teste

### Template Padrão de Método

```java
/**
 * <br>Teste para [O QUE está sendo testado].
 * <br>[Contexto/Importância do teste - explicar POR QUE é importante].
 *
 * @author henriqueotogami
 * @since YYYY-MM-DD
 * @version X.X
 * @see ClasseSendoTestada
 */
@Test
@Order(N)
void testNameDescriptive() {
    // Arrange: Preparar dados
    final ClassName instance = new ClassName();
    final int expectedValue = 8;
    
    // Act: Executar
    final int result = instance.method(input);
    
    // Assert: Validar
    Assertions.assertEquals(expectedValue, result, "Mensagem descritiva");
}
```

---

## 📌 Regras de Nomenclatura de Métodos

### Padrão Usado no Projeto

**Estrutura:** `example{XX}[Descrição]` ou `test[Descrição]`

#### Exemplos do Projeto:

```java
// Padrão: exemplo + tipo/comportamento
void example01CreateMethod()       // Exemplo 01: Criação de método
void example01OverloadMethod()     // Exemplo 01: Sobrecarga de método
void example03PassByValue()        // Exemplo 03: Passagem por valor
void example03PassByReference()    // Exemplo 03: Passagem por referência
void example05InstanceVariables()  // Exemplo 05: Variáveis de instância
void example06OverloadConstructor()// Exemplo 06: Sobrecarga de construtor
void example08StaticMethod()       // Exemplo 08: Método estático

// Testes específicos
void exercise01ImportTest()        // Teste do exercício 01
void exercise02CompileTest()       // Teste do exercício 02
```

### Convenção Recomendada

```
example{NUMERO}{TipoComPrimeiraLetraMaiuscula}

✅ CORRETO:  void example01CreateMethod()
✅ CORRETO:  void example05InstanceVariables()
❌ ERRADO:   void test_example_01_create_method()
❌ ERRADO:   void createMethodExample01()
```

---

## 📚 Documentação de Métodos de Teste

### Padrão Javadoc Obrigatório

```java
/**
 * <br>Teste para verificar se [O QUE está sendo testado].
 * <br>[Contexto detalhado sobre POR QUE o teste é importante].
 *
 * @author henriqueotogami
 * @since YYYY-MM-DD
 * @version X.X
 * @see ClasseSendoTestada
 */
```

### Exemplos do Projeto

#### ✅ Excelente (Chapter 05)
```java
/**
 * Teste para o exemplo de uso de métodos em Java.
 */
```

#### ✅ Muito Bom (Chapter 01)
```java
/**
 * <br>Teste para verificar se a classe Example01PackageImport gera uma lista de planetas corretamente.
 * <br>Este teste é importante para garantir que a classe Example01PackageImport esteja funcionando conforme o esperado, gerando uma lista de planetas que não esteja vazia.
 *
 * @author henriqueotogami
 * @since 2026-03-07
 * @version 1.0
 * @see Example01PackageImport
 */
```

### Checklist de Documentação

- [ ] Descrição clara do que está sendo testado (O QUÊ)
- [ ] Explicação do motivo do teste (POR QUÊ)
- [ ] Tag `@author` com nome/login do autor
- [ ] Tag `@since` com data no formato YYYY-MM-DD
- [ ] Tag `@version` com número de versão
- [ ] Tag `@see` referenciando a classe sendo testada

---

## 🧬 Padrão AAA (Arrange-Act-Assert)

Todos os testes devem seguir o padrão AAA:

### 1️⃣ **Arrange** - Preparação

```java
// Criar instâncias
final MathTools mTools = new MathTools();

// Definir dados de entrada
final int x = 8;
final int y = 13;

// Definir resultado esperado
final int expectedValue = 8;
```

**Boas Práticas:**
- Use `final` para variáveis imutáveis
- Nomeie claramente o que é esperado: `expected`, `initial`, `expected...`
- Prepare todos os dados necessários

### 2️⃣ **Act** - Execução

```java
// Executar operação única
final int result = mTools.findLowerValue(x, y);
```

**Boas Práticas:**
- Uma única operação por teste
- Armazene o resultado em uma variável clara
- Não tenha lógica complexa nesta seção

### 3️⃣ **Assert** - Validação

```java
// Validar resultado
Assertions.assertEquals(expectedValue, result, "Mensagem descritiva");
```

**Boas Práticas:**
- Sempre incluir mensagem descritiva (3º parâmetro)
- Usar `assertEquals()` para comparações diretas
- Usar `assertTrue()`, `assertFalse()` para booleans
- Usar `assertNull()`, `assertNotNull()` para null

---

## 📋 Tipos de Assertions Utilizados

### Assertions JUnit 5 Aprovados

```java
// Igualdade
Assertions.assertEquals(expected, actual, "mensagem");
Assertions.assertNotEquals(notExpected, actual, "mensagem");

// Booleanos
Assertions.assertTrue(condition, "mensagem");
Assertions.assertFalse(condition, "mensagem");

// Null checks
Assertions.assertNull(value, "mensagem");
Assertions.assertNotNull(value, "mensagem");

// Condicionais customizadas
Assertions.assertTrue(condition, () -> "Mensagem lazy");
Assertions.assertThrows(ExceptionType.class, () -> { ... });
```

### Exemplo Completo

```java
@Test
@Order(7)
void example05InstanceVariables() {
    // Arrange
    Television tv1 = new Television();
    Television tv2 = new Television();
    
    // Act
    tv1.setChannel(2);
    tv2.setChannel(7);
    
    // Assert
    Assertions.assertEquals(2, tv1.getChannel(), 
        "A variável de instância deve manter seu valor específico para cada objeto.");
    Assertions.assertEquals(7, tv2.getChannel(), 
        "A variável de instância deve manter seu valor específico para cada objeto.");
}
```

---

## 🔢 Uso de @Order

### Regras Obrigatórias

```java
@Test
@Order(1)  // Sempre começar em 1
void example01CreateMethod() { }

@Test
@Order(2)  // Incrementar sequencialmente
void example02OverloadMethod() { }
```

**Convenções:**
- `@Order(1)` = Primeiro teste
- Incrementar de 1 em 1
- Reflete a sequência lógica de testes
- Facilita leitura da saída de testes

---

## 📦 Imports Obrigatórios

```java
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// Conditional imports baseado no teste
import java.text.SimpleDateFormat;  // Se testar datas
import java.util.Date;               // Se testar datas
import java.util.StringTokenizer;    // Se testar tokens
```

**Nunca importar:**
- ❌ `org.junit.Test` (é JUnit 4, usar Jupiter)
- ❌ `org.hamcrest` (usar Assertions do Jupiter)

---

## 🎨 Padrão de Variáveis

### Convenções de Nomeação

```java
// ✅ CORRETO
final MathTools mTools = new MathTools();      // Instâncias: camelCase
final int x = 8;                               // Inputs: nomes simples/significativos
final int expectedValue = 8;                   // Esperados: prefixo "expected"
final int lowestInt = mTools.find...();        // Resultados: nomes descritivos
final boolean hasCreatedFile = exercise...();  // Booleans: prefixo "is", "has", "should"

// ❌ ERRADO
MathTools mt = new MathTools();                // Sem final
int EXPECTED_VALUE = 8;                        // Constantes em UPPER_CASE
int result1, result2;                          // Nomes genéricos
```

### Prefixos Padrão

| Padrão | Uso | Exemplo |
|--------|-----|---------|
| `expected...` | Valores esperados | `expectedValue`, `expectedMessage` |
| `actual...` | Valores reais (menos comum) | `actualResult` |
| `initial...` | Valores iniciais | `initialTrackingNumber` |
| `has...` | Booleanos (propriedade) | `hasImportedStaticMember`, `hasCreatedFile` |
| `is...` | Booleanos (estado) | `isDocked`, `isLoggingEnabled` |
| `should...` | Booleanos (expectativa) | `shouldReturnTrue` |

---

## 🧪 Casos de Teste Comuns

### Teste de Método Simples

```java
@Test
@Order(1)
void example01CreateMethod() {
    final MathTools mTools = new MathTools();
    final int x = 8;
    final int y = 13;
    final int lowestInt = mTools.findLowerValue(x, y);
    Assertions.assertEquals(8, lowestInt);
}
```

### Teste de Sobrecarga

```java
@Test
@Order(2)
void example01OverloadMethod() {
    final MathTools mTools = new MathTools();
    final double x = 8.5;
    final double y = 13.2;
    final double lowestDouble = mTools.findLowerValue(x, y);
    Assertions.assertEquals(8.5, lowestDouble);
}
```

### Teste com Múltiplas Asserções

```java
@Test
@Order(6)
void example06CreateConstructor() {
    // Arrange
    LoanDetails loanDetails = new LoanDetails();
    loanDetails.setPrincipal(150000);
    final double expected = 1010.809999701624D;
    
    // Act & Assert
    Assertions.assertEquals(expected, loanDetails.monthlyPayment(), 
        "O método monthlyPayment deve calcular corretamente.");
}
```

### Teste de Estado (com múltiplas verificações)

```java
@Test
@Order(5)
void example05InstanceVariables() {
    // Arrange
    Television tv1 = new Television();
    Television tv2 = new Television();
    
    // Act
    tv1.setChannel(2);
    tv2.setChannel(7);
    
    // Assert - Múltiplas validações
    Assertions.assertEquals(2, tv1.getChannel(), 
        "A variável de instância deve manter seu valor específico para cada objeto.");
    Assertions.assertEquals(7, tv2.getChannel(), 
        "A variável de instância deve manter seu valor específico para cada objeto.");
}
```

### Teste de Variável Estática

```java
@Test
@Order(12)
void example09StaticVariable() {
    // Arrange
    final int initialTrackingNumber = ShippingPackage.nextTrackingNumber;
    
    // Act
    ShippingPackage package1 = new ShippingPackage();
    ShippingPackage package2 = new ShippingPackage();
    
    // Assert
    Assertions.assertEquals(initialTrackingNumber, 
        package1.getPackageTrackingNumber(), 
        "O número de rastreamento do primeiro pacote deve ser igual ao valor inicial.");
    Assertions.assertEquals(initialTrackingNumber + 1, 
        package2.getPackageTrackingNumber(), 
        "O número de rastreamento do segundo pacote deve ser igual ao valor inicial + 1.");
}
```

### Teste com Métodos Void (sem retorno)

```java
@Test
@Order(3)
void example02OverloadMethod() {
    // Arrange
    final LogManager logManager = new LogManager();
    
    // Act
    logManager.logInfo("This is a log message without an error number.");
    logManager.logInfo("This is a log message with an error number.", 404);
    
    // Assert - Validar que não lançou exceção
    Assertions.assertTrue(true); // Apenas para garantir que o teste passe
}
```

---

## 🚫 Padrões a Evitar

### ❌ Não Fazer

```java
// NÃO: Múltiplos testes em um
@Test
void testEverything() {
    // Testa método 1
    // Testa método 2
    // Testa método 3
}

// NÃO: Sem @Order
@Test
void example01Test() { }  // Falta @Order

// NÃO: Sem documentação
@Test
void test() { }  // Falta tudo

// NÃO: Assertions genéricas
Assertions.assertTrue(true);  // Sempre passa, inútil

// NÃO: Sem mensagem descritiva
Assertions.assertEquals(8, result);  // Sem mensagem

// NÃO: Lógica no Arrange
final int result = mTools.findLowerValue(x, y);  // Isso é Act, não Arrange!

// NÃO: Variáveis sem final
MathTools mTools = new MathTools();  // Deve ser final
```

---

## 🔄 Estrutura Completa - Exemplo Real

```java
package oca.chapter05;

import oca.chapter05.methods.example01.MathTools;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * <br>Classe de teste para os exemplos de métodos em Java.
 *
 * @author henriqueotogami
 * @since 2026-04-19
 * @version 0.5
 */
@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
class ExamplesTest {

    /**
     * <br>Teste para o exemplo de uso de métodos em Java.
     * <br>Verifica se o método findLowerValue retorna corretamente o menor valor entre dois inteiros.
     *
     * @author henriqueotogami
     * @since 2026-04-19
     * @version 0.5
     * @see MathTools
     */
    @Test
    @Order(1)
    void example01CreateMethod() {
        // Arrange
        final MathTools mTools = new MathTools();
        final int x = 8;
        final int y = 13;
        final int expectedLowest = 8;
        
        // Act
        final int lowestInt = mTools.findLowerValue(x, y);
        
        // Assert
        Assertions.assertEquals(expectedLowest, lowestInt, 
            "O método findLowerValue deve retornar o menor valor entre dois inteiros.");
    }

    /**
     * <br>Teste para o exemplo de uso de métodos sobrecarregados em Java.
     * <br>Verifica se o método findLowerValue retorna corretamente o menor valor entre dois doubles.
     *
     * @author henriqueotogami
     * @since 2026-04-19
     * @version 0.5
     * @see MathTools
     */
    @Test
    @Order(2)
    void example01OverloadMethod() {
        // Arrange
        final MathTools mTools = new MathTools();
        final double x = 8.5;
        final double y = 13.2;
        final double expectedLowest = 8.5;
        
        // Act
        final double lowestDouble = mTools.findLowerValue(x, y);
        
        // Assert
        Assertions.assertEquals(expectedLowest, lowestDouble, 
            "O método findLowerValue deve retornar o menor valor entre dois doubles.");
    }
}
```

---

## 📊 Checklist para Novos Testes

Antes de criar um teste, verifique:

### Estrutura da Classe
- [ ] Classe nomeada com sufixo `Test`
- [ ] Pacote correto: `oca.chapter{XX}`
- [ ] Javadoc de classe completo
- [ ] `@TestMethodOrder(...)` presente
- [ ] Visibility: `package-private` (sem `public`)

### Estrutura do Método
- [ ] Nomeação: `example{XX}[Descrição]` ou `exercise{XX}[Descrição]`
- [ ] Anotação `@Test` presente
- [ ] Anotação `@Order(N)` com número sequencial
- [ ] Javadoc completo com tags `@author`, `@since`, `@version`, `@see`
- [ ] Segue padrão AAA (Arrange-Act-Assert)
- [ ] Variáveis com `final` e nomes descritivos
- [ ] Assertions com mensagens descritivas

### Boas Práticas
- [ ] Um teste por comportamento/funcionalidade
- [ ] Sem efeitos colaterais entre testes
- [ ] Dados de teste realistas mas simples
- [ ] Sem lógica complexa no teste
- [ ] Sem dependência de ordem de execução (além de @Order visual)
- [ ] Sem println() ou logs de debug
- [ ] Assertions não generalizadas

---

## 🔗 Referências

- **JUnit 5 (Jupiter):** https://junit.org/junit5/docs/current/user-guide/
- **Assertions JUnit:** https://junit.org/junit5/docs/current/api/org/junit/jupiter/api/Assertions.html
- **Padrão AAA:** https://www.arrangeactassert.com/
- **Java OCA Exam:** Certificação Oracle Certified Associate Java Programmer

---

## 📝 Histórico de Versões

| Versão | Data | Autor | Descrição |
|--------|------|-------|-----------|
| 1.0 | 2026-08-29 | henriqueotogami | Versão inicial - Padrão completo baseado em Chapter 05 |

---

## ✅ Próximas Versões

- [ ] Adicionar exemplos de testes para Chapter 06
- [ ] Adicionar padrões para testes de exceções
- [ ] Adicionar padrões para testes parametrizados
- [ ] Adicionar padrões para fixtures e setup/teardown

---

**Última Atualização:** 2026-08-29  
**Status:** ✅ Ativo e em uso
