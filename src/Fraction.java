public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction fraction) {
        int finalNumerator = (this.numerator * fraction.denominator) + (fraction.numerator * this.denominator);
        int finalDenominator = this.denominator * fraction.denominator;
        return new Fraction(finalNumerator, finalDenominator);
    }

    public Fraction multiply(Fraction fraction) {
        int finalNumerator = this.numerator * fraction.numerator;
        int finalDenominator = this.denominator * fraction.denominator;
        return new Fraction(finalNumerator, finalDenominator);
    }

    public double getDecimal() {
        return (double) numerator / denominator;
    }
}