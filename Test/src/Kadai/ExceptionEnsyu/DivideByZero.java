package ExceptionEnsyu;

class DivideByZero {
  public static void main(String[] args) {
    int num = 10;
    int denom = 0;

    try {
      num = num / denom;
    } catch (Exception e) {
      System.out.println("エラーが発生しました。");
    }
  }
}
