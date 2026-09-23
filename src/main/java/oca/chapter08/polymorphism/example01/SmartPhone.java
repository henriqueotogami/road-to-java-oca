package oca.chapter08.polymorphism.example01;

public class SmartPhone extends Phone {

    private String emailAddress;
    private String emailMessage;

    public void sendEmail(String message, String address) {
        logger.info("SmartPhone: Sending Email");
        /* Lógica para enviar e-mail */
        this.emailAddress = address;
        this.emailMessage = message;
    }

    public String retrieveEmail() {
        logger.info("SmartPhone: Retrieving Email");
        /* Retorna uma String contendo todas as mensagens*/
        return this.emailMessage;
    }

    @Override
    public boolean isRinging() {
        logger.info("SmartPhone: Checking if phone is ringing");
        /* Procura atividade de e-mail e só continua quando ela não existe. */
        /* Verifica se o telefone está chamando e configura a variável ringing */
        return !this.acceptCall && this.ringing;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getEmailMessage() {
        return emailMessage;
    }
}
