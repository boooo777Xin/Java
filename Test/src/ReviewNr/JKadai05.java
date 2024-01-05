package ReviewNr;

class JKadai05 {
    public static void main(String[] args) {

        int even = 12;
        int odd = 7;

        if (even % 2 == 0) {
            System.out.println(even + "は" + checkEvenCheck(even) + "です。");
        }

        if (odd % 2 != 0) {
            System.out.println(odd + "は" + checkEvenCheck(odd) + "です。");
        }

    }

    private static String checkEvenCheck(int num) {

        if (num % 2 == 0) {

            return "偶数";
            
        }
        return "奇数";
    }
}
