package Chapter1.Section2.Structures;

/**
 * For ex. 1.2.17 <br>
 * 30.01.2022
 * @author xairaven
 */
public class Rational {
    private final long numerator;
    private final long denominator;
    private final static String AssertMessage = "Operation would cause stack overflow";

    public Rational(long numerator, long denominator) {
        if (denominator == 0) {
            throw new RuntimeException("Denominator cannot be 0");
        }

        long gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        if (denominator < 0) {
            numerator = -1 * numerator;
            denominator = -1 * denominator;
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long numerator() {
        return this.numerator;
    }

    public long denominator() {
        return this.denominator;
    }

    private long gcd(long numerator, long denominator) {
        if (denominator == 0) {
            return numerator;
        } else {
            return gcd(denominator, numerator % denominator);
        }
    }

    public Rational plus(Rational b) {
        assert this.numerator * b.denominator <= Integer.MAX_VALUE : AssertMessage;
        assert b.numerator * this.denominator <= Integer.MAX_VALUE : AssertMessage;
        assert this.numerator * b.denominator >= Integer.MIN_VALUE : AssertMessage;
        assert b.numerator * this.denominator >= Integer.MIN_VALUE : AssertMessage;

        long newNumA = (long) this.numerator() * b.denominator();
        long newNumB = (long) b.numerator() * this.denominator();

        long resultNum = newNumA + newNumB;
        long resultDen = (long) this.denominator() * b.denominator();

        return new Rational(resultNum, resultDen);
    }

    public Rational minus(Rational b) {
        assert this.numerator * b.denominator <= Integer.MAX_VALUE : AssertMessage;
        assert b.numerator * this.denominator <= Integer.MAX_VALUE : AssertMessage;
        assert this.numerator * b.denominator >= Integer.MIN_VALUE : AssertMessage;
        assert b.numerator * this.denominator >= Integer.MIN_VALUE : AssertMessage;

        long newNumA = this.numerator() * b.denominator();
        long newNumB = b.numerator() * this.denominator();

        long resultNum = newNumA - newNumB;
        long resultDen = this.denominator() * b.denominator();

        return new Rational(resultNum, resultDen);
    }

    public Rational times(Rational b) {
        assert this.numerator * b.numerator <= Integer.MAX_VALUE : AssertMessage;
        assert this.numerator * b.numerator >= Integer.MIN_VALUE : AssertMessage;
        assert this.denominator * b.denominator >= Integer.MIN_VALUE : AssertMessage;
        assert this.denominator * b.denominator <= Integer.MAX_VALUE : AssertMessage;

        long resultNum = this.numerator() * b.numerator();
        long resultDen = this.denominator() * b.denominator();

        return new Rational(resultNum, resultDen);
    }

    public Rational divides(Rational b) {
        Rational bInverse = new Rational(b.denominator(), b.numerator());
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

        Rational that = (Rational) x;
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
