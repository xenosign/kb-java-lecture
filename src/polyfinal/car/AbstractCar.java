package polyfinal.car;

import java.util.Scanner;

public abstract class AbstractCar {
    int fuel;
    Scanner scanner = new Scanner(System.in);

    public abstract void openDoor();
    public abstract void drive();

    public void fillFuel() {
        System.out.print("주유할 기름의 양을 입력하세요 : ");
        this.fuel = scanner.nextInt();
    };
}
