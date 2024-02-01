import java.util.Scanner;

 class MoneyCount {
  public static void main(String[] args ) {
    System.out.println("金額を入力してください→");
    Scanner sin = new Scanner(System.in);
    int price = sin.nextInt();

    int price2 = price/10000;
    System.out.println("一万円札:" + price2 + "枚");
    price = price-10000*price2;
    price2 = price/5000;
    System.out.println("五千円札:" + price2 + "枚");
    price = price-5000*price2;
    price2 = price/1000;
    System.out.println("千円札:" + price2 + "枚");
    price = price-1000*price2;
    price2 = price/500;
    System.out.println("五百円玉:" + price2 + "枚");
    price = price-500*price2;
    price2 = price/100;
    System.out.println("百円玉:" + price2 + "枚");
    price = price-100*price2;
    price2 = price/50;
    System.out.println("五十円玉:" + price2 + "枚");
    price = price-50*price2;
    price2 = price/10;
    System.out.println("十円玉:" + price2 + "枚");
    price = price-10*price2;
    price2 = price/1;
    System.out.println("一円玉:" + price2 + "枚");


  }
}
