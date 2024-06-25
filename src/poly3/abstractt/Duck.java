package poly3.abstractt;

public class Duck extends AbstrctAnimal {
    @Override
    public void eat() {
        System.out.println("오리는 도토리를 먹어요");
    }
    
    @Override
    public void sound() {
        System.out.println("오리는 꽥꽥");
    }

    public void fly() {
        System.out.println("오리 날다");
    }
}
