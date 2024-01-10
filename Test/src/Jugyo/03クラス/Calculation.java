/* 計算用のクラス */
class Calculation {
    int num;

    Calculation () {
        num = 0;
    }

    /* リセット */
    void reset() {
        num = 0;
    }

    /* 結果表示 */
    void display() {
        System.out.println("計算結果：" + num);
    }

    /* 足し算 */
    void plus(int x) {
        num = num + x;
    }

    /* 引き算 */
    void minus(int x) {
        num = num - x;
    }

    /* 掛け算 */
    void multiple(int x) {
        num = num * x;
    }

    /* 割り算 */
    void divide(int x) {
        num = num / x;
    }
}