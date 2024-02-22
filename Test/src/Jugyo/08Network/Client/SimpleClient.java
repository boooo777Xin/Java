import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;
import java.util.Scanner;

class SimpleClient {
    public static void main(String[] args) {

        // ｻｰﾊﾞﾌﾟﾛｸﾞﾗﾑに接続する為のｿｹｯﾄ作成(余力があればIPｱﾄﾞﾚｽで記述)
        try (Socket soc = new Socket("localhost", 49152);) {

            // ｿｹｯﾄからﾃﾞｰﾀ取得する為のｲﾝｽﾀﾝｽ作成
            Scanner sc = new Scanner(soc.getInputStream());

            // ｻｰﾊﾞから送られたﾃﾞｰﾀの1行単位でﾙｰﾌﾟ
            while (sc.hasNext()) {

                // ｻｰﾊﾞから送られたﾃﾞｰﾀの1行分を取り出す
                String message = sc.nextLine();
                System.out.println("Server: " + message);

                // 行の内容が『bye!』なら中断
                if (message.equals("bye!")) {
                    break;
                }
            }
            sc.close();

        } catch (UnknownHostException e) {
            System.err.println("ホストのIPアドレスが判定できません: " + e);

        } catch (IOException e) {
            System.err.println("エラーが発生しました: " + e);
        }
    }
}