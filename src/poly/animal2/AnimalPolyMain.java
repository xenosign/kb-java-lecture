package poly.animal2;

public class AnimalPolyMain {
    public static void main(String[] args) {
        Donkey donkey = new Donkey();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Chicken chicken = new Chicken();

        soundAnimal(donkey);
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(chicken);
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}
