package poly2.instance.ex1;

public class Duck extends Animal {
    @Override
    public void sound() {
        System.out.println("오리는 꽥꽥");
    }

    public void fly() {
        System.out.println("오리 날다");
    }
}
