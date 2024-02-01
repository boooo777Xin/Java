import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLtest {

    public static void main(String args[]) {

        URL u = null;
        try {
            u = new URL("http://www.gihyo.co.jp/");
        } catch (MalformedURLException e) {
            System.out.println("URLが正しくないです");
            System.exit(0);
        }

        try (InputStream in = u.openStream();
                InputStreamReader is = new InputStreamReader(in)) {

            BufferedReader br = new BufferedReader(is);
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("エラーが発生しました");
        }

    }
}
