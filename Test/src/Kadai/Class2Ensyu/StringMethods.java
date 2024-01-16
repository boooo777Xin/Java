package Class2Ensyu;

public class StringMethods {
    public static void main(String[] args) {

        String moji = "ABCDE";
        /*
         * メソッド：String型.length()
         * 概要：文字列の文字個数を数える
         */
        int len = moji.length();
        System.out.println(moji + "は" + len + "文字です");

        /*
         * メソッド：String型.toLowerCase()
         * 概要：文字列を小文字に変換する
         */
        String low = moji.toLowerCase();
        System.out.println(moji + "は" + low);

        moji = "aBdDe";

        /*
         * メソッド：String型.toUpperCase()
         * 概要：文字列を大文字に変換する
         */
        String upper = moji.toUpperCase();
        System.out.println(moji + "は" + upper);

        String s1 = "ABC";
        String s2 = "ABC";

        /*
         * メソッド：String型.equals(String A)
         * 概要：String型インスタンスに対して、引数の中のAと同一のものか判定する
         */
        boolean ret = s1.equals(s2);
        System.out.println(s1 + "と" + s2 + ret);

        s2 = s2.toLowerCase();
        ret = s1.equals(s2);
        System.out.println(s1 + "と" + s2 + ret);
    }

}
