package poly3.abstractt;

public class Cat extends AbstrctAnimal {
    @Override
    public void eat() {
        System.out.println("고양이가 사료를 먹어요");
    }
    
    @Override
    public void sound() {
        System.out.println("고양이는 야옹");
    }
}
