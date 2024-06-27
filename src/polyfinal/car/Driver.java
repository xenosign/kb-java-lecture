package polyfinal.car;

import java.util.Scanner;

public class Driver {
    private static final int K5 = 1;
    private static final int GRAND = 2;
    private static final int G70 = 3;

    private Car car;
    Scanner scanner = new Scanner(System.in);

    public void setCar(Car car) {
        this.car = car;
    }
    
    public void selectCar() {
        System.out.print("운전하고 싶은 차를 선택하세요. (1. K5 / 2. 그랜져 / 3. G70) : ");
        int choice = scanner.nextInt();

        if (choice == K5) {
            System.out.print("K5 에 주유할 기름의 양을 입력하세요 : ");
            int amout = scanner.nextInt();
            setCar(new K5Car(amout));
        } else if (choice == GRAND) {
            setCar(new Grand());
        } else {
            setCar(new G70());
        }

        drive();
    }

    public void drive() {
        car.drive();
    }
}
