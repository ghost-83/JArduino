
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {

        ProcessBuilder child = new ProcessBuilder("C:\\Users\\Slava\\YandexDisk\\Project\\lib\\TestLib\\src\\psutil_lib.exe");

        Process process = null;
        try {
            process = child.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStream gg = process.getInputStream();
        String result = null;
        try {
            result = IOUtils.toString(process.getInputStream(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);


    }
}
