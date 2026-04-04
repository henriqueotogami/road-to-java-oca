package oca.chapter04.primitives;

/**
 * <br>Exemplo de uso do tipo primitivo char em Java.
 *
 * @author henriqueotogami
 * @since 2026-04-04
 * @version 0.5
 */
public class ExampleChar {

    public char getCharCharacter() { return 'S'; }

    public char getCharUnicode() { return '\u0068'; }

    public char getCharHexadecimal() { return 0x0065; }

    public char getCharOctal() { return 0154; }

    public char getCharCasting1() { return (char) 131170; }

    public char getCharCasting2() { return (char) 131193; }

    public char getCharSpecial() { return '\''; }

    public char getCharSimple() { return 's'; }

    public char[] getCharArray() {
        return new char[] {
                getCharCharacter(), getCharUnicode(), getCharHexadecimal(), getCharOctal(),
                getCharCasting1(), getCharCasting2(), getCharSpecial(), getCharSimple()
        };
    }

    public String getMessage() { return new String(getCharArray()).concat(" Mustang"); }
}