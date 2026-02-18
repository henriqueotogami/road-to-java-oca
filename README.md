# ☕ Estudos Java OCA - Oracle Certified Associate

> Repositório destinado a **estudos colaborativos para a certificação Java OCA (Oracle Certified Associate)**.

<div align="center">
<a href="#" style="display:inline-block;padding:4px 12px;background:#0366d6;color:#fff;border-radius:4px;text-decoration:none;font-weight:bold;font-size:15px;">README v0.2</a>
</div>
<br>
<div align="center">
<img width="500" src="https://github.com/henriqueotogami/road-to-java-oca/blob/main/app/src/main/resources/images/rounded-header-otogami.png?raw=true">
</div>
<br>
<div align="center">
<img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/henriqueotogami/road-to-java-oca">
<img src="https://img.shields.io/github/checks-status/henriqueotogami/road-to-java-oca/main">
<img src="https://img.shields.io/github/issues/henriqueotogami/road-to-java-oca">
</div>
<br>
<div align="center">
<img src="https://img.shields.io/github/forks/henriqueotogami/road-to-java-oca?style=flat">
<img src="https://img.shields.io/github/stars/henriqueotogami/road-to-java-oca?style=flat">
<img src="https://img.shields.io/github/license/henriqueotogami/road-to-java-oca">
</div>
<div align="center">
<br>
<img src="https://img.shields.io/github/release-date/henriqueotogami/road-to-java-oca">
<a href="https://wakatime.com/badge/user/1e53636e-c916-4d50-9ce1-f3ac75a883e3/project/3a5e3f46-b18c-49e9-8b81-cda72611432d"><img src="https://wakatime.com/badge/user/1e53636e-c916-4d50-9ce1-f3ac75a883e3/project/3a5e3f46-b18c-49e9-8b81-cda72611432d.svg" alt="wakatime"></a>
</div>
<div align="center">
<br>
<a href="https://ko-fi.com/henriqueotogami" target="_blank">
  <img src="https://cdn.ko-fi.com/cdn/kofi3.png?v=3" alt="Apoie o Projeto" style="height:50px;">
</a>
</div>

## 📋 Sobre o Projeto

Este repositório contém uma coleção organizada de exemplos de código, exercícios e documentação para preparação do exame **Oracle Certified Associate (OCA) Java SE 8 Programmer I**. Os conteúdos seguem o guia oficial de estudos e incluem práticas de pacotes, imports, variáveis, controle de fluxo, OOP e demais tópicos cobrados na certificação.

O projeto utiliza **Gradle** para build e está estruturado por capítulos, facilitando a revisão para a prova e o estudo colaborativo em grupo.

## 📁 Estrutura do Projeto

### Código Fonte (`app/src/main/java/oca/`)

