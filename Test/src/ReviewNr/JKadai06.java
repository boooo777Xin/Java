package ReviewNr;

class JKadai06 {
    public static void main(String[] args) {

        int may = 5;
        int oct = 10;
        int num = 23;

        System.out.println(monthWamei(may));
        System.out.println(monthWamei(oct));
        System.out.println(monthWamei(num));

    }

    
    private static String monthWamei(int month) {

        String result = "";
        switch (month) {
            case 1:
                result = "睦月";
                break;
            case 2:
                result = "如月";
                break;
            case 3:
                result = "弥生";
                break;
            case 4:
                result = "卯月";
                break;
            case 5:
                result = "皐月";
                break;
            case 6:
                result = "水無";
                break;
            case 7:
                result = "文月";
                break;
            case 8:
                result = "葉月";
                break;
            case 9:
                result = "長月";
                break;
            case 10:
                result = "神無月";
                break;
            case 11:
                result = "霜月";
                break;
            case 12:
                result = "師走";
                break;
            default:
                result = "そのような月はありません";
                break;
        }

        return month + "月は" + result + "です。";

    }
}
