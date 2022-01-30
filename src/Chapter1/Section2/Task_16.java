package Chapter1.Section2;
//30.01.2022
//Ex. 1.2.16
public class Task_16 {
    public static void main() {
        System.out.println("-- Task 1.2.16 --");
        System.out.println("If you want to test class, install JUnit and run Task_16_TEST");
        System.out.print("\n\n");
    }
}

class RationalStackOverflow {
    private final long numerator;
    private final long denominator;

    public RationalStackOverflow(int numerator, int denominator) {
        if (denominator == 0) {
            throw new RuntimeException("Denominator cannot be 0");
        }

        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        if (denominator < 0) {
            numerator = -1 * numerator;
            denominator = -1 * denominator;
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int numerator() {
        return (int) this.numerator;
    }

    public int denominator() {
        return (int) this.denominator;
    }

    private int gcd(int numerator, int denominator) {
        if (denominator == 0) {
            return numerator;
        } else {
            return gcd(denominator, numerator % denominator);
        }
    }

    public RationalStackOverflow plus(RationalStackOverflow b) {
        int newNumA = this.numerator() * b.denominator();
        int newNumB = b.numerator() * this.denominator();

        int resultNum = newNumA + newNumB;
        int resultDen = this.denominator() * b.denominator();

        return new RationalStackOverflow(resultNum, resultDen);
    }

    public RationalStackOverflow minus(RationalStackOverflow b) {
        int newNumA = this.numerator() * b.denominator();
        int newNumB = b.numerator() * this.denominator();

        int resultNum = newNumA - newNumB;
        int resultDen = this.denominator() * b.denominator();

        return new RationalStackOverflow(resultNum, resultDen);
    }

    public RationalStackOverflow times(RationalStackOverflow b) {
        int resultNum = this.numerator() * b.numerator();
        int resultDen = this.denominator() * b.denominator();

        return new RationalStackOverflow(resultNum, resultDen);
    }

    public RationalStackOverflow divides(RationalStackOverflow b) {
        RationalStackOverflow bInverse = new RationalStackOverflow(b.denominator(), b.numerator());
        return times(bInverse);
    }

    @Override
    public boolean equals(Object x) {
        if (this == x) {
            return true;
        }
        if (x == null) {
            return false;
        }
        if (this.getClass() != x.getClass()) {
            return false;
        }

        RationalStackOverflow that = (RationalStackOverflow) x;
        if (this.numerator() != that.numerator()) {
            return false;
        }
        if (this.denominator() != that.denominator()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.numerator() + "/" + this.denominator();
    }
}
