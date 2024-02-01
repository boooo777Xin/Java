public class NumericInput1 {
    public static void main(String[] args) {

        Integer price = Integer.parseInt(args[0]);
        Double tax = Double.parseDouble(args[1]);

        System.out.println("料金は" + (price * (1 + tax)) + "です");

    }
}
