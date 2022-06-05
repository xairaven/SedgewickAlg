package Chapter1.Section2.Structures;

/**
 * For ex. 1.2.16 <br>
 * 30.01.2022
 * @author xairaven
 */
public class RationalSO {
    private final long numerator;
    private final long denominator;

    public RationalSO(int numerator, int denominator) {
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

    public RationalSO plus(RationalSO b) {
        int newNumA = this.numerator() * b.denominator();
        int newNumB = b.numerator() * this.denominator();

        int resultNum = newNumA + newNumB;
        int resultDen = this.denominator() * b.denominator();

        return new RationalSO(resultNum, resultDen);
    }

    public RationalSO minus(RationalSO b) {
        int newNumA = this.numerator() * b.denominator();
        int newNumB = b.numerator() * this.denominator();

        int resultNum = newNumA - newNumB;
        int resultDen = this.denominator() * b.denominator();

        return new RationalSO(resultNum, resultDen);
    }

    public RationalSO times(RationalSO b) {
        int resultNum = this.numerator() * b.numerator();
        int resultDen = this.denominator() * b.denominator();

        return new RationalSO(resultNum, resultDen);
    }

    public RationalSO divides(RationalSO b) {
        RationalSO bInverse = new RationalSO(b.denominator(), b.numerator());
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

        RationalSO that = (RationalSO) x;
        if (this.numerator() != that.numerator()) {
            return false;
        }
        return this.denominator() == that.denominator();
    }

    @Override
    public String toString() {
        return this.numerator() + "/" + this.denominator();
    }
}
