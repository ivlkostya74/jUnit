package Homwork;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(0, 1);
        int c ;


        boolean g = calc.isPositive.test(3);
        if (b == 0) {
            throw new ArithmeticException("device by zero");
        } else {
            c = calc.devide.apply(a, b);
        }
        calc.println.accept(c);
        int d = calc.multiply.apply(2, 4);
        int e = calc.pow.apply(3);
        int f = calc.abs.apply(4);
        calc.println.accept(d);
        calc.println.accept(e);
        calc.println.accept(f);
            }
}