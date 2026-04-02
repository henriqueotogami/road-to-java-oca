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

### 📦 Clonar e Executar

1. **Clone o repositório:**
```bash
git clone https://github.com/henriqueotogami/road-to-java-oca.git
cd road-to-java-oca
```

2. **Compile o projeto:**
```bash
./gradlew build
```

3. **Execute exemplos específicos:**
```bash
# Via Gradle (classe principal padrão)
./gradlew run

# Ou diretamente com Java (exemplo de Properties)
./gradlew :app:compileJava
java -cp app/build/classes/java/main oca.chapter01.fundamentals.exemple06.Example06PropertiesManager -list_all
```

4. **Execute os testes:**
```bash
./gradlew test
```

5. **Execute apenas os testes do Capítulo 1:**
```bash
./gradlew chapter01
```

6. **Execute apenas os testes do Capítulo 2:**
```bash
./gradlew chapter02
```

## 📚 Conteúdos Abordados

**Capítulo 1 (`oca/chapter01`)**

- ✅ Empacotamento e estrutura de pacotes em Java
- ✅ Compilação e interpretação (javac, JVM, bytecode)
- ✅ Imports (simples, estático, múltiplo)
- ✅ Interfaces e implementações
- ✅ Propriedades do sistema (`-D`, `System.getProperty`)
- ✅ Exercícios de compilação, classpath e subpacotes
- ✅ Material complementar (`StringTokenizer`)

**Capítulo 2 (`oca/chapter02/primitives`)**

- ✅ Variáveis e tipos (primitivos, wrappers, conversões)
- ✅ Operadores (atribuição, aritméticos, incremento/decremento, lógicos)
- ✅ Estruturas condicionais (`if`/`else`, ternário, `switch` com `String` e com enum)
- ✅ Laços (`for`, `for` aprimorado, `while`, `do-while`)
- ✅ Enums e mapeamento id/nome para constantes
- ✅ Arrays de primitivos e iteração
- ✅ Introdução a coleções (`ArrayList` no exercício)
- ✅ Palavras-chave de transferência de controle (`break`, `continue`, `return` nos exemplos)
- ✅ Asserções (`assert`) em código didático
- ✅ Logging com **Log4j2** nos exemplos

**Repositório e qualidade**

- ✅ Testes automatizados por capítulo (JUnit 5, tasks `chapter01` / `chapter02`)
- ✅ Cobertura **JaCoCo** e análise **SonarCloud** (Quality Gate e métricas no CI)
- ✅ **GitHub Actions** (build Gradle, workflow Sonar; badge de **CodeQL** no README)
- ✅ Boas práticas de versionamento (branches, issues, tags)

**Ainda não coberto no código (próximos capítulos OCA)**

- 🔲 Métodos e encapsulamento (tópico completo)
- 🔲 Herança e polimorfismo
- 🔲 Exceções (tratamento e hierarquia em profundidade)
- 🔲 APIs fundamentais (`String`, `StringBuilder`, datas, etc.)

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
**Tags (capítulo):** `chapter01`, `chapter02`

### 🔁 Fluxo Completo

1. Criar **Issue** descrevendo a task
2. Criar branch individual a partir da `main`
3. Desenvolver e estudar na branch
4. Garantir que os testes passem localmente e que a cobertura de testes unitários esteja **≥ 80%** (ver relatórios JaCoCo e painel do SonarCloud)
5. Abrir **Pull Request** para `main` ao concluir
6. Aguardar o GitHub Actions rodar `./gradlew build sonar` e verificar o **Quality Gate** do SonarCloud (cobertura ≥ 80%, ausência de novos bugs críticos e code smells bloqueantes)
7. Revisar em grupo
8. Merge → fechar Issue → criar **tag**

### 🔗 Integração Gradle + SonarCloud no fluxo

- **Commits e Pull Requests** para qualquer branch disparam o workflow `SonarCloud Analyze` no GitHub Actions.
- Esse workflow executa os scripts Gradle configurados no projeto:
  - `./gradlew build` → compila o código, roda os testes (`test`, `chapter01`, `chapter02`) e gera o relatório de cobertura do **JaCoCo**.
  - `./gradlew sonar` → usa o plugin `org.sonarqube` para enviar código, métricas e o relatório do JaCoCo para o **SonarCloud**.
- O resultado aparece no painel do SonarCloud, que aplica o **Quality Gate** (incluindo a regra de cobertura ≥ 80%) e sinaliza no PR se o código está ou não em conformidade com os critérios de qualidade.

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

### 🆕 Versão 0.5
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

## 📄 Licença

Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

### 🔎 Hashtags

#Java #OCA #OracleCertification #JavaSE8 #1Z0808 #Certification #Study #Learning #Gradle #JUnit5 #JaCoCo #SonarCloud #SonarQube #CodeQL #GitHubActions #CI #Log4j2 #Enums #Arrays #OpenSource #Backend #CollaborativeStudy

### 🧠 Meta Keywords

```
java oca, 1z0-808, oracle certified associate, java se 8 programmer i, certificação java,
estudos java, preparação oca, guia oca, exemplos java, exercícios java,
gradle, junit 5, testes unitários, jacoco, cobertura de código,
sonarcloud, sonarqube, quality gate, code smells, análise estática,
github actions, codeql, segurança de código, ci cd,
log4j2, enums, switch string, arraylist, controle de fluxo, primitivos,
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