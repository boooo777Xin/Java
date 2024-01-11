class Fraction {
    int numerator; // 分子
    int denominator; // 分母

    Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    Fraction(int n, int d) {
        this.numerator = n;
        this.denominator = d;
    }

    void add(Fraction f) {
        this.numerator = numerator * f.denominator + denominator * f.numerator;
        this.denominator = denominator * f.denominator;
    }

    void add(int n) {
        this.numerator = this.numerator + this.denominator * n;
    }

    void add(int numerator, int denominator) {
        this.numerator = this.numerator * denominator + this.denominator * numerator;
        this.denominator = this.denominator * numerator;
    }

    void minus(Fraction f) {
        this.numerator = numerator * f.denominator - denominator * f.numerator;
        this.denominator = denominator * f.denominator;
    }

    void minus(int n) {
        this.numerator = this.numerator - this.denominator * n;
    }

    void minus(int numerator, int denominator) {
        this.numerator = this.numerator * denominator - this.denominator * numerator;
        this.denominator = this.denominator * numerator;
    }

    public String toString() {

        return this.numerator + "/" + this.denominator;
    }
}