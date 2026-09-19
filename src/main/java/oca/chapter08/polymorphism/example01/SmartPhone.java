package oca.chapter08.polymorphism.example01;

public class SmartPhone extends Phone {

    public void sendEmail(String message, String address) {
        logger.info("SmartPhone: Sending Email");
        /* Lógica para enviar e-mail */
    }

    public String retrieveEmail() {
        logger.info("SmartPhone: Retrieving Email");
        String messages = new String();
        /* Retorna uma String contendo todas as mensagens*/
        return messages;
    }
    public boolean isRinging() {
        logger.info("SmartPhone: Checking if phone is ringing");
        boolean ringing = false;
        /* Procura atividade de e-mail e só continua quando ela não existe. */
        /* Verifica se o telefone está chamando e configura a variável ringing */
        return ringing;
    }
}
