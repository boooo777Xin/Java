import java.util.Scanner;

class NumericInput2 {
    public static void main(String args[]) {
        Scanner sin = new Scanner(System.in);
        System.out.print("税別価格： ");
        int price = sin.nextInt();
        System.out.print("税    率： ");
        double taxRate = sin.nextDouble();
        System.out.println("税込み価格は " + price * (1 + taxRate) + "円です。");
        sin.close();
    }
}