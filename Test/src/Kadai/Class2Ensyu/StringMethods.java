package Class2Ensyu;

public class StringMethods {
    public static void main(String[] args) {
        
        String moji = "ABCDE";

        int len = moji.length();
        System.out.println(moji + "は" + len + "文字です");

        String low = moji.toLowerCase();
        System.out.println(moji + "は" + low);

        moji = "aBdDe";
        String upper = moji.toUpperCase();
        System.out.println(moji + "は" + upper);

        String s1 = "ABC";
        String s2 = "ABC";
        boolean ret  = s1.equals(s2);
        System.out.println(s1 + "と"+ s2 + ret);

        s2 = s2.toLowerCase();
        ret = s1.equals(s2);
        System.out.println(s1 + "と"+ s2 + ret);
    }


}
