
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class TextFieldGUI extends JFrame implements ActionListener {
    JTextField text1;
    JTextField text2;
    JLabel label;
    JButton button1;
    JButton button2;

    // メイン
    public static void main(String[] args) {
        TextFieldGUI frame = new TextFieldGUI("タイトル");
        frame.setVisible(true);
    }

    // コンストラクタ
    TextFieldGUI(String title) {
        // ウィンドウ設定
        setTitle(title); // タイトル名設定
        setSize(500, 400); // 表示位置を大きさ(x座標,y座標,幅,高さ)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ウィンドウを閉じる = ⌃c

        // パネル (他のコンポーネントの枠組みとして使用)
        JPanel p = new JPanel();

        // コンポーネント作成
        text1 = new JTextField("住所1", 20);
        text2 = new JTextField("住所2", 20);
        button1 = new JButton("取得");
        button2 = new JButton("リセット");
        label = new JLabel();
        button1.addActionListener(this); // ｢取得｣ボタンへイベントリスナー設定
        button2.addActionListener(this); // ｢リセット｣ボタンへイベントリスナー設定

        // パネルにコンポーネントを配置
        p.add(text1);
        p.add(text2);
        p.add(button1);
        p.add(button2);

        // パネルとラベルをコンテナに配置
        Container contentPane = getContentPane();
        contentPane.add(p, BorderLayout.CENTER);
        contentPane.add(label, BorderLayout.SOUTH);

        // 配置完了
        // label.setText("ボタンを押してください");
        // p.setBackground(Color.yellow);
    }

    // イベント処理
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            // テキストエリアの内容をラベルに表示する
            label.setText(text1.getText() + text2.getText());

        } else {
            text1.setText("住所1");
            text2.setText("住所2");
            label.setText("");
        }
    }
}