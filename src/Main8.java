import java.io.*;

public class Main8 {
    public static void main(String[] args) throws FileNotFoundException {
        ProcessBuilder cpu_percent = new ProcessBuilder("D:\\YandexDisk\\Project\\lib\\TestLib\\src\\lib.exe");
//        ProcessBuilder virtual_memory = new ProcessBuilder("D:\\YandexDisk\\Project\\lib\\TestLib\\src\\lib\\psutil-lib.exe", "virtual_memory");

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
            cpu_percent.command();

//            try {
//                process = virtual_memory.start();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            try {
//                string_info = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8")).readLine();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            System.out.println("Память - " + string_info);
        }
    }
}
