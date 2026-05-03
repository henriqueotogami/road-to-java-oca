# ☕ Estudos Java OCA - Oracle Certified Associate

> Repositório destinado a **estudos colaborativos para a certificação Java OCA (Oracle Certified Associate)**.

<br>
<div align="center">
<img src="https://img.shields.io/github/v/release/henriqueotogami/road-to-java-oca?style=for-the-badge">
</div>
<br>
<div align="center">
<img width="500" src="https://github.com/henriqueotogami/road-to-java-oca/blob/main/src/main/resources/images/rounded-header-otogami.png?raw=true">
</div>
<br>
<div align="center">
<h3>STATUS DO REPOSITÓRIO</h3>
<img src="https://img.shields.io/github/actions/workflow/status/henriqueotogami/road-to-java-oca/.github%2Fworkflows%2Fgradle.yml?style=for-the-badge">
<img src="https://img.shields.io/github/release-date/henriqueotogami/road-to-java-oca?style=for-the-badge">
</div>
<br>
<div align="center">
<img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/henriqueotogami/road-to-java-oca?style=for-the-badge">
<img src="https://img.shields.io/github/checks-status/henriqueotogami/road-to-java-oca/main?style=for-the-badge">
<img src="https://img.shields.io/github/issues/henriqueotogami/road-to-java-oca?style=for-the-badge">
</div>
<br>
<div align="center">
<img src="https://img.shields.io/github/forks/henriqueotogami/road-to-java-oca?style=for-the-badge">
<img src="https://img.shields.io/github/stars/henriqueotogami/road-to-java-oca?style=for-the-badge">
<img src="https://img.shields.io/github/license/henriqueotogami/road-to-java-oca?style=for-the-badge">
</div>
<br>
<div align="center">
<h3>STATUS DO SONAR CLOUD</h3>
<img src="https://sonarcloud.io/api/project_badges/measure?project=henriqueotogami_road-to-java-oca&metric=alert_status">
<img src="https://sonarcloud.io/api/project_badges/measure?project=henriqueotogami_road-to-java-oca&metric=bugs">
<img src="https://sonarcloud.io/api/project_badges/measure?project=henriqueotogami_road-to-java-oca&metric=coverage">
</div>
<br>
<div align="center">
<h3>STATUS DO GITHUB ACTIONS</h3>
<img src="https://github.com/henriqueotogami/road-to-java-oca/actions/workflows/github-code-scanning/codeql/badge.svg?style=for-the-badge">
<img src="https://github.com/henriqueotogami/road-to-java-oca/actions/workflows/gradle.yml/badge.svg?style=for-the-badge">
<img src="https://github.com/henriqueotogami/road-to-java-oca/actions/workflows/sonar.yml/badge.svg?style=for-the-badge">
</div>
<br>
<div align="center">
<h3>STATUS DO WAKATIME</h3>
<a href="https://wakatime.com/badge/user/1e53636e-c916-4d50-9ce1-f3ac75a883e3/project/3a5e3f46-b18c-49e9-8b81-cda72611432d"><img src="https://wakatime.com/badge/user/1e53636e-c916-4d50-9ce1-f3ac75a883e3/project/3a5e3f46-b18c-49e9-8b81-cda72611432d.svg" alt="wakatime"></a>
</div>
<br>
<div align="center">
<a href="https://ko-fi.com/henriqueotogami" target="_blank">
  <img src="https://cdn.ko-fi.com/cdn/kofi3.png?v=3" alt="Apoie o Projeto" style="height:50px;">
</a>
</div>

## 📋 Sobre o Projeto

Este repositório contém uma coleção organizada de exemplos de código, exercícios e documentação para preparação do exame **Oracle Certified Associate (OCA) Java SE 8 Programmer I**. Os conteúdos seguem o guia oficial de estudos e incluem práticas de pacotes, imports, variáveis, controle de fluxo, OOP e demais tópicos cobrados na certificação.

O projeto utiliza **Gradle** para build e está estruturado por capítulos, facilitando a revisão para a prova e o estudo colaborativo em grupo. Além disso, foi adotado um pipeline de qualidade com **JaCoCo** e **SonarCloud** para reforçar boas práticas de testes e código limpo: os relatórios de cobertura ajudam a manter um nível mínimo de testes para cada capítulo, enquanto a análise estática destaca bugs, code smells e problemas de manutenção que são discutidos em grupo como parte do aprendizado.

