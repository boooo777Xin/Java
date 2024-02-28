import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class StudentDataInput {

    public static void main(String[] args) {

        int num1 = 0;
        Map<Integer, Student> studentMap = new HashMap<>();
        System.out.println("入力したい学生情報の人数を入力してください ->");

        try (Scanner scr = new Scanner(System.in)) {
            num1 = scr.nextInt();
            for (int x = 1; x <= num1; x++) {
                studentMap.put(x, new Student(x));
            }

            System.out.println("1~" + num1 + "の間で出力したい学生情報の番号を入力してください。");
            int num2 = scr.nextInt();
            Student target = studentMap.getOrDefault(num2, null);

            if (Objects.nonNull(target)) {
                System.out.println("学生名 : " + target.name);
                System.out.println("年齢 : " + target.age);
                System.out.println("学籍番号 : " + target.studentNo);
                System.out.println("性別 : " + (target.gender ? "男" : "女"));
            } else {
                System.out.println("対象の学生は存在しません");
            }

            scr.close();
        } catch (Exception e) {
            System.out.println("数字以外が入力されています。");
        }
    }
}
