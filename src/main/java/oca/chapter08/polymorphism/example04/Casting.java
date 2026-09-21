package oca.chapter08.polymorphism.example04;

import org.apache.logging.log4j.LogManager;

public class Casting {

    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Casting.class.getName());

    public Casting() {
        ClassB obj1 = new ClassB();
        ClassA obj2 = new ClassB();
        ClassA obj3 = new ClassA();

        logger.info("obj1 is declared as : " + ClassB.class.getName());
        logger.info("obj2 is declared as : " + ClassA.class.getName());
        logger.info("obj3 is declared as : " + ClassA.class.getName());

        logger.info("\n");
        logger.info("\nobj1 is instance of : " + (obj1 instanceof ClassB ? ClassB.class.getName() : ClassA.class.getName()));
        logger.info("obj2 is instance of : " + (obj2 instanceof ClassB ? ClassB.class.getName() : ClassA.class.getName()));
        logger.info("obj3 is instance of : " + (obj3 instanceof ClassB ? ClassB.class.getName() : ClassA.class.getName()));

        logger.info("\n");
        logger.info("obj1: Who am I ? " + obj1.whoAmI() + " | Special Method 1 : " + obj1.specialClassBMethod() + " | Special Method 2 : " + obj1.specialClassAMethod());
        logger.info("obj2: Who am I ? " + obj2.whoAmI() + " | Special Method 1 : " + obj2.specialClassAMethod() + " | Special Method 2 : " + ((ClassB) obj2).specialClassBMethod());
        logger.info("obj3: Who am I ? " + obj3.whoAmI() + " | Special Method 1 : " + obj3.specialClassAMethod() + " | Special Method 2 : " + ((ClassB) obj3).specialClassBMethod());
    }

    public static void main(String[] args) {
        new Casting();
    }
}
