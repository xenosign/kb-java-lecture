package generic.limit;

public class World3 {
    public static void main(String[] args) {
        GenericWorld<Double> doubleWorld = new GenericWorld<>();
        doubleWorld.setNumber(11.18);
        System.out.println(doubleWorld.getNumber());

        // Integer intNum = doubleWorld.<Integer>commomTrans();
        // System.out.println(intNum);
    }
}
