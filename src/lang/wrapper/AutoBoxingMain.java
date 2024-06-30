package lang.wrapper;

public class AutoBoxingMain {
    public static void main(String[] args) {
        Integer integer1 = 10;
        Long long1 = 100L;
        Double double1 = 11.18;

        int intValue = integer1;
        long longValue = long1;
        double doubleValue = double1;

        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("doubleValue = " + doubleValue);
    }
}
