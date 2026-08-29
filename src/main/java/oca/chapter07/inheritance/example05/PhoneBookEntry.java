package oca.chapter07.inheritance.example05;

/**
 * Classe que representa uma entrada na agenda telefônica.
 * Esta classe fornece métodos para obter e definir o nome, número de telefone e a última atualização da entrada.
 *
 * @author henriqueotogami
 * @since 2026-08-29
 * @version 0.9
 */
public class PhoneBookEntry {

    private String name = "";
    private int phoneNumber = 0;
    private long lastUpdate = 0;

    public String getName() {
        return name;
    }

    public void setNameNumber(String name,int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        lastUpdate = System.currentTimeMillis();
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        lastUpdate = System.currentTimeMillis();
    }

}
