# ☕ Estudos Java OCA - Oracle Certified Associate

> Este repositório é destinado a **estudos colaborativos para a certificação Java OCA**.
> 
> O fluxo de trabalho foi pensado para ser **simples, rastreável e adequado a um ambiente de aprendizado**, mantendo boas práticas de versionamento sem burocracia desnecessária.

<div align="center">
<img width="500" src="https://github.com/henriqueotogami/road-to-java-oca/blob/main/resources/images/rounded-header-otogami.png?raw=true">
</div>
<br>
<div align="center">
<img src="https://img.shields.io/github/release-date/henriqueotogami/road-to-java-oca">
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
<div style="text-align:center">
  <a href="https://ko-fi.com/henriqueotogami" target="_blank">
    <img src="https://cdn.ko-fi.com/cdn/kofi3.png?v=3" alt="Apoie o Projeto" style="height:50px;">
  </a>
</div>
</div>
<div align="center">
<br>
<a href="https://wakatime.com/badge/user/1e53636e-c916-4d50-9ce1-f3ac75a883e3/project/3a5e3f46-b18c-49e9-8b81-cda72611432d"><img src="https://wakatime.com/badge/user/1e53636e-c916-4d50-9ce1-f3ac75a883e3/project/3a5e3f46-b18c-49e9-8b81-cda72611432d.svg" alt="wakatime"></a>
</div>

---

## 📂 Estrutura de Branches

    main
    |
    |____ dev-1
    |____ dev-2
    |____ dev-3

---

## 🌱 Descrição das Branches

### `main`
- Branch principal e central do repositório
- Representa o **estado atual e consolidado do aprendizado do grupo**
- Contém apenas código revisado e validado
- Todos os merges acontecem nesta branch
- ❌ **Não é permitido commit direto**

### `dev-1 / dev-2 / dev-3`
- Branches individuais de cada integrante
- Criadas **exclusivamente** para atender uma Issue
- Usadas para estudo, testes e experimentação
- Devem sempre ser criadas a partir da `main`

---

## 🐞 Issues (Obrigatórias)

- Toda task de estudo **deve começar com a criação de uma Issue**
- ❌ Nenhuma branch pode ser criada sem uma Issue associada
- A Issue deve descrever claramente:
    - o tópico de estudo
    - o objetivo da task
    - o escopo do que será implementado
- As Issues representam o **backlog de estudo** do grupo

---

## 🌿 Padrão de Nomenclatura de Branches

As branches devem referenciar o número da Issue correspondente.

**Padrão sugerido:**

    dev-1/issue-12-variaveis
    dev-2/issue-15-arrays
    dev-3/issue-18-controle-fluxo

---

## 🔁 Fluxo de Trabalho

1. Criar uma **Issue** descrevendo a task de estudo
2. Criar a branch individual a partir da `main`, vinculada à Issue
3. Desenvolver e estudar normalmente na branch individual
4. Ao concluir a task:
    - abrir um **Pull Request** para a `main`
    - referenciar a Issue correspondente
5. Revisar em grupo
6. Após aprovação:
    - realizar o merge na `main`
    - fechar a Issue
    - criar uma **tag** indicando a finalização da task
7. Ao finalizar um capítulo ou marco importante:
    - criar uma **tag de capítulo** na `main`

---

## 🏷️ Uso de Tags (Finalização de Tasks)

- Toda task concluída e validada deve ser marcada com uma tag
- As tags devem ser criadas **após o merge na `main`**
- As tags representam pontos de revisão e consolidação do estudo

### Padrão sugerido de tags

Por task:

    task-01-variaveis
    task-02-operadores
    task-03-controle-de-fluxo
    task-04-arrays
    task-05-classes-e-metodos

Por capítulo:

    cap-01-fundamentos
    cap-02-java-basico
    cap-03-oo

---

## 🎯 Objetivo do Fluxo

- Manter o repositório simples e organizado
- Garantir rastreabilidade entre **Issue → Branch → PR → Tag**
- Facilitar revisões futuras para a prova OCA
- Estimular boas práticas de versionamento desde o início

---

## ⚠️ Observações Importantes

- ❌ Nunca trabalhar diretamente na branch `main`
- ❌ Nenhuma branch sem Issue
- ✅ Preferir commits pequenos e bem descritos
- 📚 O histórico de commits, Issues e tags faz parte do material de estudo

## Licença
Este projeto está licenciado sob a MIT License — veja `LICENSE`.

## Autor
Henrique Otogami

<div align="center">
<br>
<a href="https://ko-fi.com/henriqueotogami/tip" target="_blank"><img width="500" src="https://github.com/henriqueotogami/road-to-java-oca/blob/main/resources/images/kofi-henrique-otogami.jpg?raw=true"></a>
</div>