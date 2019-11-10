import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        ProcessBuilder child = new ProcessBuilder("C:\\Users\\Slava\\YandexDisk\\Project\\lib\\TestLib\\src\\psutil_lib.exe");

        Process process = null;
        try {
            process = child.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream gg = process.getInputStream();
        Scanner s = new Scanner(gg).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";
        System.out.println(result);
    }
}
