import Homwork.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class MainTest {

    Calculator calc;

    @BeforeEach
    void setup() {
        calc = new Calculator();
        System.out.println("biging");
    }


    @Test
    @DisplayName("sum")
    void plus() {
        int x = 3;
        int y = 2;
        int expected = 5;
        final int actual = calc.plus.apply(x, y);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("factoryMinus")
    void minus() {
        int x = 3;
        int y = 2;
        int expected = 1;
        final int actual = calc.minus.apply(x, y);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("multi")
    void multiply() {
        int x = 4;
        int y = 2;
        int expected = 8;
        final int actual = calc.multiply.apply(x, y);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("div")
    void devide() {
        int x = 9;
        int y = 3;
        int expected = 3;
        int actual = calc.dev.apply(x, y);
        assertEquals(expected, actual);
    }



    @Test
    @DisplayName("degree")
    void pow() {
        int x = 5;
        int expected = 25;
        int actual = calc.pow.apply(x);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("isPositive ")
    void isPositive() {
        int x = 5;
        final boolean actual = calc.isPositive.test(x);
        assertTrue(actual);
    }

    @Test
    @DisplayName("ABS")
    void abs() {
        int x = -5;
         int expected = 5;
        int actual = calc.abs.apply(x);
        assertEquals(expected, actual);

    }
}


