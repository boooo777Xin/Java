package ReviewNr;

class JKadai05 {
    public static void main(String[] args) {

        int even = 12;
        int odd = 7;

        System.out.println(even + "は" + checkEvenCheck(even) + "です。");
        System.out.println(odd + "は" + checkEvenCheck(odd) + "です。");

    }

    /*
     * 引数numを2で割ったとき
     * 余りが0 == 偶数
     * それ以外 == 奇数
     * ※04と違い、戻りはString型！！
     */
    private static String checkEvenCheck(int num) {

        if (num % 2 == 0) {

            return "偶数";

        }
        return "奇数";
    }
}
