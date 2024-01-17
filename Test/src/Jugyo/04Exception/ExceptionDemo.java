import java.io.*;

class ExceptionDemo {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("ExceptionDemo.java");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }
}