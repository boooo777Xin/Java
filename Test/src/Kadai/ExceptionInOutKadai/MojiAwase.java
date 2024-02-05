import java.util.Scanner;

public class MojiAwase {
    public static void main(String[] args) {

        Scanner sin = new Scanner(System.in);
        System.out.println("1個目の文字を入力してください");
        String si1 = sin.next();
        System.out.println("2個目の文字を入力してください");
        String si2 = sin.next();
        sin.close();

        if (si1.equals(si2)) {
            System.out.println("同じ文字です");
        } else {
            System.out.println("同じ文字ではありません");
        }
    }
}
