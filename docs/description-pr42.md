# Pull Request #42 — Descrição (description-pr42.md)

Título
- 📌 Pull Request #42 - Chaper07 (capítulo 07: Herança)

🎯 Objetivo
- Adicionar exemplos e exercícios do Capítulo 07 (Herança) com classes, interfaces, classes abstratas e exemplos de sobrescrita e implementação múltipla.
- Fornecer testes que validem conceitos-chave (IS-A, sobrescrita, interfaces, classes abstratas) e melhorar cobertura de código para o capítulo.
- Milestone: chapter07

🧱 Principais Alterações (o que e por quê)
- Novos exemplos de herança de classe (example01): Animal, NewCat, NewDog, NewFish, NewHorse e classes "antigas" de comparação (OldCat, OldDog, OldHorse).
  - Justificativa: demonstrar relação IS-A, herança de métodos e sobrescrita.
- Exemplo de classes abstratas (example02): MusicPlayer + implementações CDPlayer e MP3Player.
  - Justificativa: mostrar a obrigatoriedade de implementar métodos abstratos e uso de métodos concretos (changeVolume).
- Exemplo de interfaces (example03): Phone interface, CellPhone e LandlinePhone.
  - Justificativa: demonstrar contrato de interface e implementação.
- Utilitários e estruturas de dados (example04, example05): ScoreBoard e PhoneBookEntry.
  - Justificativa: classes de suporte para usar em cenários de herança/composição.
- Exemplo de extensão e override (example06): Bicycle, TenSpeedBicycle e Run (classe de execução/demo).
  - Justificativa: demonstrar sobrescrita de métodos e comportamento configurável (gear ratio).
- Exemplo de hierarquia com comportamento sazonal (example07): Plant (abstrata), MapleTree e Tulip, e StartGrow (demo de execução).
  - Justificativa: ilustrar estados e métodos abstratos por estação.
- Exemplo de múltiplas interfaces (example08): Printer, Fax e PrinterFaxCombo (implementa ambas).
  - Justificativa: mostrar implementação múltipla e métodos default em interfaces.
- Testes: adição de um arquivo de testes extenso src/test/java/oca/chapter07/ExamplesTest.java cobrindo 15+ cenários.
  - Justificativa: validar conceitos e tornar o comportamento determinístico para CI.

📁 Arquivos/áreas impactadas (principais)
- src/main/java/oca/chapter07/inheritance/example01/* (Animal, NewCat, NewDog, NewFish, NewHorse, OldCat, OldDog, OldHorse)
- src/main/java/oca/chapter07/inheritance/example02/* (MusicPlayer, CDPlayer, MP3Player)
- src/main/java/oca/chapter07/inheritance/example03/* (Phone, CellPhone, LandlinePhone)
- src/main/java/oca/chapter07/inheritance/example04/ScoreBoard.java
- src/main/java/oca/chapter07/inheritance/example05/PhoneBookEntry.java
- src/main/java/oca/chapter07/inheritance/example06/* (Bicycle, TenSpeedBicycle, Run)
- src/main/java/oca/chapter07/inheritance/example07/* (Plant, MapleTree, Tulip, StartGrow)
- src/main/java/oca/chapter07/inheritance/example08/* (Printer, Fax, PrinterFaxCombo)
- src/test/java/oca/chapter07/ExamplesTest.java (novos testes)

🧪 Testes e como validar
- Rodar suíte de testes localmente: mvn test (ou comando de build do projeto).
- O conjunto de testes cobre:
  - Relações IS-A e métodos herdados (NewDog, NewCat).
  - Implementações de classe abstrata (MP3Player, CDPlayer).
  - Implementações de interface (CellPhone, LandlinePhone).
  - Comportamento de sobrescrita de métodos e configurações (TenSpeedBicycle).
  - Crescimento sazonal das plantas (MapleTree e Tulip) e comportamento esperado após as estações.
  - PrinterFaxCombo implementa múltiplas interfaces e métodos relevantes.
- Os testes são determinísticos e não dependem de aleatoriedade. Arquivos de teste acessam recursos locais simulados (ex.: File test-document.txt na verificação de impressão — não altera o repositório).

🗂 Logs e artefatos
- Nenhum arquivo de log permanente foi adicionado ao repositório.
- Testes criam objetos temporários (File test-document.txt em memória) mas não devem deixar artefatos no repositório.

✅ Checklist de revisão
- [ ] Título e objetivo claros com referência à milestone chapter07.
- [ ] Código segue padrão de exemplos didáticos (javadoc simples e logs informativos).
- [ ] Testes cobrem os caminhos principais e são determinísticos.
- [ ] Não há efeitos colaterais não documentados (arquivos gerados, singletons não intencionais).
- [ ] Build local e CI passam (incluir link do CI quando disponível).
- [ ] Labels: enhancement (já presente).

📌 Exemplos de uso / snippets (alterações de API pública quando aplicável)
- Phone:
  - Antes: — (nova interface)
  - Uso: CellPhone cell = new CellPhone(); cell.dialNumber(1199999999);
- TenSpeedBicycle:
  - ten.setGearRatio(3f); ten.pedalRPM(40f);

ℹ️ Notas e riscos
- Mudanças são majoritariamente adição de exemplos; impacto em código existente é mínimo.
- Revisores: atentar para imports duplicados de logger e consistência de javadoc.
- Se o projeto tiver regras de estilo/formatadores, poderá ser necessário rodar o formatter contra os novos arquivos.

---

Se desejar, posso:
- Atualizar a descrição da PR #42 diretamente com este conteúdo (se você conceder permissão ou eu tiver a API correta de edição de PRs), ou
- Criar um arquivo no repositório com este conteúdo (feito agora), e sugerir que cole o conteúdo no campo de descrição da PR.
