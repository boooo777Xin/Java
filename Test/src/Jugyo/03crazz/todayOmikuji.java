import java.util.Random;

class todayOmikuji {
  public static void main(String[] args) {
    omikuji();
  }
  static void omikuji() {
    System.out.println("おみくじをひきました");
    int num = 0;
    Random r = new Random();
    num = r.nextInt(7);
    switch(num) {
      case 0: System.out.println("今日は「大吉」です");
      System.out.println("一言:素晴らしいでしょう");
      break;
      case 1: System.out.println("今日は「吉」です");
      System.out.println("一言:まあまあでしょう");
      break;
      case 2: System.out.println("今日は「中吉」です");
      System.out.println("一言:少し良いでしょう");
      break;
      case 3: System.out.println("今日は「小吉」です");
      System.out.println("一言:良いでしょう");
      break;
      case 4: System.out.println("今日は「末吉」です");
      System.out.println("一言:良くはないでしょうでしょう");
      break;
      case 5: System.out.println("今日は「凶」です");
      System.out.println("一言:悪いでしょう");
      break;
      case 6: System.out.println("今日は「大凶」です");
      System.out.println("一言:最悪でしょう");
      break;
    }
  }
}
