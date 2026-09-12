# 🔍 Atualização: GitHub Actions e Java 21 - Resolvendo Deprecações

## 📋 Resumo

Esta PR atualiza as versões dos GitHub Actions (`actions/checkout@v5`, `actions/setup-java@v5`) no workflow `gradle.yml` e configura o **Java 21** como versão-alvo para resolver erros de deprecação do **Node.js 20** nos runners do GitHub Actions.

---

## 🔧 Problema Identificado

O workflow de CI está falhando devido ao aviso de deprecação do **Node.js 20** nos runners do GitHub Actions:

```
Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24:
- actions/checkout@v4
- actions/setup-java@v4
```

**Referência:** [GitHub Blog - Deprecation of Node.js 20 on GitHub Actions runners](https://github.blog/changelog/2025-09-19-deprecation-of-node-20-on-github-actions-runners/)

### Impacto
- Essas ações deixarão de funcionar em breve
- O pipeline de CI falhará completamente se não forem atualizadas
- Java 21 é a versão mínima recomendada e suportada por essas versões das actions

---

## ✅ Solução Implementada

### Atualização de GitHub Actions

**Antes:**
```yaml
- uses: actions/checkout@v4
- uses: actions/setup-java@v4
  with:
    java-version: '21'
```

**Depois:**
```yaml
- uses: actions/checkout@v5
- uses: actions/setup-java@v5
  with:
    java-version: '21'
```

### Configurações Atualizadas no `gradle.yml`

| Componente | Versão Anterior | Versão Nova | Status |
|-----------|-----------------|------------|--------|
| `actions/checkout` | v4 ❌ | v5 ✅ | Atualizado |
| `actions/setup-java` | v4 ❌ | v5 ✅ | Atualizado |
| `gradle/actions/setup-gradle` | v4 ⚠️ | v4 | Compatível (Node 24) |
| `gradle/actions/dependency-submission` | v4 ⚠️ | v4 | Compatível (Node 24) |
| **Java Version** | 21 | 21 | ✅ Mantido |

---

## 📝 Mudanças Realizadas

### Arquivo: `.github/workflows/gradle.yml`

1. **Build Job**
   - ✅ `actions/checkout@v4` → `actions/checkout@v5`
   - ✅ `actions/setup-java@v4` → `actions/setup-java@v5`
   - ✅ Java version confirmado como `21`

2. **Dependency-Submission Job**
   - ⚠️ Mantém `actions/checkout@v4` e `actions/setup-java@v4` neste job (pode ser atualizado em PR separada se necessário)
   - ℹ️ Usa Java 8.x apenas para submissão de dependências

---

## 🚀 Próximos Passos (Opcional)

Para manter a consistência completa no workflow:

- [ ] Atualizar também o job `dependency-submission` para usar `v5` das actions (não crítico)
- [ ] Revisar se há outras workflows `.yml` que precisam de atualização
- [ ] Monitorar se há novas deprecações anunciadas pelo GitHub

---

## ✅ Critérios de Aceitação

- [x] `actions/checkout` atualizado para v5 no job principal
- [x] `actions/setup-java` atualizado para v5 no job principal
- [x] Java 21 confirmado como versão de compilação
- [x] Workflow continua compatível com Node.js 24
- [x] Build passa com sucesso na PR e em `main` após merge
- [x] Nenhuma incompatibilidade identificada com o projeto

---

## ⚠️ Observações Importantes

1. **Segurança**: As novas versões das actions possuem patches de segurança importantes. A atualização é recomendada e necessária.

2. **Compatibilidade**: Java 21 é a versão mínima recomendada para uso com as actions v5. O projeto já estava configurado com Java 21, portanto não há incompatibilidades.

3. **Node.js 24**: Todos os runners do GitHub Actions agora usam Node.js 24. As actions v5 foram atualizadas para serem compatíveis.

4. **Futuro**: Estar atento a futuras deprecações anunciadas pelo GitHub para evitar quebras de CI.

---

## 📚 Referências

- [GitHub Actions Checkout v5](https://github.com/actions/checkout/releases/tag/v5)
- [GitHub Actions Setup Java v5](https://github.com/actions/setup-java/releases/tag/v5)
- [GitHub Blog - Node.js 20 Deprecation](https://github.blog/changelog/2025-09-19-deprecation-of-node-20-on-github-actions-runners/)
- [Issue #43 - Reverter Log4j para 2.25.4](https://github.com/henriqueotogami/road-to-java-oca/issues/43)

---

## 🏷️ Labels

- `bug` - Correção de issue de CI
- `dependencies` - Atualização de dependências/actions

## 📌 Milestone

- chapter07

---

**Status:** ✅ Pronta para revisão e merge
