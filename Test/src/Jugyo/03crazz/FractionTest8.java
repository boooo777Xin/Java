class FractionTest8 {
    public static void main(String[] args) {
        Fraction2 f = new Fraction2();

        f.numerator = 1;
        f.denominator = 2;

        System.out.println("f=" + f);

        Fraction2 f2 = new Fraction2(2,3);
        System.out.println(f2);
    }
}