public class soTest01 {

    public static void main(String[] args) {
        int minami = 2;
        int doko = 197;

        hougaku(minami);
        hougaku(doko);
    }

    // 数字によって、方角を表示します
    static void hougaku(int num) {

        String hougaku;
        switch (num) {
            case 0:
                hougaku = "東";
                break;
            case 1:
                hougaku = "東";
                break;
            case 2:
                hougaku = "東";
                break;
            case 3:
                hougaku = "東";
                break;
            default:
                hougaku = "迷子";
                break;
        }
        System.out.println(num + "は" + hougaku);
    }
}
