import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.GridLayout;

class FlowLayoutTest extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 100);

        Container c = f.getContentPane();
        c.setLayout(new GridLayout(3, 2)); // 右揃えのFlowLayout
        JButton b1 = new JButton("Push!");
        JButton b2 = new JButton("me");
        JButton b3 = new JButton("Please.");
        JButton b4 = new JButton("aaaa.");
        JButton b5 = new JButton("aaaa.");
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);

        f.setVisible(true);
    }
}