package Test0201;

public class miniTestTsuishi {
    public static void main(String[] args) {

        int yotei1 = 28;
        int yotei2 = 9;

        System.out.println(decemberYotei(yotei1));
        System.out.println(decemberYotei(yotei2));

    }

    private static String decemberYotei(int day) {
        String str = "";
        str += day + "日";

        switch (day) {
            case 25:
                str += "クリスマス";
                break;
            case 28:
                str += "大掃除";
                break;
            case 31:
                str += "大晦日";
                break;
            default:
                str += "予定はない";
                break;
        }

        return str;
    }
}
