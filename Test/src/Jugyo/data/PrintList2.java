import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrintList2 {

    public static void main(String args[]) {

        // 外部から渡されるテキストデータを、Java上のコードに落とし込む
        try (FileReader fr = new FileReader(args[0])) {

            // FileReaderの中身を読み取る
            Scanner sin = new Scanner(fr);
            while (sin.hasNext()) {
                // ファイルの中身を文字列に変換
                String s = sin.nextLine();
                System.out.println(s);
            }
            fr.close();
            sin.close();
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
            // ファイルがなかった時処理を終わらせる
            System.exit(0);
        } catch (IOException e) {
            System.out.println("I/Oエラーが発生しました");
        } finally {
            System.out.println("処理を終了します");
        }
    }
}
