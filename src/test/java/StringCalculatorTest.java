import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    @Test
    void Negative_Numbers_Position_first_test() {
        StringCalculator calc = new StringCalculator();
        assertThrows(IllegalArgumentException.class,() -> {calc.add("-3, 5");});

    }
    @Test
    void Negative_Numbers_Position_middle_test() {
        StringCalculator calc = new StringCalculator();
        assertThrows(IllegalArgumentException.class,() -> {calc.add("4, -5, 8");});

    }

    @Test
    void Negative_Numbers_Position_end_test() {
        StringCalculator calc = new StringCalculator();
        assertThrows(IllegalArgumentException.class,() -> {calc.add("4, 5, -8");});

    }

    @Test
    void Ignore_Large_First_test() {
        StringCalculator calc = new StringCalculator();
        int expected = 2;
        int actual = calc.add("1005, 1, 1");
    }

    @Test
    void Ignore_Large_Middle_test() {
        StringCalculator calc = new StringCalculator();
        int expected = 2;
        int actual = calc.add("1, 1005, 1");
    }

    @Test
    void Ignore_Large_End_test() {
        StringCalculator calc = new StringCalculator();
        int expected = 2;
        int actual = calc.add("1, 1, 1005");
    }

    @Test
    void Ignore_Large_Multiple_test() {
        StringCalculator calc = new StringCalculator();
        int expected = 1;
        int actual = calc.add("1, 1005, 1005");
    }
}
