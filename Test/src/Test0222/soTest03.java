import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

class soTest03 extends JFrame implements ActionListener {
    final String userName = "admin";
    final String userPw = "12345";

    JButton btn;
    JTextField txtName;
    JTextField txtPw;
    Container conPane;
    JLabel label;

    public static void main(String[] args) {
        soTest03 frame = new soTest03();
        frame.setVisible(true);
    }

    soTest03() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ログイン");
        setSize(350, 150);

        // 部品を準備する
        conPane = getContentPane(); // コンテナ
        JPanel p = new JPanel(); // パネル

        // 入力欄とラベル
        JLabel labelName = new JLabel("ユーザー名");
        JLabel labelPw = new JLabel("パスワード");
        txtName = new JTextField("", 20);
        txtPw = new JTextField("", 20);

        // ボタン
        btn = new JButton("認証");
        btn.addActionListener(this);

        // 認証結果表示用のラベル
        label = new JLabel();

        // パネルに部品を追加する
        p.setLayout(new FlowLayout(FlowLayout.CENTER));
        p.add(labelName);
        p.add(txtName);
        p.add(labelPw);
        p.add(txtPw);
        p.add(btn);

        // 画面(コンテナ)にパネルとラベルを追加する
        conPane.add(p, BorderLayout.CENTER);
        conPane.add(label, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn) {
            // 入力欄から文字列を取得
            String name = txtName.getText();
            String pwd = txtPw.getText();

            // 未入力チェック(★ボーナス１０点)
            if (name.isEmpty()) {
                label.setText("ユーザー名を入力してください");
                return;
            }
            if (pwd.isEmpty()) {
                label.setText("パスワードを入力してください");
                return;
            }

            // ユーザー名・パスワードが一致するかどうか判定する
            if (!name.equals(userName) && pwd.equals(userPw)) {// ポイント：条件式の前に『!』をつけると否定の条件式になる
                label.setText("ユーザー名が間違っています");
                return;
            }
            if (name.equals(userName) && !pwd.equals(userPw)) {
                label.setText("パスワードが間違っています");
                return;
            }
            if (name.equals(userName) && pwd.equals(userPw)) {
                // 両方NGの場合
                label.setText("認証できました");
            } else {
                // 両方OKの場合
                label.setText("認証できませんでした");
            }
        }
    }
}
