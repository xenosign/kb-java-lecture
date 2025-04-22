package polyfinal.car;

import java.util.Scanner;

public class G70 implements Car{
    int efficiency = 2;
    int fuel;

    @Override
    public void openDoor() {
        System.out.println("G70 차 문을 엽니다");
    }

    @Override
    public void fillFuel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주유할 기름의 양을 입력 하세요 : ");
        this.fuel = scanner.nextInt();
    }

    @Override
    public void drive() {
        fillFuel();
        openDoor();

        System.out.println("G70가 주행을 시작 합니다");
        int distance = fuel / efficiency;
        System.out.println("G70은 총 " + distance + "km 만큼 달렸습니다");
        System.out.println("G70 주행 종료");
    }
}
