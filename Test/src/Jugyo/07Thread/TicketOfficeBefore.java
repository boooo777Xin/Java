// /**
//     チケット売り場
// */
// class TicketOfficeBefore {
//     public static void main(String[] args) {
//         TicketCenter tcener = new TicketCenter();
//         TicketPurchaseThread thread1 = new TicketPurchaseThread(tcener,2);
//         TicketPurchaseThread thread2 = new TicketPurchaseThread(tcener,2);
//         TicketPurchaseThread thread3 = new TicketPurchaseThread(tcener,2);

//         thread1.execute();
//         thread2.execute();
//         thread3.execute();
//     }
// }

// /**
//     チケット購入処理をするクラス
// */
// class TicketPurchaseThread {
//     static TicketCenter tc;
//     static int num;
    
//     TicketPurchaseThread(TicketCenter tcenter, int maxNumber){
//         tc = tcenter;
//         num = maxNumber;
//     }

//     public void execute() {
//         int getNum = 0;
//         int getTotalNum = 0;

//         while(true){
//             getNum = tc.buy(1); // 1枚ずつ購入することとする
//             tc.check();
//             // 購入できなくなったら終了
//             if( getNum <= 0 ){
//                 break;
//             }
//             // 購入枚数を数える
//             getTotalNum += getNum;
//             // 購入枚数を達成できたら終了
//             if( getTotalNum == num ){
//                 break;
//             }
//         }

//         System.out.println("*****"+Thread.currentThread().getName()+":"
//                             +getTotalNum+"枚購入できました");
//     }
// }

// /**
//     チケット販売処理をするクラス
// */
// class TicketCenter {
//     private int ticket = 10;    // 販売するチケットの枚数は10枚とする

//     // 指定した枚数分、チケットを販売する
//     public int buy(int num) {
//         try {
//             if( ticket <= 0 ){
//                 System.out.println("チケットは売り切れです");
//                 return 0;
//             }
//             if( ticket < num ){
//                 System.out.println("チケットは残り"+ticket+"枚です(購入できません)");
//                 return 0;
//             }
//             System.out.println("チケットを購入可能です");
//             System.out.println("チケット購入処理中・・・");
//             Thread.sleep(1000);
//             ticket = ticket - num;  // チケットを購入

//             System.out.println("チケットを"+num+"枚購入しました。");
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         return num;
//     }

//     // チケットの残りの枚数を表示する
//     public void check(){
//        System.out.println("チケットは残り"+ticket+"枚です");
//        if( ticket < 0 ){
//           System.out.println("警告：チケットの空売りが発生しています！");
//        }
//     }
// }
