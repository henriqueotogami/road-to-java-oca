package oca.chapter04.objects;

/**
 * <br>Exemplo de uso da classe wrapper Integer em Java, incluindo autoboxing e unboxing.
 *
 * @author henriqueotogami
 * @since 2026-04-06
 * @version 0.5
 */
public class ExampleWrapperInteger {

    // Um Integer é criado e inicializado com 5
    private Integer valueA = new Integer(5);

    // Um primitivo int é configurado com o valor int armazenado no objeto Integer
    private int num = valueA.intValue();

    // O autoboxing é usado para converter um int em um Integer
    private Integer valueB = num;

    public Integer getValueA() { return this.valueA; }

    public int getNum() { return this.num; }

    public Integer getValueB() { return this.valueB; }

}