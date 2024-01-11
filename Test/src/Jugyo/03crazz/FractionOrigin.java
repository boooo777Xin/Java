class FractionOrigin {
    int numerator; // 分子
    int denominator; // 分母

    FractionOrigin() {
        numerator = 0;
        denominator = 1;
    }

    FractionOrigin(int n, int d) {
        numerator = n;
        denominator = d;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}