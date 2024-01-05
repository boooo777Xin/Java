package ReviewSpecial1;

class KeisanJihanki {
    public static void main(String[] args) {
       
        char mojis[] = {'c','a','c','b','c','c','c','d'};
        int mojislen = 8;

        char targetMoji = 'c';

        int kazu = searchChar(mojis, mojislen, targetMoji);

        System.out.println("文字型" + targetMoji + "は" + kazu +"個ありました。");

    }

    private static int searchChar(char[] chars, int charslen, char searchChar) {

        int charCount = 0;
        for (int i = 0; i < charslen; i++) {
            if (chars[i] == searchChar) {
                charCount++;
            }
        }
        return charCount;
    }
}
