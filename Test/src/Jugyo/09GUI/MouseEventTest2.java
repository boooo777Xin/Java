import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Color;

//MouseListenerインタフェース実装
class MouseEventTest2 extends JFrame implements MouseListener { 
    Container c;
    boolean isWhite = false;

    public MouseEventTest2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        c = getContentPane();
        c.setBackground(Color.black);
        addMouseListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {
        if(isWhite) {
            c.setBackground(Color.black);
            isWhite = false;
        } else {
            c.setBackground(Color.white);
            isWhite = true;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
    public static void main(String[] args) {
        MouseEventTest2 met = new MouseEventTest2();

        met.setVisible(true);
    }
}