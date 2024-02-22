import java.util.Scanner;
import java.util.Random;

class soTest02 {

    public static void main(String[] args) {

        System.out.println("サイコロの目当てクイズをします。");
        // サイコロの目を振ります
        Random rand = new Random();

        // 0 から引数に指定した値未満の整数(5)を返すので +1
        int saikoro = rand.nextInt(6) + 1;

        System.out.print("1～6のうち、いずれかの数値を入力してください→");
        // キーボードから入力された数字を読み込みます
        try {
            // 入力を読み取る装置の実体を用意
            Scanner sin = new Scanner(System.in);
            // 入力した数値を読み取り
            int nyuryoku = sin.nextInt();

            // (★ボーナス５点)入力した数値の範囲チェック
            if (!(1 <= nyuryoku && nyuryoku <= 6)) {
                System.out.println("サイコロの目の範囲以外が入力されました。");
                sin.close();
                return;
            }

            // 数字が一致しているか比較し、正解・不正解の結果を表示します
            System.out.println("サイコロの目は、" + saikoro + "です。");
            if (saikoro == nyuryoku) {
                System.out.println("正解！");
            } else {
                System.out.println("不正解。");
            }
            sin.close();

            // (★ボーナス５点)数値以外を入力した場合を想定して、例外処理を入れておく
        } catch (Exception e) {
            System.out.println("エラーが発生しました。");
            System.out.println(e.getMessage());
        }
    }
}