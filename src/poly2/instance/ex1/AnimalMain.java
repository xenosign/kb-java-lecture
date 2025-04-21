package poly2.instance.ex1;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = { new Animal(), new Dog(), new Cat(), new Duck() };

        // 코드를 완성해 주세요
        for (Animal animal : animals) {
            animalCall(animal);
        }
    }
    
    public static void animalCall(Animal animal) {
        animal.sound();
        if (animal instanceof Duck) ((Duck) animal).fly();
    }
}