- **chapter01/fundamentals/** - Capítulo 1 (Fundamentos)
  - **exemple01/** - `Example01PackageImport` (pacotes)
  - **exemple02/** - `Example02SingleStaticImport` (import estático)
  - **exemple03/** - `Example03MultiStaticImport` (import estático múltiplo)
  - **exemple04/** - Interfaces e implementações (`Dockable`, `Ship`, `Spaceship`, `SpaceshipSimulator`)
  - **exemple05/** - `Example05GreetingsUniverse`
  - **exemple06/** - `Example06PropertiesManager` (propriedades do sistema)
  - **exercise01/** - `Exercise01Import` (exercício de imports)
  - **exercise02/** - `Exercise02Compile` e pacote **planets/** (`Earth`, `Mars`, `Venus`)
  - **plus/** - `Study01StringTokenizer` (material complementar)
- **chapter01/** - `chapterExam.txt` (anotações do exame)

### Documentação (`docs/`)

- **chapter01/** - Anotações do Capítulo 1
  - `packaging-compiler-interpretation.txt` - Empacotamento, compilação e interpretação
- `how-to-manage-branches.txt` - Fluxo de branches e trabalho colaborativo
- `issue-1.txt` - Registro de issues

### Recursos (`app/src/main/resources/`)

- **oca/chapter01/fundamentals/** - Arquivos de apoio (logs, propriedades, instruções)
  - `Example06PropertiesManager.log`, `Example06SystemProperties.txt`, `Exercise02Compile.txt`
- **images/** - Imagens e assets do projeto (header, Ko-fi)

## 📂 Estrutura do Repositório

```
road-to-java-oca/
├── LICENSE
├── README.md
├── .gitignore
├── build.gradle
├── settings.gradle
│
├── app/
│   ├── build.gradle
│   └── src/
│       ├── main/
│       │   ├── java/
│       │   │   ├── oca/
│       │   │   │   └── chapter01/
│       │   │   │       ├── chapterExam.txt
│       │   │   │       └── fundamentals/
│       │   │   │           ├── exemple01/Example01PackageImport.java
│       │   │   │           ├── exemple02/Example02SingleStaticImport.java
│       │   │   │           ├── exemple03/Example03MultiStaticImport.java
│       │   │   │           ├── exemple04/Example04Dockable.java, Ship, Spaceship, SpaceshipSimulator.java
│       │   │   │           ├── exemple05/Example05GreetingsUniverse.java
│       │   │   │           ├── exemple06/Example06PropertiesManager.java
│       │   │   │           ├── exercise01/Exercise01Import.java
│       │   │   │           ├── exercise02/Exercise02Compile.java
│       │   │   │           ├── exercise02/planets/Earth.java, Mars.java, Venus.java
│       │   │   │           └── plus/Study01StringTokenizer.java
│       │   │   └── org/example/App.java
│       │   └── resources/
│       │       └── oca/chapter01/fundamentals/
│       │           ├── Example06PropertiesManager.log
│       │           ├── Example06SystemProperties.txt
│       │           └── Exercise02Compile.txt
│       └── test/java/org/example/AppTest.java
│
├── docs/
│   ├── chapter01/
│   │   └── packaging-compiler-interpretation.txt
│   ├── how-to-manage-branches.txt
│   └── issue-1.txt
│
└── .github/
    ├── FUNDING.yml
    └── workflows/
        └── gradle.yml
```

## 🛠️ Tecnologias Utilizadas

- **Java 8 (SE)** - Linguagem e versão alvo da certificação OCA
- **Gradle** - Build e gerenciamento de dependências
- **JUnit 4** - Testes unitários
- **Git** - Controle de versão e fluxo colaborativo
- **GitHub Actions** - CI (build e dependency submission)

## 🚀 Como Usar

### Pré-requisitos

- [Java 8 JDK](https://adoptium.net/) ou superior
- [Gradle](https://gradle.org/install/) (ou use o wrapper: `./gradlew`)

### Clonar e Executar

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

## 📚 Conteúdos Abordados

- ✅ Empacotamento e estrutura de pacotes em Java
- ✅ Compilação e interpretação (javac, JVM, bytecode)
- ✅ Imports (single, static, multi)
- ✅ Interfaces e implementações
- ✅ Propriedades do sistema (`-D`, `System.getProperty`)
- ✅ Exercícios de compilação e pacotes (ex.: `planets`)
- ✅ Boas práticas de versionamento (branches, issues, tags)
- 🔲 Variáveis e tipos de dados
- 🔲 Operadores
- 🔲 Controle de fluxo
- 🔲 Arrays
- 🔲 Métodos e encapsulamento
- 🔲 Herança e polimorfismo
- 🔲 Exceções
- 🔲 APIs fundamentais (String, etc.)

## 🌿 Fluxo de Trabalho

### Estrutura de Branches

```
main
  |
  |____ dev-1
  |____ dev-2
  |____ dev-3
```

### `main`
- Branch principal e consolidada do repositório
- Representa o estado atual do aprendizado do grupo
- Contém apenas código revisado e validado
- ❌ **Não é permitido commit direto**

### `dev-1` / `dev-2` / `dev-3`
- Branches individuais dos integrantes
- Criadas **exclusivamente** para atender uma Issue
- Devem sempre ser criadas a partir da `main`

### 🐞 Issues (Obrigatórias)

- Toda task de estudo **deve começar com uma Issue**
- ❌ Nenhuma branch pode ser criada sem Issue associada
- A Issue deve descrever: tópico, objetivo e escopo

### Padrão de Nomenclatura

**Branches:** `dev-1/issue-12-variaveis`, `dev-2/issue-15-arrays`  
**Tags (task):** `task-01-variaveis`, `task-02-operadores`  
**Tags (capítulo):** `cap-01-fundamentos`, `cap-02-java-basico`

### Fluxo Completo

1. Criar **Issue** descrevendo a task
2. Criar branch individual a partir da `main`
3. Desenvolver e estudar na branch
4. Abrir **Pull Request** para `main` ao concluir
5. Revisar em grupo
6. Merge → fechar Issue → criar **tag**

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
3. Crie um **branch** a partir da `main` (`dev-X/issue-N-topico`)
4. Faça **commit** das suas mudanças
5. Abra um **Pull Request** referenciando a Issue

## 📝 Changelog

### Versão 0.2
- Exemplos do Capítulo 1 em subpacotes: `exemple01`–`exemple06` (pacotes, imports, interfaces, propriedades)
- Exercícios: `exercise01` (imports), `exercise02` (compilação e pacote `planets`: Earth, Mars, Venus)
- Material complementar em `plus/` (StringTokenizer)
- Recursos em `app/src/main/resources/oca/chapter01/fundamentals/` (logs, propriedades, instruções)
- Documentação em `docs/` e anotações em `chapterExam.txt`
- CI com GitHub Actions (Gradle build e dependency submission)
- Fluxo de trabalho documentado

## 📄 Licença

Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

### Hashtags

#Java #OCA #OracleCertification #JavaSE8 #Certification #Study #Learning #Gradle #OpenSource #GitHub #Programming #Backend

### Meta Keywords

```
java oca, oracle certified associate, java se 8, certificação java, 
estudos java, preparação oca, gradle, programação java, backend, 
aprendizado, boas práticas, versionamento, colaborativo
```

<div align="center">
<br>
<a href="https://ko-fi.com/henriqueotogami/tip" target="_blank"><img width="500" src="https://github.com/henriqueotogami/road-to-java-oca/blob/main/app/src/main/resources/images/kofi-henrique-otogami.jpg?raw=true" alt="Apoie no Ko-fi"></a>
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