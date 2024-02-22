import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Color;

//MouseListenerインタフェース実装
class MouseEventTest extends JFrame implements MouseListener {
    Container c;

    public static void main(String[] args) {
        MouseEventTest met = new MouseEventTest();

        met.setVisible(true);
    }

    // コンストラクタ
    public MouseEventTest() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mouse Event Test");
        setSize(400, 300);
        c = getContentPane();

        addMouseListener(this);// フレームにMouseListenerを追加
    }

    // mousePressedイベント上書き(何もしない、という内容にする)
    // mouseReleased、mouseClickedについても同様
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    // ポインタがフレームに入った時の処理
    @Override
    public void mouseEntered(MouseEvent e) {
        c.setBackground(Color.black);
        repaint();
    }

    // ポインタがフレームから出た時の処理
    @Override
    public void mouseExited(MouseEvent e) {
        c.setBackground(Color.white);
        repaint();
    }

}