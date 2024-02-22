import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.Random;

class BingoGUI extends JFrame implements ActionListener {

    JButton startButton;
    JButton gameButton;

    JLabel[][] numbers;
    // JLabel message;
    
    JTextArea messageArea;

    public static int[][] card = new int[5][5];
    public static int[][] hits = new int[5][5];
    int valCnt = 0;//抽選回数
    int[] vals = new int[75];//抽選で既に出た値を保持する配列(int型配列なので初期値は全て0)
    
    public static void main(String args[]) {
        new BingoGUI();
    }

    BingoGUI(){
        setTitle("ビンゴゲーム");
        setBounds(100, 100, 300, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // startButton = new JButton("開始");
        gameButton = new JButton("抽選");
        gameButton.addActionListener(this);

        JPanel northPanel = new JPanel();
        JPanel southPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        // northPanel.add(startButton);
        northPanel.add(gameButton);
        northPanel.setBackground(Color.BLACK);

        numbers = new JLabel[5][5];
        JPanel[] numberPanel = new JPanel[5];
        LineBorder border = new LineBorder(Color.BLACK, 1, true);

        makeBingoCard();
        for(int j=0;j<5;j++) {
            numberPanel[j] = new JPanel();
            for(int i=0;i<5;i++) {
                String labelStr = " "+Integer.toString(card[i][j])+" ";
                numbers[i][j] = new JLabel(labelStr);
                numbers[i][j].setHorizontalAlignment(JLabel.CENTER);
                numbers[i][j].setPreferredSize(new Dimension(30, 30));//マスの大きさ設定
                numbers[i][j].setBorder(border);
                numbers[i][j].setOpaque(true); //背景を不透明にする(背景色塗るため)
                numberPanel[j].add(numbers[i][j]);
            }
            centerPanel.add(numberPanel[j]);
        }
        numbers[2][2].setBackground(Color.LIGHT_GRAY);//真ん中のマスをあける

        messageArea = new JTextArea(7, 20);
        messageArea.setBackground(Color.BLACK);
        messageArea.setForeground(Color.WHITE);
        messageArea.setLineWrap(true);
        messageArea.setText("☆抽選ボタンを押してビンゴ開始☆");
        southPanel.add(messageArea);
        southPanel.setBackground(Color.BLACK);
        
        Container contentPane = getContentPane();
        contentPane.add(northPanel, BorderLayout.NORTH);
        contentPane.add(centerPanel, BorderLayout.CENTER);
        contentPane.add(southPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void setButton(JButton button) {
        button.addActionListener(this);
        button.setPreferredSize(new Dimension(100, 35));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GameStart();
    }

    public void GameStart(){
        Random rnd = new Random();
        int val;
        while(true) {//⓵
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
        String str = "抽選番号：";
        for(int i=0;i<valCnt;i++){
            if (vals[i] == 0) continue;
            if (vals[i] < 10) str += " ";
            str += vals[i]+" ";
        }
        messageArea.setText(str);

        //ビンゴカード上に抽選で出た番号があれば、hitsに保存
        for(int j = 0; j < 5; j++){
            for(int i = 0; i < 5; i++){
                if(card[i][j] == val){
                    if (hits[i][j] == 0) { //今回ヒットしたところは背景をグレーにする
                        numbers[i][j].setBackground(Color.LIGHT_GRAY);
                    }
                    hits[i][j] = 1;
                }
            }
        }
        repaint();    
        gameButton.setEnabled(!bingoCheck());// ビンゴが成立したら抽選ボタンを押せなくする
    }

    //ビンゴが成立したかチェック(リーチもここで判定)
    boolean bingoCheck(){
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
            //ビンゴになったラインがある場合
            // System.out.println("ＢＩＮＧＯ！");
            //塗りつぶしのため、どの列や行がビンゴになったか探す
            if (xLineCntMax == 5) { //列
                for(int k = 0;k<5;k++) {
                    if (xLineCnt[k]==5) {
                        bingoRows(k);
                    }
                }
            }
            if (yLineCntMax == 5) { //行
                for(int k = 0;k<5;k++) {
                    if (yLineCnt[k]==5) {
                        bingoCols(k);
                    }
                }
            }
            if (clossLineCnt1 == 5) { //右下斜め(\)
                bingoRightDiagonal();
            }
            if (clossLineCnt2 == 5) { //左下斜め(/)
                bingoLeftDiagonal();
            }
            ret = true;

        } else if (xLineCntMax == 4 || yLineCntMax == 4 || clossLineCnt1 == 4 || clossLineCnt2 == 4) {
            //リーチになったラインがある場合
            if (xLineCntMax == 4) {
                for(int k = 0;k<5;k++) {
                    if (xLineCnt[k]==4) {
                        // System.out.println((k+1)+"行目がリーチです");
                        reachRows(k);
                    }
                }
            }
            if (yLineCntMax == 4) {
                for(int k = 0;k<5;k++) {
                    if (yLineCnt[k]==4) {
                        // System.out.println((k+1)+"列目がリーチです");
                        reachCols(k);
                    }
                }
            }
            if (clossLineCnt1 == 4) {
                // System.out.println("右下斜め(\\)がリーチです");
                reachRightDiagonal();
            }
            if (clossLineCnt2 == 4) {
                // System.out.println("左下斜め(/)がリーチです");
                reachLeftDiagonal();
            }
        }
        return ret;
    }

    //リーチの行の既に開いているマスの背景色を変える
    void reachRows(int rowNum){
        for(int i = 0;i<5;i++) {
            if (hits[i][rowNum] != 0) numbers[i][rowNum].setBackground(Color.YELLOW);
        }
    }
    //リーチの列の既に開いているマスの背景色を変える
    void reachCols(int colNum){
        for(int j = 0;j<5;j++) {
            if (hits[colNum][j] != 0) numbers[colNum][j].setBackground(Color.YELLOW);
        }
    }
    //右下斜め(\)リーチのとき開いているマスの背景色を変える
    void reachRightDiagonal(){
        for(int k = 0;k<5;k++) {
            if (hits[k][k] != 0) numbers[k][k].setBackground(Color.YELLOW);
        }        
    }
    //左下斜め(/)リーチのとき開いているマスの背景色を変える
    void reachLeftDiagonal(){
        for(int k = 0;k<5;k++) {
            if (hits[k][4-k] != 0) numbers[k][4-k].setBackground(Color.YELLOW);
        }        
    }

    //ビンゴの行のマスの背景色を変える
    void bingoRows(int rowNum){
        for(int i = 0;i<5;i++) {
            numbers[i][rowNum].setBackground(Color.RED);
        }
    }
    //ビンゴの列のマスの背景色を変える
    void bingoCols(int colNum){
        for(int j = 0;j<5;j++) {
            numbers[colNum][j].setBackground(Color.RED);
        }
    }
    //右下斜め(\)ビンゴのとき開いているマスの背景色を変える
    void bingoRightDiagonal(){
        for(int k = 0;k<5;k++) {
            numbers[k][k].setBackground(Color.RED);
        }        
    }
    //左下斜め(/)ビンゴのとき開いているマスの背景色を変える
    void bingoLeftDiagonal(){
        for(int k = 0;k<5;k++) {
            numbers[k][4-k].setBackground(Color.RED);
        }        
    }

    //ビンゴカードの作成
    static void makeBingoCard(){
        //配列作成
        Random rnd = new Random();
        int rVal;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                while(true) {
                    rVal = rnd.nextInt(14 ) + 1 + (15 * i);
                    //重複チェック(縦方向のみ)
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
    }
}
