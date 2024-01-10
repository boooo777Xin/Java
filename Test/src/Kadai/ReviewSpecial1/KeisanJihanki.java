package ReviewSpecial1;

class KeisanJihanki {
    public static void main(String[] args) {

        int entryMoney = 450;
        kounyu(entryMoney);
    }

    private static void kounyu(int entryCoin) {

        if (entryCoin < 160) {
            // 金額足りない
            System.out.println("金額が足りません");

        } else if (entryCoin == 160) {
            // ピタリ
            System.out.println("ドリンクが購入できました【お釣りなし】");

        } else {
            // お釣りあり
            int otsuri = entryCoin - 160;
            System.out.println("ドリンクが購入できました【お釣りあり】");
            System.out.println("お釣りは" + otsuri + "円になります");

            // 硬貨種別ごとに釣銭枚数を算出
            int coinKinds[] = { 500, 100, 50, 10 };
            int maisu[] = new int[4];
            String tsuriMessage = "返却硬貨は、";

            for (int i = 0; i < 4; i++) {

                maisu[i] = otsuri / coinKinds[i];
                otsuri -= coinKinds[i] * maisu[i];
                tsuriMessage += coinKinds[i] + "円玉 " + maisu[i];

                if (coinKinds[i] == 10) {
                    tsuriMessage += "枚";
                } else {
                    tsuriMessage += "枚、";
                }
            }
            System.out.println(tsuriMessage);
        }
    }
}
