import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class SimpleServer {
    public static void main(String[] args) {
        try {
            
            // ServerSocket作成(ﾎﾟｰﾄ番号:49152)
            ServerSocket sever = new ServerSocket(49152);

            // ｸﾗｲｱﾝﾄからの接続待ち
            Socket client = sever.accept();

            // ｸﾗｲｱﾝﾄへﾃﾞｰﾀ出力する為のｲﾝｽﾀﾝｽ作成
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            // ｸﾗｲｱﾝﾄへ送るﾒｯｾｰｼﾞ1行目
            out.println("Hello, client!");
            // ｸﾗｲｱﾝﾄへ送るﾒｯｾｰｼﾞ2行目
            out.println("Good bye!");

            // ｸﾗｲｱﾝﾄとの接続を切る
            client.close();
            sever.close();

        } catch (IOException e) {
            System.err.println("エラーが発生しました: " + e);
        }
    }
}