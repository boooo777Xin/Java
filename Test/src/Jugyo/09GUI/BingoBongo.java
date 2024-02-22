import java.util.Random;
import java.util.Scanner;

class BingoBongo {
    public static int[][] card = new int[5][5];
    public static int[][] hits = new int[5][5];
    // ビンゴゲームに使うカードを作成します
    public static void main(String[] args) {
        CardShow();
        System.out.println("抽選を開始します");
        GameStart();
    }
    static void CardShow(){

        //配列作成
        Random rnd = new Random();
        int rVal;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                while(true) {
                    rVal = rnd.nextInt(14 ) + 1 + (15 * i);
                    //重複チェック
                    for(int k=0;k<5;k++){
                        if(card[i][k] == rVal){
                            rVal = -1;
                            break;
                        }
                    }
                    if(rVal!=-1) break;//重複が無ければwhileループを抜ける
                }
                card[i][j] = rVal;
            }
        }
        card[2][2] = 0;
        hits[2][2] = 1;

        //表示
        resultShow();
    }
    static void resultShow(){
        System.out.println("  B   I   N   G   O");
        for(int j = 0; j < 5; j++){
            for(int i = 0; i < 5; i++){
                
                if(card[i][j] < 10){
                    System.out.print(" ");
                }
                if(hits[i][j]==1){
                    System.out.print("(");
                } else {
                    System.out.print(" ");
                }
                System.out.print(card[i][j]);
                if(hits[i][j]==1) {
                    System.out.print(")");
                } else {
                    System.out.print(" ");
                }
                // System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void GameStart(){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int[] vals = new int[75];//抽選で既に出た値を保持する配列(int型配列なので初期値は全て0)
        int valCnt = 0;//抽選回数
        while(true) {//⓵
            System.out.print("抽選ＧＯ");
            sc.nextLine();//Enterを押させる
            int val;
            while(true) {//⓶
                val = rnd.nextInt(75) + 1;
                boolean flg = false;
                for(int i=0;i<vals.length;i++) {
                    if (vals[i] == 0) break;
                    if (vals[i] == val){
                        flg = true;
                        break;
                    } 
                }
                if (!flg) break;//既出番号との重複がなければ⓶ループを抜ける
            }
            vals[valCnt] = val;
            valCnt++;
            //抽選番号の表示
            System.out.println("抽選番号：");
            for(int i=0;i<valCnt;){
                System.out.print(vals[i]+" ");
                i++;
                if(i%5==0) System.out.println();//5個表示したら改行
            }
            System.out.println();

            //ビンゴカード上に抽選で出た番号があれば、hitsに保存
            for(int j = 0; j < 5; j++){
                for(int i = 0; i < 5; i++){
                    if(card[i][j] == val){
                        hits[i][j] = 1;
                    }
                }
            }            
            resultShow();
            if (bingoCheck()) break; // ビンゴが成立したら⓵ループを抜ける
        }
        sc.close();
    }

    static boolean bingoCheck(){
        boolean ret = false;
        int[] xLineCnt = new int[5];//横ラインのカウント
        int xLineCntMax = 0;
        int[] yLineCnt = new int[5];//縦ラインのカウント
        int yLineCntMax = 0;
        int clossLineCnt1 = 0; //斜めラインのカウント１
        int clossLineCnt2 = 0; //斜めラインのカウント２
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(hits[i][j] == 1){
                    xLineCnt[j]++;
                    yLineCnt[i]++;
                    if(i == j) clossLineCnt1++;//(0,0),(1,1),(2,2),(3,3),(4,4)のマス
                    if(j == (4 - i)) clossLineCnt2++;//(0,4),(1,3),(2,2),(3,1),(4,0)のマス
                }
            }
        }
        
        for(int k = 0;k<5;k++) {
            if (xLineCntMax < xLineCnt[k]) {
                xLineCntMax = xLineCnt[k];
            }
            if (yLineCntMax < yLineCnt[k]) {
                yLineCntMax = yLineCnt[k];
            }
        }
        if (xLineCntMax == 5 || yLineCntMax == 5 || clossLineCnt1 == 5 || clossLineCnt2 == 5) {
            System.out.println("ＢＩＮＧＯ！");
            ret = true;
        } else if (xLineCntMax == 4 || yLineCntMax == 4 || clossLineCnt1 == 4 || clossLineCnt2 == 4) {
            if (xLineCntMax == 4) {
                for(int k = 0;k<5;k++) {
                    if (xLineCnt[k]==4) {
                        System.out.println((k+1)+"行目がリーチです");
                    }
                }
            }
            if (yLineCntMax == 4) {
                for(int k = 0;k<5;k++) {
                    if (yLineCnt[k]==4) {
                        System.out.println((k+1)+"列目がリーチです");
                    }
                }
            }
            if (clossLineCnt1 == 4) {
                System.out.println("右下斜め(\\)がリーチです");
            }
            if (clossLineCnt2 == 4) {
                System.out.println("左下斜め(/)がリーチです");
            }
        }
        return ret;
    }
}