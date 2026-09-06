# Resumo da PR #43 - Rollback Log4j 2.25.4

## 🎯 Objetivo

Reverter as dependências do Log4j para a versão **2.25.4** no arquivo `build.gradle` para desbloquear a pipeline de CI, especificamente a etapa de análise com SonarCloud que estava falhando.

## 📝 Mudanças Realizadas

### Dependências Atualizadas
```gradle
implementation 'org.apache.logging.log4j:log4j-api:2.25.4'
implementation 'org.apache.logging.log4j:log4j-core:2.25.4'
```

Essas mudanças restauram a versão estável anterior do Log4j que era compatível com o pipeline de CI e SonarCloud.

## 🔍 Problemas Identificados

### 1. **Log4j com SonarCloud**
- **Situação**: A pipeline de CI falhou na etapa de análise (Sonar) com uma versão mais recente do Log4j
- **Solução**: Revert para 2.25.4 como medida temporária
- **Status**: Rollback implementado nesta PR

### 2. **Deprecações em GitHub Actions** ⚠️
Foram identificados os seguintes problemas de deprecação nas workflows:

#### Node.js 20 Deprecado
```
Node.js 20 is deprecated. The following actions target Node.js 20 but are being forced to run on Node.js 24:
- actions/cache@v4
- actions/checkout@v3
- actions/setup-java@v3
```

**Impacto**: Essas ações deixarão de funcionar em breve. É necessário atualizar para versões mais recentes.

#### setup-java v3 Deprecado
```
setup-java v3 is deprecated and will no longer receive updates. 
Please migrate to actions/setup-java@v5.
```

**Impacto**: A workflow `sonar.yml` está usando `actions/setup-java@v3`, que não receberá mais atualizações.

## 📋 Status das Workflows

### sonar.yml (Precisa de Atualização)
| Ação | Versão Atual | Versão Recomendada | Status |
|------|-------------|-------------------|--------|
| actions/checkout | v3 ❌ | v4 | Desatualizado |
| actions/setup-java | v3 ❌ | v5 | Desatualizado |
| actions/cache | v4 ⚠️ | v4 (Node 24) | Compatível |

### gradle.yml (Atualizado)
✅ Já está usando versões recentes:
- `actions/checkout@v4`
- `actions/setup-java@v4`
- `gradle/actions/setup-gradle@v4`
- `gradle/actions/dependency-submission@v4`

## 🚀 Próximas Ações Necessárias

### Curto Prazo (Esta PR)
- [x] Revert Log4j para 2.25.4
- [x] Validar que o build passa localmente
- [x] Documentar mudança como rollback temporário

### Médio Prazo (Próximas PRs)
- [ ] Atualizar `.github/workflows/sonar.yml`:
  - Migrar `actions/checkout@v3` → `actions/checkout@v4`
  - Migrar `actions/setup-java@v3` → `actions/setup-java@v5`
- [ ] Testar workflows após atualização
- [ ] Validar compatibilidade com Node.js 24

### Longo Prazo
- [ ] Investigar incompatibilidade entre Log4j recente e SonarCloud
- [ ] Planejar atualização segura do Log4j quando possível
- [ ] Revisar riscos de segurança das versões anteriores
- [ ] Criar issue de acompanhamento para mitigação de riscos

## ✅ Critérios de Aceitação

- [x] Build.gradle atualizado com Log4j 2.25.4
- [x] Pipeline de CI (Sonar) passando com a nova configuração
- [ ] Problemas de deprecação documentados para ação futura
- [ ] Issue de acompanhamento criada (relacionado a #43)

## ⚠️ Observações Importantes

1. **Rollback Temporário**: Esta é uma medida de mitigação rápida. A versão 2.25.4 pode ter vulnerabilidades que foram corrigidas em versões mais recentes.

2. **Deprecações Críticas**: As deprecações das GitHub Actions devem ser tratadas em uma PR separada para evitar quebras futuras na CI.

3. **Segurança**: Revisar políticas de segurança da organização para garantir que a regressão de versão não viola requisitos de compliance.

4. **Próximo Passo**: Após merge desta PR, criar issue dedicada para:
   - Diagnosticar root cause da incompatibilidade com versão nova do Log4j
   - Atualizar GitHub Actions
   - Planejar upgrade seguro do Log4j

## 📚 Referências

- [Node.js 20 Deprecation Notice](https://github.blog/changelog/2025-09-19-deprecation-of-node-20-on-github-actions-runners/)
- [Actions Setup Java v5](https://github.com/actions/setup-java)
- [Issue #43](https://github.com/henriqueotogami/road-to-java-oca/issues/43)
