package ReviewNr;
class JKadai04 {
    public static void main(String[] args) {

        int even = 8;
        int odd = 5;

        if (isEvenCheck(even)) {
            System.out.println(even + "は偶数です。");
        }

        if (!isEvenCheck(odd)) {
            System.out.println(odd + "は奇数です。");
        }

    }

    /*
     * 引数numを2で割ったとき
     * 余りが0 == 偶数
     * それ以外 == 奇数
     */
    private static boolean isEvenCheck(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
