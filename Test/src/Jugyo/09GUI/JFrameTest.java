import javax.swing.*;

class JFrameTest extends JFrame {
    public static void main(String[] args) {

        // フレームの作成
        JFrame f = new JFrame();

        // フレームサイズの設定
        f.setSize(300, 200);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ｳｨﾝﾄﾞｳ終了時ﾌﾟﾛｸﾞﾗﾑ終了する様設定
        // フレームの開示
        f.setVisible(true);
    }
}