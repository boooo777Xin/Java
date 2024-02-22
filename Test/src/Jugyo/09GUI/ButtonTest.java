import javax.swing.*;
import java.awt.*;

class ButtonTest extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 100);

        Container c = f.getContentPane(); // コンテナc作成
        JButton b1 = new JButton("Push!"); // ボタンb1作成
        JButton b2 = new JButton("me"); // ボタンb2作成
        JButton b3 = new JButton("Please.");// ボタンb3作成
        c.add(b1); // コンテナcにボタンb1を追加
        c.add(b2); // コンテナcにボタンb2を追加
        c.add(b3); // コンテナcにボタンb3を追加

        f.setVisible(true);

        
    }
}