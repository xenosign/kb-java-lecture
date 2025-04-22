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
        System.out.print("운전하고 싶은 차를 선택하세요. (1. K5 / 2. 그랜져) : ");
        int choice = scanner.nextInt();

        if (choice == K5) {
            setCar(new K5Car());
        } else if (choice == GRAND) {
            setCar(new GrandeurCar());
        } else if (choice == G70) {
            setCar(new G70());
        } else {
            System.out.println("잘못 된 입력입니다. 프로그램을 종료 합니다.");
            return;
        }

        drive();
    }

    public void drive() {
        car.drive();
    }
}
