package ClassHard1;
import java.util.Random;

public class Aisatsu {

    public static void main(String[] args) {

        int rm = new Random().nextInt(3) + 1;
        aisatsu(rm);
    }

    static void aisatsu(int i) {

        switch (i) {
            case 1:
                System.out.println("おはよう。");
                break;
            case 2:
                System.out.println("こんにちは。");
                break;
            case 3:
                System.out.println("こんばんわ。");
                break;
            default:
                break;
        }

    }
}
