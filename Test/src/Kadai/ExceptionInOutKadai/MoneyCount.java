import java.util.*;

public class MoneyCount {

    public static void main(String[] args) {

        try {

            Scanner sin = new Scanner(System.in);
            System.out.print("金額を入力して下さい -> ");
            int price = sin.nextInt();

            System.out.println("一万円札:" + price / 10000 + "枚");
            price %= 10000;

            System.out.println("五千円札:" + price / 5000 + "枚");
            price %= 5000;

            System.out.println("千円札:" + price / 1000 + "枚");
            price %= 1000;

            System.out.println("五百円玉:" + price / 500 + "枚");
            price %= 500;

            System.out.println("百円玉:" + price / 100 + "枚");
            price %= 100;

            System.out.println("五十円玉:" + price / 50 + "枚");
            price %= 50;

            System.out.println("十円玉:" + price / 10 + "枚");
            price %= 10;

            System.out.println("五円玉:" + price / 5 + "枚");
            price %= 5;

            System.out.println("一円玉:" + price / 1 + "枚");
            sin.close();

        } catch (InputMismatchException e) {
            System.out.println("数字以外が入力されています");
        }

    }
}
