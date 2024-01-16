package Class2Kadai;

import java.util.Objects;

class UserCheck {
    static final String USER_ID = "ivy"; // ユーザーID
    static final String USER_PW = "12345"; // パスワード

    public static void main(String args[]) {
        // Aさん
        String userAid = "kokomite";
        int userApw = 98765;
        String resultA = checkUserInfo1(userAid, userApw);
        // 結果
        System.out.println(userAid + ":" + userApw + "は" + resultA);

        // Bさん
        String userBid = "ivy";
        int userBpw = 12345;
        String resultB = checkUserInfo1(userBid, userBpw);
        // 結果
        System.out.println(userBid + ":" + userBpw + "は" + resultB);

        // Cさん
        String userCid = "ivy";
        int userCpw = 77777;
        String resultC = checkUserInfo1(userCid, userCpw);
        // 結果
        System.out.println(userCid + ":" + userCpw + "は" + resultC);
    }

    /*
     * ユーザーID(iptId)とパスワード(iptPw)の両方が一致したら結果を文字列で返却する
     * ①userID と iptId を比較する ②userPW と iptPw を比較する
     * ①②の両方が一致していればＯＫ、でなければＮＧ
     */
    static String checkUserInfo1(String iptId, int iptPw) {
        String ret = "";
        ret = "ユーザー情報が一致";

        if (iptId.equals(USER_ID) && (Integer.toString(iptPw).equals(USER_PW))) {
            ret += "しました";
        } else {
            ret += "しませんでした";
        }
        return ret;
    }

    /*
     * ユーザーID(iptId)とパスワード(iptPw)の両方が一致したら結果を文字列で返却する
     * ①userID と iptId を比較する ②userPW と iptPw を比較する
     * ①②の両方が一致していればＯＫ、でなければＮＧ
     */
    static String checkUserInfo2(String iptId, int iptPw) {
        String ret = "";
        ret = "ユーザー情報が一致";

        /*
         * 〇Objects.equal(A,B)
         * 戻り値:boolean型
         * 内容:引数の中にあるAとBが同じものかを判定するメソッド
         */
        if (Objects.equals(iptId, USER_ID) && (Objects.equals(Integer.toString(iptPw), USER_PW))) {
            ret += "しました";
        } else {
            ret += "しませんでした";
        }
        return ret;
    }
}