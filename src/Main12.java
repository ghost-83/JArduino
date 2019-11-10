

public class Main12 {
    public static void main(String[] args) {
        Integer int1 = 1000;
        Integer int2 = 1000;
        System.out.println(int1 == int2); // folse
        int1 = 100;
        int2 = 100;
        System.out.println(int1 == int2); // true
    }
}
