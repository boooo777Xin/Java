package Minaoshi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ShinkeiSuijyakuEx {

    public static void main(String[] args) {
        String[] strs = { "＊", "＊", "＊＊", "＊＊", "＊＊＊", "＊＊＊" };
        System.out.println("神経衰弱を始めます");
        System.out.println(strs.length + "枚のカードをシャッフルします");
        System.out.println(Arrays.toString(strs));
        // 配列を並び替える
        shuffle(strs);
        System.out.println("シャッフルしました");
        System.out.println("\n0番目から" + (strs.length - 1) + "番目までカードを2枚めくってください");

        // 追加する処理
        boolean check[] = new boolean[strs.length]; // 正解したかチェックする配列
        int cnt = 0; // 正解した枚数を数える変数

        // 値を入力
        Scanner sc = new Scanner(System.in);
        System.out.print("1枚目の番号を入力してください→ ");
        int num1 = sc.nextInt();
        System.out.print("2枚目の番号を入力してください→ ");
        int num2 = sc.nextInt();

        // 正解か不正解かを判定
        // 正解するまで繰り返す
        while (cnt < strs.length) {

            if (num1 >= strs.length || num2 >= strs.length) {
                // 存在しないカードを選んだとき
                System.out.println("その組み合わせは存在しません。番号を入力し直してください");
            } else if (num1 == num2) {
                // 同じカードを選んだとき
                System.out.println("\n同じカードは選べません。番号を入力し直してください");
            } 
            else if (strs[num1] == strs[num2]) {
                // 正解したとき
                System.out.println("\n正解です。1枚目は[" + strs[num1] + "]、2枚目は[" + strs[num2] + "]です");
                check[num1] = true;
                check[num2] = true;

            } else if (strs[num1] != strs[num2]) {
                // 不正解だったとき
                System.out.println("\n不正解です。1枚目は[" + strs[num1] + "]、2枚目は[" + strs[num2] + "]です");
            }

            System.out.print("\n\n1枚目の番号を入力してください→ ");
            num1 = sc.nextInt();
            System.out.print("2枚目の番号を入力してください→ ");
            num2 = sc.nextInt();

            // 正解している枚数をカウント
            for (int i = 0; i < strs.length; i++) {
                if (check[i] == true) {
                    cnt++;
                }
            }

        }

        System.out.println("\n正解です。1枚目は[" + strs[num1] + "]、2枚目は[" + strs[num2] + "]です");
        System.out.println("神経衰弱を終了します");

    }

    // 配列の中身をシャッフル
    public static void shuffle(String[] array) {
        if (array.length <= 1) {
            return;
        }

        // FisherYates shuffle
        Random rnd = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // 要素入れ替え(swap)
            String tmp = array[index];
            array[index] = array[i];
            array[i] = tmp;

        }
    }
}
