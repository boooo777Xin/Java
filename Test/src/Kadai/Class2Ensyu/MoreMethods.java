package Class2Ensyu;

import java.util.Random;

public class MoreMethods {
    public static void main(String[] args) {

        /*
         * メソッド：String型.replace(String A,String B)
         * 概要：インスタンスの文字列に対し,Aの文字をBに置き換える
         */
        String moji = "白黒白黒白黒白黒白黒白黒白黒白黒";
        String str = moji.replace("黒", "白");
        System.out.println(moji + "は");
        System.out.println(str + "になりました");

        /*
         * メソッド：Integer.parseInt(String A)
         * 概要：引数の文字列を数値に変換
         */
        moji = "123";
        int num = Integer.parseInt(moji);
        System.out.println(moji);

        /*
         * メソッド：Integer.toString(int A)
         * 概要：引数の数値を文字列に変換
         */
        System.out.println(Integer.toString(num));

        /*
         * メソッド：Math.random()
         * 概要：0.0~1.0未満の範囲でdouble型の乱数を返す
         */
        double random = Math.random();
        System.out.println("実行するたびに値が変わります→" + random);

        /*
         * メソッド：Random型.nextInt(Integer A)
         * 概要：0 <= X < A の範囲で乱数を返す
         */
        Random rand = new Random();
        num = rand.nextInt(10);
        System.out.println("実行するたびに値が変わります→" + num);

    }
}
