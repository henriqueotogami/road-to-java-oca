package oca.chapter08.polymorphism.example04;

/**
 * <br> Classe de exemplo para ilustrar coerção em conjunto com a classe {@link ClassA}.
 *
 * @author henriqueotogami
 * @since 2026-09-19
 * @version 0.10
 */

public class ClassB extends ClassA {

    public String whoAmI(){
        return "ClassB";
    }

    public String specialClassBMethod(){
        return "ClassB only method";
    }
}
