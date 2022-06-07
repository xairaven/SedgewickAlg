package Chapter1.Section2;
import Chapter1.Section2.Structures.Rational;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Ex. 1.2.17 <br>
 * {@link Rational} structure located in Chapter1.Section2.Structures <br>
 * 30.01.2022
 * @author xairaven
 */
class Task_17 {
    Rational rational1 = new Rational(1, 4);
    Rational rational2 = new Rational(2, 3);

    @org.junit.jupiter.api.Test
    void plusTest1() {
        Rational rationalPlus = rational1.plus(rational2);
        String actual = rationalPlus.numerator() + "/" + rationalPlus.denominator();
        String expected = "11/12";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void minusTest1() {
        Rational rationalMinus = rational1.minus(rational2);
        String actual = rationalMinus.numerator() + "/" + rationalMinus.denominator();
        String expected = "-5/12";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void timesTest1() {
        Rational rationalTimes = rational1.times(rational2);
        String actual = rationalTimes.numerator() + "/" + rationalTimes.denominator();
        String expected = "1/6";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void dividesTest1() {
        Rational rationalDividedBy = rational1.divides(rational2);
        String actual = rationalDividedBy.numerator() + "/" + rationalDividedBy.denominator();
        String expected = "3/8";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testEquals1() {
        Rational equalRational1 = rational1;
        boolean actual = rational1.equals(equalRational1);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testEquals2() {
        Rational equalRational2 = new Rational(rational1.numerator(), rational1.denominator());
        boolean actual = rational1.equals(equalRational2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testEquals3() {
        Rational nonEqualRational = new Rational(7, 8);
        boolean actual = rational1.equals(nonEqualRational);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testToString1() {
        String actual = rational1.toString();
        String expected = "1/4";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testToString2() {
        String actual = rational2.toString();
        String expected = "2/3";
        assertEquals(expected, actual);
    }
}