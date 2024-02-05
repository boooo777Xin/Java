import java.util.*;

public class MoneyCountList {

    /*
     * MoneyInputを少し高度に書いたVersion
     */
    public static void main(String[] args) {

        System.out.print("金額を入力して下さい -> ");
        try {
            Scanner sin = new Scanner(System.in);
            Integer inputMoney = sin.nextInt();
            MoneyCountList.moneyOutput(inputMoney);
            sin.close();
        } catch (InputMismatchException e) {
            System.out.println("数字以外が入力されています");
        }
    }

    public static void moneyOutput(Integer price) {

        Map<Integer, String> moneyMap = new LinkedHashMap<>();
        moneyMap.put(10000, "一万円札");
        moneyMap.put(5000, "五千円札");
        moneyMap.put(1000, "千円札");
        moneyMap.put(500, "五百円玉");
        moneyMap.put(100, "百円玉");
        moneyMap.put(50, "五十円玉");
        moneyMap.put(10, "十円玉");
        moneyMap.put(5, "五円玉");
        moneyMap.put(1, "一円玉");

        for (Map.Entry<Integer, String> entry : moneyMap.entrySet()) {
            System.out.println(entry.getValue() + ":" + price / entry.getKey() + "枚");
            price %= entry.getKey();
        }
    }

    /*
     * 〇List<任意型>
     * 概要：順番を担保した<任意型>の配列を持つクラス
     * ◇代表メソッド
     * ・list型変数.add(i):iをリストに加える
     * ・list型変数.remove(i):iをリストから除く
     * ・list型変数.get(int i):i番目の要素を取り出す
     * 
     */

}
