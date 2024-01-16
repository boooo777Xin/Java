package Class1Ensyu;

public class Keisan {

    public static void main(String[] args) {

        Calculation cal = new Calculation();

        // 0 + 10
        cal.plus(10);
        cal.display();

        // 10 + 40
        cal.plus(40);
        cal.display();

        // 50 + 50
        cal.plus(50);
        cal.display();

        // 100 + 20
        cal.plus(20);
        cal.display();
    }
}
