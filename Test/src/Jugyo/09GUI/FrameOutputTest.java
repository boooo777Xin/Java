import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.Graphics;

class myPanel extends JPanel { //独自のパネルのクラスを作る
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hello.", 150, 100);//『Hello.』を(150,100)の位置に描画
    }
}
class FrameOutputTest extends JFrame{
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 200);
        Container contentPane = f.getContentPane();
        myPanel p = new myPanel();
        contentPane.add(p);

        f.setVisible(true);
    }
}
