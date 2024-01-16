import java.util.Random;

class StaticClasses {

    public static String greet = "こんにちは";

    static void sayHello() {
        System.out.println(greet);

        String userA = "hashimoto";
        String userB = "turuda";

        // 課題ユーザーチェック
        boolean bool = userA.equals(userB);

        // おみくじ
        Random rm = new Random();
        int i = rm.nextInt();

    }
}