package oca.chapter02.primitives.example04;

public class Ternary {

    public static void main(String[] args) {
        final int x = -5;
        final int valorAbsoluto = (x > 0) ? x : -x;
        System.out.println(valorAbsoluto);
    }

    public void defaultIfElse() {
        int x = -5;
        int valorAbsoluto;
        if(x > 0){
            valorAbsoluto = x;
        }
        else{
            valorAbsoluto = -x;
        }
        System.out.println(valorAbsoluto);
    }
}
