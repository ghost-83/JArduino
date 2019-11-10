import java.io.*;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        ProcessBuilder child = new ProcessBuilder("C:\\Users\\Slava\\YandexDisk\\Project\\lib\\TestLib\\src\\psutil_lib.exe");

        Process process = null;
        try {
            process = child.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length = 0;
        while (true) {
            try {
                if (!((length = process.getInputStream().read(buffer, 0, 1024)) != -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            result.write(buffer, 0, length);
            }
        String gg = result.toString("UTF-8");
        System.out.println(gg);
    }
}
