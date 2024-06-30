package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer integer1 = new Integer(10);
        Integer integer2 = Integer.valueOf(10);

        System.out.println(integer1 == integer2); // 결과는!?


        Long long1 = Long.valueOf(100);
        Double double1 = Double.valueOf(11.18);

        int intValue = integer1.intValue();
        long longValue = long1.longValue();
        double doubleValue = double1.doubleValue();

        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("doubleValue = " + doubleValue);
    }
}
