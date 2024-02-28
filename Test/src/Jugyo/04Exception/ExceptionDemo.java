import java.io.*;

class ExceptionDemo {
    public static void main(String args[]) {

        try {
            try (FileReader fr = new FileReader("ExceptionDemo.java")) {
            } catch (FileNotFoundException e) {
                throw e;
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("era-desu");
        } finally {
            System.out.println("さいご");
        }

    }
}