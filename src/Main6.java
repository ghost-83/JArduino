import java.io.*;

public class Main6 {
    public static void main(String[] args) throws InterruptedException {

        ProcessBuilder child = new ProcessBuilder("C:\\Users\\Slava\\YandexDisk\\Project\\lib\\TestLib\\src\\lib.exe");

        Process process = null;
        try {
            process = child.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            String string_info = "virtual_memory";

            byte[] bufer = string_info.getBytes();
            try {
                new BufferedOutputStream(process.getOutputStream()).write(bufer, 0, bufer.length);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                string_info = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8")).readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(string_info);
            Thread.sleep(1000);

            string_info = "cpu_percent";

            try {
                new OutputStreamWriter(process.getOutputStream(), "UTF-8").write(string_info, 0, string_info.length());
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                string_info = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8")).readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(string_info);

            Thread.sleep(1000);
        }


    }
}
