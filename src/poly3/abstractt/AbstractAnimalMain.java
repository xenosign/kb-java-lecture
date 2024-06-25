package poly3.abstractt;

public class AbstractAnimalMain {
    public static void main(String[] args) {
        AbstrctAnimal[] animals = { new Dog(), new Cat(), new Duck() };

        for (AbstrctAnimal animal : animals) {
            animalCall(animal);
        }
    }

    static void animalCall(AbstrctAnimal animal) {
        animal.eat();
        animal.sound();

        if (animal instanceof Duck) {
            Duck duck = (Duck) animal;
            duck.fly();
        }
    }
}
