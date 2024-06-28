package polyfinal.car;

import java.util.Scanner;

public class K5Car implements Car {
    @Override
    public void drive() {
        System.out.println("K5가 주행을 시작 합니다");
        System.out.println("K5 주행 종료");
    }
}
