package poly2.interfacee;

public class InterfaceAnimalImpl implements InterfaceAnimal {
    @Override
    public void eat() {
        System.out.println("인터페이스 구현체가 밥을 먹어요");
    }

    @Override
    public void sound() {
        System.out.println("인터페이스 구현체가 울어요");
    }
}
