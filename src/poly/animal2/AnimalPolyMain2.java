package poly.animal2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Animal[] animals = { new Donkey(), new Dog(), new Cat(), new Chicken() };

        for(Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}
