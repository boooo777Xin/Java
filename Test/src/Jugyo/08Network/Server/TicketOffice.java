class TicketOfficehenkou {
    public static void main(String[] args) {
        TicketCenter tcener = new TicketCenter();
        TicketPurchaseThread thread1 = new TicketPurchaseThread(tcener, 10);
        TicketPurchaseThread thread2 = new TicketPurchaseThread(tcener, 10);
        TicketPurchaseThread thread3 = new TicketPurchaseThread(tcener, 10);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

/*
 * チケット購入処理をするクラス
 */
class TicketPurchaseThread extends Thread { // ここにextends Threadをつけた。 正解
    static TicketCenter tc;
    static int num;



    TicketPurchaseThread(TicketCenter tcenter, int maxNumber) {
        tc = tcenter;
        num = maxNumber;
    
    }

    @Override
    public void run() {
        int getNum = 0;
        int getTotalNum = 0;

        while (true) {
            synchronized (tc) { // ここにsynchronizedをつけた。 正解
                getNum = tc.buy(1);
            }

            tc.check();
            // 購入できなくなったら終了
            if (getNum <= 0) {
                break;
            }
            // 購入枚数を達成できたら終了
            if (getNum == num) {
                break;
            }
            // 購入枚数を数える
            getTotalNum += getNum;
        }

        System.out.println("*****" + Thread.currentThread().getName() + ":"
                + getTotalNum + "枚購入できました");
    }
}

/*
 * チケット販売処理をするクラス
 */
class TicketCenter {
    private int ticket = 10; // 販売するチケットの枚数は10枚とする

    // 指定した枚数分、チケットを販売する
    public int buy(int num) {
        try {
            if (ticket <= 0) {
                System.out.println("チケットは売り切れです");
                return 0;
            }
            if (ticket < num) {
                System.out.println("チケットは残り" + ticket + "枚です(購入できません)");
                return 0;
            }
            System.out.println("チケットは購入可能です");
            System.out.println("チケット購入処理中・・・");
            Thread.sleep(1000);
            ticket = ticket - num; // チケットを購入

            System.out.println("チケットを" + num + "枚購入しました。");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return num;
    }

    // チケットの残りの枚数を表示する
    public void check() {
        System.out.println("チケットは残り" + ticket + "枚です");
        if (ticket < 0) {
            System.out.println("警告：チケットの空売りが発生しています！");
        }
    }
}