package ClassHard1;

import java.util.Random;

public class IsAmariCheck {

    public static void main(String[] args) {

        Random rm = new Random();
        int a = rm.nextInt(100) + 1;
        int b = rm.nextInt(10) + 1;
        System.out.println("a:" + a + ", b:" + b);

        boolean ret = amari(a, b);
        System.out.println("余り：" + ret);

    }

    static boolean amari(int a, int b) {
        return a % b == 0 ? false : true;
    }
}
