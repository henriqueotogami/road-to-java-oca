package oca.chapter07.inheritance.example03;

/**
 * Classe que representa um telefone fixo.
 * Esta classe implementa a interface Phone, fornecendo a funcionalidade de discagem e verificação de chamadas em andamento.
 *
 * @author henriqueotogami
 * @since 2026-08-27
 * @version 0.9
 */
public class LandlinePhone implements Phone{

    private boolean callInProgress = false;

    public void dialNumber(int number) {
        this.callInProgress = true;
        logger.info("Discando o numero: " + number);
        this.callInProgress = false;
    }

    public boolean isCallInProgress() { return callInProgress; }
}