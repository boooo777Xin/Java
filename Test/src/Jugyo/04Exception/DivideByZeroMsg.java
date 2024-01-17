/* Java応用 例外処理演習 */

class DivideByZeroMsg {
    public static void main(String[] args) {
        int num = 10;
        int denom = 0;

        try {            
            num = num / denom;
        } catch(Exception e) {
            System.out.println(e.getClass().getName());//Exceptionの種類を表示
            System.out.println(e.getMessage());//エラーの内容を表示
            System.out.println("エラーが発生しました。");
        }
    }
}

