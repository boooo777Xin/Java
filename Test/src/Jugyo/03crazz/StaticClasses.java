class StaticClasses {
    static class Inner1 {
        static final String greet = "こんにちは";
        void sayHello() {
            System.out.println(greet);
        }
    }

    class Inner2 {
        String greet = "Hello";
        void sayHello() {
            System.out.println(greet);
        }
    }
}