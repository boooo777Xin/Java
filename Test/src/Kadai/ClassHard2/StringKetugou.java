
public class StringKetugou {
    public static void main(String[] args) {

        int max = 5;
        String str = "";
        for (int i = 0; i < max; i++) {
            str += "☆ ";
        }
        System.out.println("加算 :" + str);

        String str2 = "";
        for (int i = 0; i < max; i++) {
            str2 = str2.concat("★ ");
        }
        System.out.println("メソッド :" + str);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            sb.append("〇");
        }
        System.out.println("StringBuilder :" + sb.toString());
    }
}