## 🛠️ Tecnologias Utilizadas

- ☕ **Java 8 (SE)** - Linguagem e versão alvo da certificação OCA
- 🧱 **Gradle** - Build, testes, cobertura e integração com análise estática
- ✅ **JUnit 5 (Jupiter)** - Testes unitários
- 🌱 **Git** - Controle de versão e fluxo colaborativo
- 📊 **JaCoCo** - Geração de relatórios de cobertura de testes (XML/HTML) integrados ao Gradle
- 🔍 **SonarCloud (SonarQube SaaS)** - Análise estática de código e cobertura via workflow `SonarCloud Analyze` (`./gradlew build sonar`)
- 🤖 **GitHub Actions** - CI (build, testes, envio de cobertura para o SonarCloud e dependency submission)

## 🚀 Como Usar

### ⚙️ Pré-requisitos

- [Java 8 JDK](https://adoptium.net/) ou superior
- [Gradle](https://gradle.org/install/) (ou use o wrapper: `./gradlew`)

### 📦 Como Executar

```bash
git clone https://github.com/henriqueotogami/road-to-java-oca.git
cd road-to-java-oca
./gradlew build
./gradlew test
```

Tasks por capítulo (build na raiz do repositório):

```bash
./gradlew chapter01
./gradlew chapter02
./gradlew chapter03
./gradlew chapter04
./gradlew chapter05
./gradlew chapter06
```

## 📚 Conteúdos Abordados

O **build principal** (`./gradlew` na raiz) compila e testa o pacote `src/main/java/oca/`. O diretório `app/` contém um espelho parcial dos capítulos 1 e 2 (Cap. 2 em `primitives/`) para estudo isolado; ele só entra em build se o subprojeto estiver declarado em `settings.gradle`.

**Capítulo 1 — `oca/chapter01/fundamentals` (`src/main/java`)**

- ✅ Empacotamento e estrutura de pacotes em Java
- ✅ Compilação e interpretação (javac, JVM, bytecode)
- ✅ Imports (simples, estático, múltiplo)
- ✅ Interfaces e implementações
- ✅ Propriedades do sistema (`-D`, `System.getProperty`)
- ✅ Exercícios de compilação, classpath e subpacotes
- ✅ Material complementar (`StringTokenizer`)

**Capítulo 2 — `oca/chapter02/instructions` (`src/main/java`)**

- ✅ Variáveis e tipos (primitivos, wrappers, conversões)
- ✅ Operadores (atribuição, aritméticos, incremento/decremento, lógicos)
- ✅ Estruturas condicionais (`if`/`else`, ternário, `switch` com `String` e com enum)
- ✅ Laços (`for`, `for` aprimorado, `while`, `do-while`)
- ✅ Enums e mapeamento id/nome para constantes
- ✅ Uso básico de vetores (`int[]` em atribuição e laços)
- ✅ Introdução a coleções (`ArrayList` no exercício)
- ✅ Palavras-chave de transferência de controle (`break`, `continue`, `return` nos exemplos)
- ✅ Asserções (`assert`) em código didático
- ✅ Logging com **Log4j2** nos exemplos

**Capítulo 3 — `oca/chapter03/operators` (`src/main/java`)**

- ✅ Operadores aritméticos, relacionais e atribuição composta em cenários práticos
- ✅ Modelagem com classes de apoio (`Order`, `PirateShip`, `MainOperators`)
- ✅ Testes automatizados do capítulo (`oca.chapter03.*`)

**Capítulo 4 — `oca/chapter04` (`src/main/java`)**

- ✅ Tipos primitivos (`byte` … `double`, `char`, `boolean`) e literais
- ✅ `Object` e wrappers (`Integer`, etc.)
- ✅ Enums (regras básicas e exemplos dedicados)
- ✅ Exercício `ERACalculator` e testes `oca.chapter04.*`

**Capítulo 5 — `oca/chapter05/methods` (`src/main/java`)**

- ✅ Declaração de métodos, `return` e **sobrecarga** (mesmo nome, assinaturas diferentes)
- ✅ Parâmetros, campos e composição em exemplos (`Television`, `ShippingPackage`, `LoanDetails`, etc.)
- ✅ Introdução a **herança** (`ParentClass` / `ChildClass`) e reutilização de código
- ✅ Construtores, `this`, `super`, membros estáticos e escopo (exemplos e testes adicionais)
- ✅ Testes automatizados do capítulo (`oca.chapter05.*`)

**Capítulo 6 — `oca/chapter06/arrays` (`src/main/java`)**

- ✅ Arrays unidimensionais (primitivos, `String`, arrays de objetos com `Clock`)
- ✅ Arrays multidimensionais (2D e 3D, tamanhos irregulares e inicialização parcial)
- ✅ Relação entre `ArrayList` e arrays de primitivos (exercício e testes)
- ✅ Arquivo de apoio `chapter06Exam.txt` (simulado do capítulo)
- ✅ Testes automatizados (`oca.chapter06.*`) e task `./gradlew chapter06`

**Repositório e qualidade**

- ✅ Testes por capítulo com JUnit 5 (`chapter01` … `chapter06` no `build.gradle` da raiz)
- ✅ Cobertura **JaCoCo** e análise **SonarCloud** (configuração atual aponta `sonar.sources` / `sonar.tests` para `src/` na raiz)
- ✅ **GitHub Actions** (Gradle, Sonar; badge **CodeQL** no README)
- ✅ Boas práticas de versionamento (branches, issues, tags)

**Ainda não coberto em profundidade (próximos tópicos OCA)**

- 🔲 Polimorfismo, interfaces avançadas e design orientado a objetos além dos exemplos iniciais
- 🔲 Exceções (`try`/`catch`/`finally`, hierarquia, regras de compilação)
- 🔲 APIs fundamentais (`String`/`StringBuilder`, datas legadas, coleções `List`/`Map` em detalhe)

## 🌿 Fluxo de Trabalho

### 🌿 Estrutura de Branches

```
main
  |
  |____ dev-henrique
  |____ dev-vitor
  |____ dev-lucas
```

### 🌳 `main`
- Branch principal e consolidada do repositório
- Representa o estado atual do aprendizado do grupo
- Contém apenas código revisado e validado
- ❌ **Não é permitido commit direto**

### 🌱 `dev-henrique` / `dev-vitor` / `dev-lucas`
- Branches individuais dos integrantes
- Criadas **exclusivamente** para atender uma Issue
- Devem sempre ser criadas a partir da `main`

### 🐞 Issues (Obrigatórias)

- Toda task de estudo **deve começar com uma Issue**
- ❌ Nenhuma branch pode ser criada sem Issue associada
- A Issue deve descrever: tópico, objetivo e escopo

### 🏷️ Padrão de Nomenclatura

**Branches:** `dev-henrique/issue-#12`, `dev-vitor/issue-#15`  
**Tags (task):** `task-01-variaveis`, `task-02-operadores`  
**Tags (capítulo):** `chapter01`, `chapter02`, `chapter03`, `chapter04`, `chapter05`, `chapter06`

### 🔁 Fluxo Completo (passo-a-passo detalhado)

1) Planejamento da task

- 1.1 Criar uma **Issue** descrevendo claramente o tópico, objetivo e escopo da atividade.
- 1.2 Incluir critérios de aceitação e exemplos esperados (se aplicável).
- 1.3 Adicionar labels, estimativa de esforço e atribuir responsável(es).

2) Preparar o ambiente local

