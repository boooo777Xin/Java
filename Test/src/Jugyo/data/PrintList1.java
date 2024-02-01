import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrintList1 {

    public static void main(String args[]) {

        FileReader fr = null;
        try {
            // 外部から渡されるテキストデータを、Java上のコードに落とし込む
            fr = new FileReader(args[0]);
        } catch (FileNotFoundException e) {
           
            System.out.println("ファイルが見つかりません");
           
            // ファイルがなかった時処理を終わらせる
            System.exit(0);
        }
         // FileReaderの中身を読み取る
        Scanner sin = new Scanner(fr);
        while (sin.hasNext()) {
            // ファイルの中身を文字列に変換
            String s = sin.nextLine();
            System.out.println(s);
        }

        // 読み取り終わったら開いたファイルを閉じる
        sin.close();
        if (fr != null) {
            //読み取り途中でエラーが起きたときの例外処理
            try {
                fr.close();
            } catch (IOException e) {
                System.out.println("I/Oエラーが発生しました");
            }
        }
    }

}
