import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Main4 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        ProcessBuilder child = new ProcessBuilder("C:\\Users\\Slava\\YandexDisk\\Project\\lib\\TestLib\\src\\psutil-lib.exe");

        Process process = null;
        try {
            process = child.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length = 0;
        try {
            length = process.getInputStream().read(buffer, 0, 1024);
        } catch (IOException e) {
            e.printStackTrace();
        }
        result.write(buffer, 0, length);
        String gg = result.toString("UTF-8");
        System.out.println(gg);
    }
}
