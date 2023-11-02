public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(1, 4);

        Fraction sum = fraction1.add(fraction2);
        System.out.println(sum.getDecimal());
        Fraction product = fraction1.multiply(fraction2);
        System.out.println(product.getDecimal());
    }
}