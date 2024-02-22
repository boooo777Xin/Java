import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

class TextCheckGUI extends JFrame implements ActionListener {
    JTextArea textBox;
    JTextField textLine;
    JButton button;
    JLabel label1;
    JLabel label2;

    // メイン
    public static void main(String[] args) {
        TextCheckGUI frame = new TextCheckGUI("タイトル");
        frame.setVisible(true);
    }

    // コンストラクタ
    TextCheckGUI(String title) {
        // ウィンドウ
        setTitle(title); //タイトル設定
        setBounds(100, 100, 330, 250); //表示位置と大きさ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ウィンドウを閉じる = ⌃c
        
        // パネル (他のコンポーネントの枠組みとして使用)
        JPanel p = new JPanel();

        // コンポーネント作成
        textBox = new JTextArea(5,25);
        textLine = new JTextField(7);
        button = new JButton("　文字数チェック　");
        label1 = new JLabel("入力制限文字数");
        label2 = new JLabel();
        button.addActionListener(this);
        button.setBackground(Color.blue);

        // パネルにコンポーネントを配置
        p.add(textBox);
        p.add(label1);
        p.add(textLine);
        p.add(button);
        p.add(label2);
        
        // パネルとラベルをコンテナに配置
        Container contentPane = getContentPane();
        contentPane.add(p, BorderLayout.CENTER);
        contentPane.add(label2, BorderLayout.SOUTH);
    } 

    // イベント処理
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = textBox.getText(); //文字列取得
        String kazuS = textLine.getText(); //制限文字数取得

        try {
        	int kazu = Integer.valueOf(kazuS); //int型に変換
            // 制限有
            if(kazu >= 1) {
                kazu = str.length() - kazu; //オーバー数カウント
                label2.setText("文字数 : " + str.length() + "　" + "文字オーバー : " + kazu);
            }
            // 制限無
            else {
                label2.setText("文字数 : " + str.length());
            }
        } catch (NumberFormatException ex) {
            if(kazuS.equals("")) {
                label2.setText("文字数 : " + str.length()); //入力が空白
            }
            else {
                label2.setText("制限文字数は数字で入力してください"); //入力が数字以外
            }
        }
    }
}