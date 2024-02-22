import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

//ActionListenerインタフェース実装
class EventTest extends JFrame implements ActionListener {
    JButton whiteButton, blackButton; // ボタンのオブジェクト変数
    Container c; // コンテナのオブジェクト変数

    public static void main(String[] args) {
        EventTest et = new EventTest();

        et.setVisible(true);
    }

    // コンストラクタ
    public EventTest() {
        
        // コンストラクタではフレームの実体を作成する必要なし(setSize等の前に『f.』不要)
        // 閉じたときのプログラム挙動を指定
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ウィンドウのタイトル設定
        setTitle("Event Test");

        // 画面サイズを指定
        setSize(400, 300);

        // JFrameからコンテナを取得
        c = getContentPane();

        // ボタンを取得
        whiteButton = new JButton("白");
        blackButton = new JButton("黒");

        whiteButton.addActionListener(this);// whiteButtonにActionListenerを追加
        blackButton.addActionListener(this);// blackButtonにActionListenerを追加

        // レイアウトを指定
        c.setLayout(new FlowLayout());
        c.add(whiteButton);
        c.add(blackButton);
    }

    // アクションが起きた時に何をするかを記述するメソッド
    @Override
    public void actionPerformed(ActionEvent e) {
        Color col; // 色の情報を入れるオブジェクト変数
        if (e.getSource() == whiteButton) {
            col = Color.white; // 『白』ボタンをクリックした時の背景色
        } else {
            col = Color.black; // 『黒』ボタンをクリックした時の背景色
        }
        c.setBackground(col); // 背景色の設定変更
        repaint(); // 再描画
    }

}