
import java.util.Random;

public class TodayUranai {
    public static void main(String[] args) {
        uranai();
    }

    static void uranai() {

        String[] syubetsu = { "仕事運", "金　運", "恋愛運" };
        String output = "";
        Random rm = new Random();

        for (int i = 0; i < syubetsu.length; i++) {
            output += syubetsu[i] + ":";
            int rmint = rm.nextInt(5)+1;
            for (int n = rmint; n > 0; n--) {
                output += "★ ";
            }
            for (int n = 5-rmint; n > 0; n--) {
                output += "☆ ";
            }
            output += "\n";
        }

        System.out.println(output);

    }
}
