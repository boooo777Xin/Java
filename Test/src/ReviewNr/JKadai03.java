package ReviewNr;

class JKadai03 {
    public static void main(String[] args) {

        int count;
        //1~10回目をカウント
        for (count = 1; count <= 10; count++) {
            System.out.println("プルルル：" + count + "回目");
        }
        System.out.println("電話を" + (count - 1) + "回鳴らしました。");
        /* 
         * 上記解説。
         * for分の条件判定は以下流れ
         * ①count++で数字が足される
         * ②真ん中の条件で count <= 10 が真となるか判定
         * 
         * となるため、①の処理は走った状態　= countの中身は最終的に11になるため、-1する必要がある。
         */
    }
}
