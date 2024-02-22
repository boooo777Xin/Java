import javax.swing.JFrame;

class JFrameTest2 extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ｳｨﾝﾄﾞｳ終了時ﾌﾟﾛｸﾞﾗﾑ終了する様設定
        f.setSize(300, 200);
        f.setVisible(true);
    }
}