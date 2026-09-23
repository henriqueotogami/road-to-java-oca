package oca.chapter08.polymorphism.example04;

import org.apache.logging.log4j.LogManager;

public class Casting {

    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Casting.class.getName());

    public Casting() {

        ClassB obj1 = null;
        ClassA obj2 = null;
        ClassA obj3 = null;

        try {
            obj1 = this.getClassB();
            obj2 = this.getClassB();
            obj3 = this.getClassA();
        } catch (Exception exception) {
            logger.error("Falha na instanciação dos objetos: {}", exception.getMessage());
            exception.printStackTrace();
        }

        try {
            logger.info("obj1 is declared as : {}", obj1.getClass().getName());
            logger.info("obj2 is declared as : {}", obj2.getClass().getName());
            logger.info("obj3 is declared as : {}", obj3.getClass().getName());
        } catch (Exception e) {
            logger.error("Falha ao acessar a classe dos objetos: {}", e.getMessage());
            e.printStackTrace();
        }

        try {
            logger.info("\n");
            logger.info("obj1 is instance of : {}", isInstanceOfWhichClass(obj1));
            logger.info("obj2 is instance of : {}", isInstanceOfWhichClass(obj2));
            logger.info("obj3 is instance of : {}", isInstanceOfWhichClass(obj3));
        } catch (Exception e) {
            logger.error("Falha ao verificar a instância dos objetos: {}", e.getMessage());
            e.printStackTrace();
        }

        try {
            logger.info("\n");
            logger.info("obj1: Who am I ? {} | Special Method 1 : {} | Special Method 2 : {} ", obj1.whoAmI(), obj1.specialClassBMethod(), obj1.specialClassAMethod());
            logger.info("obj2: Who am I ? {} | Special Method 1 : {} | Special Method 2 : {} ", obj2.whoAmI(), obj2.specialClassAMethod(), ((ClassB) obj2).specialClassBMethod());
            logger.info("obj3: Who am I ? {} | Special Method 1 : {} | Special Method 2 : ClassA nao pode se comportar como ClassB ", obj3.whoAmI(), obj3.specialClassAMethod());
        } catch (Exception e) {
            logger.error("Falha ao acessar métodos dos objetos: {}", e.getMessage());
            e.printStackTrace();
        }
    }

    public static String isInstanceOfWhichClass(ClassA obj1) {
        return obj1 instanceof ClassB ? ClassB.class.getName() : ClassA.class.getName();
    }

    public ClassA getClassA() {
        return new ClassA();
    }

    public ClassB getClassB() {
        return new ClassB();
    }

    public static void main(String[] args) {
        new Casting();
    }
}
