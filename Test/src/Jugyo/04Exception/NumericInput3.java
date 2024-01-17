import java.util.Scanner;

class NumericInput3 {
    public static void main(String args[]) {
        try (Scanner sin = new Scanner(System.in)) {
            int price = sin.nextInt();
            double taxRate = sin.nextDouble();
            System.out.println("税込み価格は " + price * (1+taxRate) + "円です。");
        }
    }
}