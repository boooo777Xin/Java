package ReviewHard;

class JKadai07 {
    public static void main(String[] args) {

        int shou = 5;
        int tyu = 60;
        int dai = 110;

        massage(shou);
        massage(tyu);
        massage(dai);

    }

    private static void massage(int count) {

        System.out.println("肩たたきを" + count + "回します。");
        
        for (int i = 1; i <= count; i++) {
            System.out.print("トン。");
        }

        System.out.println("終わりました。");

        if (count < 50) {

            System.out.println("うーん。もう少ししてほしいです。");

        } else if (count < 100) {

            System.out.println("いい感じ。ほぐれました。");

        } else {

            System.out.println("痛い。やりすぎたようです。");

        }

    }
}
