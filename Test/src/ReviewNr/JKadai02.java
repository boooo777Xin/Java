package ReviewNr;

class JKadai02 {
    public static void main(String[] args) {

        //int型の配列を用意、要素数は3
        int price[] = new int[3];

        //0,1,2番目にそれぞれの数を代入
        price[0] = 120;
        price[1] = 380;
        price[2] = 80;

        System.out.println(price[2]);
        System.out.println(price[1]);
        System.out.println(price[0] + price[2]);

    }
}