- 2.1 Atualizar `main` local: `git checkout main && git pull`.
- 2.2 Criar a branch de trabalho a partir da `main` usando o padrão: `dev-<name>/issue-<#number>`.
- 2.3 Configurar sua IDE para usar o JDK correto e importar o projeto Gradle.

3) Desenvolvimento e commits

- 3.1 Implementar a funcionalidade/exercício em pequenos passos.
- 3.2 Escrever testes unitários (JUnit 5) cobrindo os casos principais e borda.
- 3.3 Fazer commits atômicos com mensagens claras (ex.: `feat: adicionar exemplo de arrays - chapter06`).

4) Verificações locais e qualidade

- 4.1 Rodar testes unitários: `./gradlew test` e as tasks de capítulo relevantes (`./gradlew chapterXX`).
- 4.2 Gerar relatório de cobertura JaCoCo: `./gradlew jacocoTestReport` e checar percentuais.
- 4.3 Corrigir warnings, remover code smells óbvios e garantir que o código segue convenções do projeto.

5) Preparar Pull Request (PR)

- 5.1 Subir a branch remota: `git push -u origin dev-<name>/issue-#<number>`.
- 5.2 Abrir PR contra `main` e referenciar a Issue criada.
- 5.3 Descrever no PR as mudanças, como testar localmente e resultados dos testes/coverage.

