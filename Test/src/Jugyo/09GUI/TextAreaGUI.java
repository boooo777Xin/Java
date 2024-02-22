import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class TextAreaGUI extends JFrame implements ActionListener {
    JTextArea textA1;
    JTextArea textA2;
    JButton button1;
    JButton button2;

    // メイン
    public static void main(String[] args) {
        TextAreaGUI frame = new TextAreaGUI("タイトル");
        frame.setVisible(true);
    }

    // コンストラクタ
    TextAreaGUI(String title) {
        // ウィンドウ
        setTitle(title);
        setBounds(100, 100, 320, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // パネル (他のコンポーネントの枠組みとして使用)
        JPanel p = new JPanel();

        // コンポーネント作成
        textA1 = new JTextArea(8, 10); //エリアサイズ(行, 列)
        textA2 = new JTextArea(8, 10);
        button1 = new JButton(" 全て取得 "); //ボタンのタイトル
        button2 = new JButton("20文字取得");
        textA1.setLineWrap(true); //折り返しON(デフォルトはfalse)
        textA2.setLineWrap(true);
        textA2.setBackground(Color.lightGray); //背景色設定
        textA2.setEditable(false); //編集不可設定
        button1.addActionListener(this); //｢取得｣ボタンへイベントリスナー設定
        button2.addActionListener(this); //｢20文字取得｣ボタンへイベントリスナー設定

        // パネルにコンポーネントを配置
        p.add(textA1);
        p.add(textA2);
        p.add(button1);
        p.add(button2);

        // パネルをコンテナに配置
        Container contentPane = getContentPane();
        contentPane.add(p, BorderLayout.CENTER);
    }

    // イベント処理
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = textA1.getText();
        if(e.getSource() == button1) {
            // 全て取得処理
            textA2.setText(str);
        }
        else {
            // 20文字取得処理
            textA2.setText(str.substring(0, 20));
        }
    }
}

