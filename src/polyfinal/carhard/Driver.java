package polyfinal.carhard;

import java.util.Scanner;

public class Driver {
    // 코드 가독성을 위해 상수 사용
    // if (option == 1) 과 같은 코드는 남이 볼 때 이해가 불가능 하므로
    // if (option == K5) 와 같이 가독성을 올릴 수 있음
    private static final int K5 = 1;
    private static final int GRAND = 2;
    private static final int G70 = 3;

    // 상수 적용을 제외하고 역할 기능인 Driver 의 코드 변화는 전혀 필요 없는 상태
    // 기본 실습과, 심화 실습은 '자동차의 구현'만 차이가 날 뿐 '역할'은 그대로
    // 이런 형태로 백엔드가 구성되어야 서비스 흐름에 문제 없이 편리하게 기능의 추가 및 삭제가 가능
    private Car car;
    Scanner scanner = new Scanner(System.in);

    public void setCar(Car car) {
        this.car = car;
    }
    
    public void selectCar() {
        System.out.print("운전하고 싶은 차를 선택하세요. (1. K5 / 2. 그랜져 / 3. G70) : ");
        int choice = scanner.nextInt();

        if (choice == K5) {
            setCar(new K5Car());
        } else if (choice == GRAND) {
            setCar(new Grand());
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