6) Integração contínua e Quality Gate

- 6.1 O CI (GitHub Actions) irá executar `./gradlew build sonar` via workflow `SonarCloud Analyze`.
- 6.2 Aguardar os resultados: build, testes, report de cobertura e análise estática.
- 6.3 Certificar-se de que o PR atende ao Quality Gate do SonarCloud (ex.: cobertura ≥ 80%, sem novos bugs críticos).

7) Revisão por pares e correções

- 7.1 Revisores analisarão o PR; responder aos comentários rapidamente e aplicar correções na mesma branch.
- 7.2 Reexecutar testes localmente após cada mudança importante.

8) Merge, fechamento e pós-merge

- 8.1 Após aprovação, realizar o merge conforme política do projeto (merge commit, squash, rebase).
- 8.2 Fechar a Issue associada e criar uma **tag** de release se aplicável.
- 8.3 Atualizar o changelog/documentação e comunicar o time (se necessário).

### 🔗 Integração Gradle + SonarCloud no fluxo

Esta seção descreve passo-a-passo como a integração Gradle ↔ SonarCloud funciona, tanto no CI quanto localmente, e como investigar problemas comuns.

1) Visão geral

- 1.1 Sempre que um commit ou Pull Request é enviado para o repositório, o GitHub Actions dispara o workflow `SonarCloud Analyze` (quando configurado).
- 1.2 O objetivo é coletar métricas de build, testes e cobertura (JaCoCo) e enviar para o SonarCloud, que aplica o Quality Gate do projeto.

2) O que o CI executa (ex.: GitHub Actions)

- 2.1 Checkout do código e configuração do JDK/Gradle.
- 2.2 Execução do build principal: `./gradlew clean build` — compila código e executa todos os testes (`test`, `chapter01` … `chapter06`).
- 2.3 Geração dos relatórios de cobertura (JaCoCo) usados na análise.
- 2.4 Execução do scanner Sonar: `./gradlew sonar` (o job passa o token/variáveis necessárias via secrets).
- 2.5 O workflow falha ou sinaliza problemas no PR caso o Quality Gate não seja atendido.

3) Como rodar a análise localmente (passos)

- 3.1 Gerar build e cobertura localmente:

```bash
./gradlew clean build
./gradlew jacocoTestReport   # se configurado no build
```

- 3.2 Enviar a análise ao SonarCloud (requer token com permissão):

```bash
./gradlew sonar -Dsonar.login=<SONAR_TOKEN>
```

- 3.3 Observação: o envio local só funcionará se o projeto estiver configurado com as propriedades `sonar.*` corretas (host, organization) e o token estiver disponível. Em ambientes CI, essas propriedades/segredos costumam ser fornecidos pelo workflow.

4) Onde ver os resultados

- 4.1 Relatório JaCoCo (HTML) gerado localmente em: `build/reports/jacoco/test/html/index.html` (caminho padrão do Gradle/JaCoCo).
- 4.2 Painel do SonarCloud (web) mostra métricas agregadas: cobertura, bugs, vulnerabilities, code smells e o status do Quality Gate.
- 4.3 O PR no GitHub mostra o badge/feedback do SonarCloud quando o workflow completa.

5) Troubleshooting (problemas comuns)

- 5.1 Falha ao rodar `./gradlew sonar`: verifique se `SONAR_TOKEN` está configurado e se as propriedades `sonar.host.url` e `sonar.organization` estão corretas.
- 5.2 Erros de build no CI: reexecutar localmente com `--stacktrace --info` para obter detalhes:

```bash
./gradlew clean build --info --stacktrace
```

- 5.3 Se a cobertura estiver abaixo do esperado, abra o relatório JaCoCo localmente para identificar classes não cobertas e adicione/ajuste testes.
- 5.4 Problemas de rede/timeout ao enviar para SonarCloud: checar conectividade e limites de uso da organização.

6) Boas práticas

- 6.1 Rodar `./gradlew clean build` localmente antes de abrir PR para reduzir ciclos de CI falhos.
- 6.2 Incluir no PR notas sobre quaisquer passos extras necessários para reproduzir a análise (ex.: necessidades de secrets, fluxos alternativos).

Seguindo estes passos, a integração Gradle + SonarCloud fica previsível e debuggable tanto localmente quanto no CI.

## ⚠️ Observações Importantes

