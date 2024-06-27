package polyfinal.car;

import java.util.Scanner;

public class DriverHard {
    private Car car;
    Scanner scanner = new Scanner(System.in);

    public void setCar(Car car) {
        this.car = car;
    }
    
    public void selectCar() {
        System.out.print("자동차를 ");


        drive();
    }

    public void drive() {
        car.drive();
    }
}
