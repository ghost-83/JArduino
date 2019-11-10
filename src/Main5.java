import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Main5 {
    public static void main(String[] args) {

        ProcessBuilder child = new ProcessBuilder("C:\\Users\\Slava\\YandexDisk\\Project\\lib\\TestLib\\src\\psutil_lib.exe");

        Process process = null;
        String gg = "";
        try {
            process = child.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            gg = new InputStreamReader(process.getInputStream(), "UTF-8").toString();
        } catch (UnsupportedEncodingException e) {
           e.printStackTrace();
        }
        System.out.println(gg);
    }
}
