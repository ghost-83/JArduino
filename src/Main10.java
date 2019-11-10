import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;
import arduino.Arduino;

public class Main10 {
    public static void main(String[] args) throws InterruptedException {
        OperatingSystemMXBean info = (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        Arduino ard = new Arduino("COM7", 9600);
        char[] per = new char[2];

        if (ard.openConnection()) {
            System.out.println("Запустилось)))");
            while (true) {
                per[0] = (char)(int)(info.getSystemCpuLoad()*100);;
                per[1] = (char)Math.toIntExact(100 - (info.getFreePhysicalMemorySize() / (info.getTotalPhysicalMemorySize() / 100)));
                ard.serialWrite(String.valueOf(per));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        else {
            System.out.println("Что то пошло не так.");
        }
    }
}