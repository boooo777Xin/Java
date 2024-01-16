package Class2Ensyu;

public class StringMethods2 {
    public static void main(String[] args) {

        String moji = "";
        String tango = "blue";

        /*
         * メソッド：String型.isEmpty()
         * 概要：Stringクラスの文字が空文字かどうか判定する
         */
        boolean ret = moji.isEmpty();
        System.out.println(moji + "は" + ret);
        System.out.println(tango + "は" + tango.isEmpty());

        String str = null;
        System.out.print(str + "は");
        // Objects.nonNull(A)でも可能
        if (str != null) {
            System.out.println("nullではない");
        } else {
            System.out.println("nullです");
        }

        /*
         * メソッド：String型.indexOf(String A)
         * 概要：指定したインスタンスの文字列に対して、引数の中の文字が何番目に含まれているかを返す
         */
        str = "e";
        int index = tango.indexOf(str);
        System.out.println(tango + "の中で" + str + "は" + index + "番目です");

        /*
         * メソッド：String型.substring(int A,int B)
         * 概要：指定したインスタンスの文字列に対して、A <= X < B 範囲の文字を切り取る。
         */
        str = "ABCDEFG";
        moji = str.substring(2, 5);
        System.out.println(str + "を切り取りました→" + moji);

        /*
         * メソッド：String型.split(String A)
         * 概要：指定したインスタンスの文字列に対して、引数Aで指定された文字で分割し配列にする。
         */
        str = "イチゴ,みかん,ぶどう,リンゴ";
        String[] fruit = str.split(",");
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(i + "番目の要素 = " + fruit[i]);
        }
    }

}
