package Homwork;

import java.util.function.*;

public class Calculator {

//    public static Supplier;

    static Supplier<Calculator> instance = Calculator::new;
    public BinaryOperator<Integer> plus = Integer::sum;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    public BinaryOperator<Integer> multiply = (x, y) -> x * y;
    public BinaryOperator<Integer> dev = (x, y) ->  y!=0 ?x/y: 999999999;
    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    public Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;

}
