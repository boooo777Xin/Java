import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;

class UpperCaseServer {
    public static void main(String[] args) {
        try (
            ServerSocket sever = new ServerSocket(49152);
            Socket client = sever.accept();
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            Scanner sc = new Scanner(client.getInputStream());//クライアントからの入力を読み取る装置
        ){
            out.println("Hello, client! Enter 'bye' to exit.");
            while(sc.hasNextLine()){
                String message = sc.nextLine();//クライアントからの入力読み取り
                System.out.println("message = " + message);
                if (message.equals("bye")) {
                    break;
                }
                out.println(message.toUpperCase());//大文字変換してクライアントへ送る
            }
            out.println("Good bye!");//最後のメッセージをクライアントへ送る
        } catch (IOException e) {
            System.err.println("エラーが発生しました: " + e);
        }
    }
}