- ❌ Nunca trabalhar diretamente na branch `main`
- ❌ Nenhuma branch sem Issue associada
- ✅ Preferir commits pequenos e bem descritos
- 📚 O histórico de commits, Issues e tags faz parte do material de estudo

## 📖 Referências

- [Oracle Certified Associate (OCA) Java SE 8](https://education.oracle.com/java-se-8-programmer-i/pexam_1Z0-808)
- [Java SE 8 Documentation](https://docs.oracle.com/javase/8/docs/)
- [Guia de Estudos OCA Java SE 8](docs/) (material interno)
- [Gradle User Manual](https://docs.gradle.org/current/userguide/userguide.html)

## 🤝 Contribuindo

Contribuições são bem-vindas! Para contribuir:

1. Faça um **fork** deste repositório
2. Crie uma **Issue** descrevendo o tópico de estudo
3. Crie um **branch** a partir da `main` (`dev-<name>/issue-<#number>`)
4. Faça **commit** das suas mudanças
5. Abra um **Pull Request** referenciando a Issue

## 📝 Changelog

### 🆕 Versão 0.8
- **Capítulo 6** em `oca/chapter06/arrays`: arrays unidimensionais (`ArrayOneDimensional`, `Clock`), multidimensionais (`ArrayMultiDimensional`), e material `chapter06Exam.txt` (issue #38, PR #39).
- Testes `oca.chapter06.*`, suite Gradle `chapter06` e inclusão em `check` junto com `chapter01` … `chapter05`.
- Cobertura ampliada (ex.: classe `Clock`) e exercícios/testes com `ArrayList` e arrays de primitivos.

### 📌 Versão 0.7
- README: seção **Conteúdos Abordados** alinhada ao código em `src/main/java/oca/` (Caps. 1–5), com Cap. 2 em `instructions`, Cap. 5 em `methods`, e nota sobre o espelho em `app/` e o escopo do Sonar (`src/`).
- README: tasks Gradle documentadas até `chapter05`; fluxo Sonar/Gradle e tags de capítulo atualizados.
- Hashtags e meta keywords revisadas (caps. 3–5, métodos, sobrecarga, herança introdutória).
- Merge **PR #37** (issue #36): expansão do Cap. 5 com exemplos e testes de construtores, `this`/`super`, escopo, variáveis de instância e estáticas.

### 📌 Versão 0.6
- Código em `src/main/java/oca/` para capítulos 3 (operadores), 4 (primitivos, objetos, enums, exercício) e 5 (métodos, sobrecarga, herança introdutória), com testes `oca.chapter03.*` … `oca.chapter05.*`.
- `build.gradle` na raiz: tasks `chapter03`, `chapter04`, `chapter05` e `check` dependente dessas suites.
- README e metadados sociais ajustados na mesma linha de release (conteúdo, CI, descoberta).

### 📌 Versão 0.5
- README: seção **Conteúdos Abordados** reorganizada por capítulo e alinhada ao que existe em `app/src/main/java` (Cap. 1 e Cap. 2, qualidade de código, itens ainda pendentes na trilha OCA)
- README: badges agrupados (repositório, SonarCloud, GitHub Actions incluindo CodeQL, Wakatime)
- Hashtags e meta keywords atualizadas (Log4j2, enums, arrays, CodeQL, estudo colaborativo)

### 📌 Versão 0.4
- Adição do Capítulo 2 em `chapter02/primitives` (exemplos de variáveis, operadores, controle de fluxo, enums, laços, exercícios com `String`/`ArrayList`)
- Testes automatizados do Capítulo 2 (JUnit 5) e task Gradle `chapter02` (`./gradlew chapter02`)
- Documentação: `docs/chapter02/annotations.txt` e `chapter02Exame.txt` (simulado)
- Pipeline **JaCoCo + SonarCloud** (plugins `jacoco` e `org.sonarqube`, workflow `SonarCloud Analyze`, `./gradlew build sonar`)

### 📌 Versão 0.3
- Interface `Planet` no pacote `exercise02` (Earth, Mars, Venus implementam a interface)
- Testes automatizados com JUnit 5: `ImportAndCompileTest` para `Exercise01Import` e `Exercise02Compile`
- Task Gradle `chapter01` para executar apenas os testes do Capítulo 1 (`./gradlew chapter01`)
- Documentação: `docs/chapter01/article.txt` (artigo do Capítulo 1: plataforma, empacotamento, compilação)
- Tecnologias: migração de JUnit 4 para JUnit 5 (Jupiter)

### 📌 Versão 0.2
- Exemplos do Capítulo 1 em subpacotes: `exemple01`–`exemple06` (pacotes, imports, interfaces, propriedades)
- Exercícios: `exercise01` (imports), `exercise02` (compilação e pacote `planets`: Earth, Mars, Venus)
- Material complementar em `plus/` (StringTokenizer)
- Recursos em `app/src/main/resources/oca/chapter01/fundamentals/` (logs, propriedades, instruções)
- Documentação em `docs/` e anotações em `chapterExam.txt`
- CI com GitHub Actions (Gradle build e dependency submission)
- Fluxo de trabalho documentado

### 📌 Versão 0.1
- Primeiro workflow **GitHub Actions** (`gradle.yml`) com **Java 8** no runner e ajustes para build estável no CI
- Inclusão do **Gradle Wrapper** (`gradle-wrapper.jar`) e primeira configuração de **JUnit 4** no `build.gradle`
- Ajustes de imagens e recursos do projeto para pastas adequadas (`resources`)

### 📌 Versão 0.0
- Bootstrap do repositório com estrutura **Gradle** e material de tutorial em `docs/` (issue #1)
- Arquivos de build iniciais, **`.gitattributes`** e regras base no **`.gitignore`** para o ecossistema Gradle

## 📄 Licença

Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

### 🔎 Hashtags

#Java #OCA #OracleCertification #JavaSE8 #1Z0808 #Certification #Study #Learning #Gradle #JUnit5 #JaCoCo #SonarCloud #SonarQube #CodeQL #GitHubActions #CI #Log4j2 #Chapter03 #Chapter04 #Chapter05 #Chapter06 #Operators #Methods #MethodOverloading #Inheritance #ThisKeyword #SuperKeyword #StaticMembers #Enums #JavaArrays #MultidimensionalArrays #ArrayList #Primitives #Wrappers #OpenSource #Backend #CollaborativeStudy

### 🧠 Meta Keywords

```
java oca, 1z0-808, oracle certified associate, java se 8 programmer i, certificação java,
estudos java, preparação oca, guia oca, exemplos java, exercícios oca,
oca chapter01, oca chapter02, oca chapter03, oca chapter04, oca chapter05, oca chapter06,
gradle, junit 5, testes unitários, jacoco, cobertura de código,
sonarcloud, sonarqube, quality gate, code smells, análise estática,
github actions, codeql, segurança de código, ci cd,
log4j2, enums, switch string, arraylist, arrays java, array multidimensional, array bidimensional,
arrays de objetos, arrays de primitivos, controle de fluxo, primitivos, operadores java,
precedência de operadores, wrappers java, object java, sobrecarga de métodos, method overloading,
herança java, inheritance java, this java, super java, static java, métodos java,
programação java, backend, aprendizado colaborativo, open source
```

<div align="center">
<br>
<a href="https://ko-fi.com/henriqueotogami/tip" target="_blank"><img width="500" src="https://github.com/henriqueotogami/road-to-java-oca/blob/main/src/main/resources/images/kofi-henrique-otogami.jpg?raw=true" alt="Apoie no Ko-fi"></a>
<br><br>
<a href="https://ko-fi.com/henriqueotogami" target="_blank"><img src="https://cdn.ko-fi.com/cdn/kofi3.png?v=3" alt="Apoie o Projeto" style="height:50px;"></a>
<br><br>
<a href="https://dev.to/henriqueotogami" target="_blank"><img src="https://img.shields.io/badge/Dev.to-0A0A0A?style=for-the-badge&logo=dev.to&logoColor=white" alt="Dev.to"></a>
<a href="https://medium.com/@henriqueotogami" target="_blank"><img src="https://img.shields.io/badge/Medium-12100E?style=for-the-badge&logo=medium&logoColor=white" alt="Medium"></a>
<a href="https://ko-fi.com/henriqueotogami/tip" target="_blank"><img src="https://img.shields.io/badge/Ko--fi-FF5E5B?style=for-the-badge&logo=ko-fi&logoColor=white" alt="Ko-fi"></a>
<a href="https://www.linkedin.com/in/henrique-matheus-alves-pereira" target="_blank"><img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn"></a>
<a href="https://instagram.com/henriqueotogami.dev" target="_blank"><img src="https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white" alt="Instagram"></a>
<br>
</div>