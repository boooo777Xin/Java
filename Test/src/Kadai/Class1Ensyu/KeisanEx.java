package Class1Ensyu;

public class KeisanEx {

    public static void main(String[] args) {

        Calculation cal = new Calculation();

        // 0 + 10
        cal.plus(10);
        cal.display();

        // 10 - 20
        cal.minus(20);
        cal.display();

        // -10 + 60
        cal.plus(60);
        cal.display();

        // 50 * 2
        cal.multiplied(2);
        cal.display();

        // 100 / 100
        cal.division(100);
        cal.display();

    }
}
