package Class1Ensyu;

public class Calculation {

    int num;

    Calculation() {
        this.num = 0;
    }

    // リセット
    void reset() {
        this.num = 0;
    }

    // 結果を表示する
    void display() {
        System.out.println("計算結果 : " + num);
    }

    // 足し算
    void plus(int x) {
        // num = num + x
        num += x;
    }

    // 引き算
    void minus(int x) {
        // num = num - x
        num -= x;
    }

    // 掛け算
    void multiplied(int x) {
        // num = num * x
        num *= x;
    }

    // 割り算
    void division(int x) {
        // num = num / x
        num /= x;
    }
}
