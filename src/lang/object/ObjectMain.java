package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Object[] objects = { new Parent(), new Child(), new OtherClass() };

        System.out.println(size(objects));
    }

    public static int size(Object[] objects) {
        return objects.length;
    }
}
