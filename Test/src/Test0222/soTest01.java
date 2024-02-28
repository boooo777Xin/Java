public class soTest01 {

    public static void main(String[] args) {
        int minami = 2;
        int doko = 197;

        hougaku(minami);
        hougaku(doko);

    }

    // 数字によって、方角を表示します
    static void hougaku(int num) {
        String result = "";
        switch (num) {
            case 0:
                result = "東";
                break;
            case 1:
                result = "西";
                break;
            case 2:
                result = "南";
                break;
            case 3:
                result = "北";
                break;
            default:
                result = "迷子";
                break;
        }

        System.out.println(num + "は" + result);
    }
}
