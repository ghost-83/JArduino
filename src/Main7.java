import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main7 {
    public static void main(String[] args) throws InterruptedException {

        ProcessBuilder cpu_percent = new ProcessBuilder("D:\\YandexDisk\\Project\\lib\\TestLib\\src\\lib\\psutil-lib.exe", "cpu_percent");
        ProcessBuilder virtual_memory = new ProcessBuilder("D:\\YandexDisk\\Project\\lib\\TestLib\\src\\lib\\psutil-lib.exe", "virtual_memory");

        Process process = null;
        String string_info = null;

        while (true){

            try {
                process = cpu_percent.start();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                string_info = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8")).readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("CPU - " + string_info);

            try {
                process = virtual_memory.start();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                string_info = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8")).readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Память - " + string_info);
        }

    }
}
