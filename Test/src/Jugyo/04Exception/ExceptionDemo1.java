import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

class ExceptionDemo1 {
    public static void main(String args[]) {

        Scanner sc = null;
        FileReader fr = null;
        try {
            fr = new FileReader("ExceptionDemo1.java");
            sc = new Scanner(fr);
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        } finally {
            try {
                if (sc != null) {
                    sc.close();
                }
            } catch (Exception e) {
                System.out.println("I/Oエラーが発生しました");
            }
        }
      
    }
}