class KeisanEx {
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        StaticClasses.greet = "Hello";
        StaticClasses.sayHello();

        // 足し算
        cal.plus(10);
        cal.display();

        // 引き算
        cal.minus(20);
        cal.display();

        // 掛け算
        cal.multiple(-5);
        cal.display();

        // 掛け算
        cal.multiple(2);
        cal.display();

        // 割り算
        cal.divide(100);
        cal.display();
    }
}