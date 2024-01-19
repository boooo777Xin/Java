package Class2Kadai;
import java.util.Random;

public class TodayOmikuji {

    public static void main(String[] args) {

        Random rm = new Random();
        omikuji(rm.nextInt(7));
    }

    static void omikuji(int rmInt) {

        String message = "";
        switch (rmInt) {
            case 0:
                message = "【大吉】\n 一言:何をしても許されるでしょう";
                break;
            case 1:
                message = "【中吉】\n 一言:あと一歩でしょう";
                break;
            case 2:
                message = "【小吉】\n 一言:ちょっぴりいいでしょう";
                break;
            case 3:
                message = "【吉】\n 一言:平凡です";
                break;
            case 4:
                message = "【末吉】\n 一言:うーん微妙";
                break;
            case 5:
                message = "【凶】\n 一言:外に出ない方がいいでしょう";
                break;
            case 6:
                message = "【大凶】\n 一言:ヌルぽ,ガッ!!!";
                break;
            default:
                message = "hoge";
                break;
        }
        System.out.println(message);
    }
}
