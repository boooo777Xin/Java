import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample01 {

    public static void main(String[] args) {

        Map<String, String> mapA = new HashMap<>();
        mapA.put("1", "スライム");
        mapA.put("2", "ドラゴン");
        mapA.put("3", "バラモス");
        mapA.put("4", "エスターク");
        mapA.put("5", "デスピサロ");

        System.out.println("1~5で好きな数字を入力してください。");

        try (Scanner scr = new Scanner(System.in)) {
            boolean error = false;
            int num;

            do {
                try {
                    num = scr.nextInt();
                } catch (Exception e) {
                    System.out.println("数字以外が入力されています。");
                    error = true;
                    return;
                }

                if (num > 5 || num < 1) {
                    System.out.println("範囲外の数字が選ばれています。");
                    System.out.println("１～５のうち、いずれかの数値を入力してください ->");
                    error = true;
                } else {
                    error = false;
                }
            } while (error);
            
            System.out.println(mapA.getOrDefault(String.valueOf(num), "") + "が現れた！！！");
            scr.close();
        }

    }
}
