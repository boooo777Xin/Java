package ReviewSpecial1;

class KeisanJihanki {
    public static void main(String[] args) {

        int entryMoney = 160;
        kounyu(entryMoney);
    }

    private static void kounyu(int entryCoin) {

        if (entryCoin < 160) {
            System.out.println("金額が足りません");

        } else if (entryCoin == 160) {
            System.out.println("ドリンクが購入できました【お釣りなし】");

        } else {

            int otsuri = entryCoin - 160;
            System.out.println("ドリンクが購入できました【お釣りあり】");
            System.out.println("お釣りは" + otsuri + "円になります");

        }
    }

    private static void returnCoin(int otsuri) {

        int coinKinds[] = { 500, 100, 50, 10 };
        int sum = otsuri;
        int maisu = 0;

        for (int i = 0; i < coinKinds.length; i++) {


                
            



        }

    }
}
