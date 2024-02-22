import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class UpperCaseClient {
    public static void main(String[] args) {
        try {
            Socket soc = new Socket("localhost", 49153);
            Scanner sc = new Scanner(soc.getInputStream());
            Scanner in = new Scanner(System.in);//クライアント側用の入力装置
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);//『サーバへの』出力ストリーム

            while(sc.hasNext()) {
                String message = sc.nextLine();
                System.out.println("Server: " + message);
                if(message.equals("Good bye!")) {
                    break;
                }
                message = in.nextLine();//クライアント側の入力
                out.println(message);//サーバへの出力
            }
            
            soc.close();//ソケットを閉じる
            sc.close();
            in.close();
        } catch (UnknownHostException e) {
            System.err.println("ホストのIPアドレスが判定できません: " + e);
        } catch (IOException e) {
            System.err.println("エラーが発生しました: " + e);
        }
    }
}