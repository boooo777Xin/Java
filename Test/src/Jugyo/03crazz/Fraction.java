class Fraction {
    int numerator; // 分子
    int denominator; // 分母

    Fraction() {
        numerator = 0;
        denominator = 1;
    }

    Fraction(int n,int d) {
        numerator = n;
        denominator = d;
    }

    void add(Fraction f) {
        numerator = numerator * f.denominator + denominator * f.numerator;
        denominator = denominator * f.denominator;
    }

    void add(int n) {
        numerator = numerator + denominator * n;
    }

    void add(int numerator, int denominator) {
        numerator = this.numerator * denominator + this.denominator * numerator;
        denominator = this.denominator * numerator;
    }
}