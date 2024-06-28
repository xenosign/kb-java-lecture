package polyfinal.carhard;

import java.util.Scanner;

// 차종에 상관 없이 공통으로 사용하는 메서드를 상속 시키기 위해 추상 클래스를 사용
public abstract class AbstractCar {
    protected int oil;
    Scanner scanner = new Scanner(System.in);

    // 차 종과 상관 없이 공통으로 사용이 가능한 메서드는 추상 클래스를 사용하여, 부모의 것을 그대로 사용하도록 설계
    // 공통 기능을 오버라이딩하는 비효율적 부분을 해결 가능
    // 단, 자동차 명은 바꿔주고 싶으므로 구현된 인스턴스에서 자신의 차종 명을 넘길 수 있도록 매개 변수로 차종을 출력
    protected void openDoor(String name) {
        System.out.println(name + " 차 문을 엽니다");
    }

    // 차 종과 상관 없이 공통으로 사용이 가능한 메서드는 추상 클래스를 사용하여, 부모의 것을 그대로 사용하도록 설계
    // 공통 기능을 오버라이딩하는 비효율적 부분을 해결 가능
    // 단, 자동차 명은 바꿔주고 싶으므로 구현된 인스턴스에서 자신의 차종 명을 넘길 수 있도록 매개 변수로 차종을 출력
    protected void inputOilAmount(String name) {
        System.out.print(name + "에 주유할 기름의 양을 입력 하세요 : ");
        this.oil = scanner.nextInt();
    }
}
