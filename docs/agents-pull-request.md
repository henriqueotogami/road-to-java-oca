# Guia: Como escrever uma Pull Request seguindo o padrão deste repositório

Objetivo
- Escrever PRs claras, focadas em: refatoração para testabilidade, remoção de dependências de estado/efeitos colaterais, separação de geração aleatória da lógica de negócio, adição/ajuste de testes e limpeza de artefatos (logs).
- Garantir que a PR explique intenção, mudanças e como validar (testes/execução).

Estrutura recomendada da descrição (use títulos e seções)
1. Título curto e objetivo (uma linha)
   - Ex.: "📌 Implementação da Issue #27 — Refatoração para testabilidade"

2. Seção "🎯 Objetivo" (2–4 frases)
   - Explique por que a mudança é necessária (ex.: aumentar cobertura, melhorar análise no SonarCloud, tornar métodos determinísticos).
   - Cite a issue relacionada (ex.: "Issue relacionada: #27").

3. "🧱 Principais Alterações" — resumo por tópicos (cada item descreve *o que* e *por quê*)
   - Ex.: "Refatoração para permitir injeção de dependência (passar FishingSession como parâmetro em vez de criar internamente)."
   - Ex.: "Isolamento da geração aleatória em método separado (getTypeOfCast(double random)) para permitir testes determinísticos."
   - Ex.: "Métodos que dependiam de estado interno agora recebem parâmetros (ex.: strangeBooleanCondition(boolean))."
   - Ex.: "Adição de método deleteFile(String path) para limpar logs gerados por testes."

4. "📁 Arquivos/áreas impactadas" — lista curta dos pacotes ou arquivos principais tocados
   - Ex.: src/main/java/.../Conditionals.java — mudança de assinatura e logs.
   - Ex.: src/main/java/.../FishingSession.java, FishingTrip.java — separação de lógica e DI.
   - Ex.: src/test/java/.../ExamplesTest.java — novos testes determinísticos.

5. "🧪 Testes" — explicar o que foi adicionado/alterado e como validar localmente
   - Indique quais cenários passaram a ser testados (ex.: todos os resultados possíveis da pesca: fish/shark/skate/no catch).
   - Indique comando para rodar testes (ex.: mvn test ou ./gradlew test).
   - Indique que a aleatoriedade foi substituída por entradas determinísticas nos testes.

6. "🗂 Logs e artefatos" — explicar limpeza/efeitos colaterais
   - Liste se há criação/remoção de arquivos de log e se existe utilitário para apagar (ex.: deleteFile).
   - Explique se os testes verificam a remoção de arquivos.

7. "✅ Checklist de revisão" — itens que facilitam a revisão
   - [ ] PR tem título claro e issue referenciada.
   - [ ] Mudanças estão bem descritas em "Principais Alterações".
   - [ ] Métodos refatorados têm javadoc/comentários explicando nova assinatura.
   - [ ] Testes cobrem todos os caminhos críticos e são determinísticos.
   - [ ] Não há efeitos colaterais não documentados (arquivos, singletons, estado global).
   - [ ] Logs e artefatos temporários são apagados pelos testes.
   - [ ] Build local e CI passam (incluir link/resultado do CI se disponível).
   - [ ] Se relevante: atualizar README ou documentação que muda API/uso.

8. "📌 Exemplos e snippets" — sempre adicione exemplos mínimos quando mudar assinaturas públicas
   - Forneça um curto snippet de uso antes/depois da API quando aplicável.
   - Ex.: "Antes: strangeBooleanCondition(); Agora: strangeBooleanCondition(true);"

9. "ℹ️ Notas adicionais / Riscos"
   - Indique quaisquer trade-offs (ex.: mudança da forma de criação de objetos pode impactar código que esperava construção interna).
   - Indique se é necessário atualização em outros módulos.

Padrões de estilo da PR (tom e formatação)
- Use português claro e direto.
- Use emojis nos títulos principais para facilitar leitura (🎯, 🧱, 🧪, ✅).
- Inclua seções com cabeçalhos (##) e bullet lists.
- Use pequenos blocos de código para mostrar assinaturas ou exemplos.
- Mencione a milestone/labels quando relevante (ex.: "Milestone: Chapter02", label: enhancement).

Template mínimo (colável)
- Título: "📌 Pull Request #NN - <Resumo curto>"
- 🎯 Objetivo: <texto>
- 🧱 Principais Alterações:
  - <item 1 — o que e por quê>
  - <item 2 — o que e por quê>
- 📁 Arquivos/áreas impactadas:
  - <arquivo1>
  - <arquivo2>
- 🧪 Testes:
  - <quais casos, como rodar>
- 🗂 Logs/artefatos:
  - <o que foi adicionado/removido>
- ✅ Checklist:
  - [ ] …
- Issue relacionada: #<n>
- Labels sugeridas: enhancement, tests, refactor
- Milestone: <nome>

Observações específicas baseadas no padrão detectado nesta PR
- Quando refatorar código que usa randomness (SecureRandom), encapsule a geração em bloco try/catch e extraia um método que receba o valor aleatório como parâmetro para testes.
- Quando alterar assinaturas, atualize imediatamente todos os testes e forneça exemplos de chamada.
- Prefira permitir injeção de dependência (setters ou construtores) para facilitar mocks/stubs em testes.
- Adicione métodos utilitários para limpeza de arquivos gerados em testes e garanta que testes verifiquem essa limpeza.
- Documente mudanças de logging (remoção/adição de chamadas de logger) se isso afetar o output observado pelos testes.

Como os agentes devem operar ao redigir a PR
1. Leia a issue e resuma o objetivo no topo da PR.
2. Liste as alterações maiores e justifique cada uma (benefício para testes/qualidade).
3. Liste os arquivos alterados (ou as pastas) para quem revisar saber rapidamente o escopo.
4. Informe como validar (comandos de teste) e resultados esperados.
5. Inclua checklist e marque as ações já feitas (ex.: "CI: green", "Testes locais: ok").
6. Se pertinente, inclua screenshots, logs de CI ou trechos de saída de testes que ajudam a revisar.

Exemplo conciso (baseado no PR analisado)
- Título: "📌 Pull Request #28 - Implementação da Issue #27"
- 🎯 Objetivo: Aumentar cobertura de testes e melhorar análise SonarCloud; tornar métodos determinísticos e testáveis.
- 🧱 Principais Alterações:
  - strangeBooleanCondition(boolean) — recebe parâmetro para permitir testes.
  - wrapperBooleanCondition(Boolean) — recebe wrapper como argumento e adiciona logs.
  - FishingSession: encapsula SecureRandom com try/catch e extrai getTypeOfCast(double).
  - FishingTrip: separa lógica em getKindOfCast(String) e adiciona setFishingSession(FishingSession) para DI.
  - Adicionado deleteFile(String) e testes que validam remoção de logs.
- 🧪 Testes: Atualizados para usar valores determinísticos (0.20 → fish, 0.40 → shark, 0.60 → skate, 0.80 → no catch). Rode: mvn test
- ✅ Checklist: [X] Tests added, [X] CI passing, [X] Issue referenced (#27)

Fim do guia.