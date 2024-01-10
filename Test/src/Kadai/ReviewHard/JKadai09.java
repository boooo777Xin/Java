package ReviewHard;

class JKadai09 {
    public static void main(String[] args) {

        printAlphabet(3);
        printAlphabet(7);
        printAlphabet(8);

    }

    private static void printAlphabet(int num) {

        char alphabet[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
        String message = "";
        if (num < 8) {

            for (int count = 0; count < num; count++) {
                message += alphabet[count];
            }

            message += "→" + num + "文字表示しました。";

        } else {
            message = "8文字以上は表示できません";
        }
        System.out.println(message);
    }
}
