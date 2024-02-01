import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class PrintList1 {
    public static void main(String args[]) {
        FileReader fr = null;
        System.out.println(args[0]);
        String path = ".\\IOTest.txt";
        try {
            fr = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
            System.exit(0);
        }

        Scanner sin = new Scanner(fr);
        while(sin.hasNext()) {
            String s = sin.nextLine();
            System.out.println(s);
        }
        sin.close();
        if (fr != null) {
            try {
                fr.close();
            } catch (IOException e) {
                System.out.println("I/Oエラーが発生しました");
            }
        }
    }
}