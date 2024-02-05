import java.util.*;

public class MoneyCount {

    public static void main(String[] args) {

        int[] moneyInt = { 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
        String[] moneyStr = { "一万円札", "五千円札", "千円札",
                "五百円玉", "百円玉", "五十円玉",
                "十円玉", "五円玉", "一円玉" };

        System.out.print("金額を入力して下さい -> ");
        try {

            Scanner sin = new Scanner(System.in);
            int price = sin.nextInt();
            for (int i = 0; i < moneyInt.length; i++) {
                System.out.println(moneyStr[i] + ":" + price / moneyInt[i] + "枚");
                price %= moneyInt[i];
            }
            sin.close();
        } catch (InputMismatchException e) {
            System.out.println("数字以外が入力されています");
        }
    }
}
