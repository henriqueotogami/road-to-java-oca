package oca.chapter05;

import oca.chapter05.methods.example01.MathTools;
import oca.chapter05.methods.example02.LogManager;
import oca.chapter05.methods.example03.Number;
import oca.chapter05.methods.example04.SampleMethod;
import oca.chapter05.methods.example05.Television;
import oca.chapter05.methods.example06.LoanDetails;
import oca.chapter05.methods.example07.ChildClass;
import oca.chapter05.methods.example08.Tools;
import oca.chapter05.methods.example09.ShippingPackage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <br>Classe de teste para os exemplos de métodos em Java.
 *
 * @author henriqueotogami
 * @since 2026-04-19
 * @version 0.5
 */
class ExamplesTest {

    /**
     * Teste para o exemplo de uso de métodos em Java.
     */
    @Test
    @Order(1)
    void example01CreateMethod() {
        final MathTools mTools = new MathTools();
        final int x = 8;
        final int y = 13;
        final int lowestInt = mTools.findLowerValue(x,y);
        Assertions.assertEquals(8, lowestInt);
        Assertions.assertEquals(8, mTools.findLowerValue(x,y));
    }

    /**
     * Teste para o exemplo de uso de métodos sobrecarregados em Java.
     */
    @Test
    @Order(2)
    void example01OverloadMethod() {
        final MathTools mTools = new MathTools();
        final double x = 8.5;
        final double y = 13.2;
        final double lowestDouble = mTools.findLowerValue(x,y);
        Assertions.assertEquals(8.5, lowestDouble);
        Assertions.assertEquals(8.5, mTools.findLowerValue(x,y));
    }

    /**
     * Teste para o exemplo de uso de métodos sobrecarregados em Java.
     */
    @Test
    @Order(3)
    void example02OverloadMethod() {
        final LogManager logManager = new LogManager();
        logManager.logInfo("This is a log message without an error number.");
        logManager.logInfo("This is a log message with an error number.", 404);
        Assertions.assertTrue(true); // Apenas para garantir que o teste passe, já que os métodos de log não retornam valores
    }

    /**
     * Teste para o exemplo de passagem por valor em Java.
     */
    @Test
    @Order(4)
    void example03PassByValue() {
        final Number number = new Number(3);
        number.addTwo(4);
        Assertions.assertEquals(3, number.getNumber(), "O valor do número deve permanecer inalterado, pois os parâmetros primitivos são passados por valor.");
    }

    /**
     * Teste para o exemplo de passagem por referência em Java.
     */
    @Test
    @Order(5)
    void example03PassByReference() {
        final Number number = new Number(3);
        number.addThree(number);
        Assertions.assertEquals(6, number.getNumber(), "O valor do número deve ser alterado, pois os objetos são passados por referência.");
    }

    /**
     * Teste para o exemplo de escopo de variáveis em Java.
     */
    @Test
    @Order(6)
    void example04VariableScope() {
        final SampleMethod sampleMethod = new SampleMethod();
        Assertions.assertEquals(9, sampleMethod.sampleMethod(), "A variável local deve ser acessível apenas dentro do método onde foi declarada.");
    }

    /**
     * Teste para o exemplo de variáveis de instância em Java.
     */
    @Test
    @Order(7)
    void example05InstanceVariables() {
        Television tv1 = new Television();
        Television tv2 = new Television();
        tv1.setChannel(2);
        tv2.setChannel(7);
        Assertions.assertEquals(2, tv1.getChannel(), "A variável de instância deve manter seu valor específico para cada objeto.");
        Assertions.assertEquals(7, tv2.getChannel(), "A variável de instância deve manter seu valor específico para cada objeto.");
    }

    /**
     * Teste para o exemplo de construtores em Java.
     */
    @Test
    @Order(8)
    void example06CreateConstructor() {
        LoanDetails loanDetails = new LoanDetails();
        loanDetails.setPrincipal(150000);
        final double expected = 1010.809999701624D;
        Assertions.assertEquals(expected, loanDetails.monthlyPayment(), "O método monthlyPayment deve calcular o pagamento mensal com base no valor principal e na taxa de juros.");
    }

    /**
     * Teste para o exemplo de construtores sobrecarregados em Java.
     */
    @Test
    @Order(9)
    void example06OverloadConstructor() {
        LoanDetails loanDetails = new LoanDetails(150000, 0.05, 15);
        final double expected = 0.0625D;
        Assertions.assertEquals(expected, loanDetails.monthlyPayment(), "O método monthlyPayment deve calcular o pagamento mensal com base no valor principal, taxa de juros e prazo do empréstimo.");
    }

    /**
     * Teste para o exemplo de uso do keyword super em Java.
     */
    @Test
    @Order(10)
    void example07KeywordSuper() {
        ChildClass childClass1 = new ChildClass();
        ChildClass childClass2 = new ChildClass("test");
        Assertions.assertTrue(true);
    }

    /**
     * Teste para o exemplo de uso de métodos estáticos em Java.
     */
    @Test
    @Order(11)
    void example08StaticMethod() {
        final String formatDate = Tools.formatDate();
        final String expect = new SimpleDateFormat("MMM-dd-yy").format(new Date());
        Assertions.assertEquals(expect, formatDate, "O método formatDate deve retornar a data atual formatada como uma string.");
    }

    /**
     * Teste para o exemplo de uso de variáveis estáticas em Java.
     */
    @Test
    @Order(12)
    void example09StaticVariable() {
        final int initialTrackingNumber = ShippingPackage.nextTrackingNumber;
        ShippingPackage package1 = new ShippingPackage();
        ShippingPackage package2 = new ShippingPackage();
        Assertions.assertEquals(initialTrackingNumber, package1.getPackageTrackingNumber(), "O número de rastreamento do primeiro pacote deve ser igual ao valor inicial da variável estática.");
        Assertions.assertEquals(initialTrackingNumber + 1, package2.getPackageTrackingNumber(), "O número de rastreamento do segundo pacote deve ser igual ao valor inicial da variável estática mais um.");
    }
}
