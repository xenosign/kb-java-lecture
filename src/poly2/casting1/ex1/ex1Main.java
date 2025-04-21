package poly2.casting1.ex1;

public class ex1Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        // 아래에 코드를 완성해 주세요
        dog.eat();
        cat.eat();
        ((Dog) dog).sound();
        ((Cat) cat).sound();
    }
}
