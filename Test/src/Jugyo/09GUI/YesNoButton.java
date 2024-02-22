import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.FlowLayout;

class YesNoButton extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 100);

        Container c = f.getContentPane();//穴埋め➀
        c.setLayout(new FlowLayout(FlowLayout.RIGHT));  //穴埋め➁
        JButton b1 = new JButton("YES");
        JButton b2 = new JButton("NO");
        c.add(b1);//穴埋め➂
        c.add(b2);//穴埋め➂

        f.setVisible(true);
    }
}