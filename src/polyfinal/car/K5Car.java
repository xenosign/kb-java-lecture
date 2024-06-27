package polyfinal.car;

public class K5Car implements Car{
    private final int EFFICIENCY = 2;
    private int oil;

    K5Car(int oil) {
        this.oil = oil;
    }

    @Override
    public void openDoor() {
        System.out.println("K5 차문을 엽니다");
    }

    @Override
    public void drive() {
        System.out.println("K5가 주행을 시작 합니다");

        int kilo = 0;

        while (this.oil >= EFFICIENCY) {
            this.oil -= EFFICIENCY;
            kilo++;
            System.out.println("K5 가 " + kilo + "km 를 주행했습니다.");
        }

        System.out.println("K5 가 최종 주행한 거리는 " + kilo + "km 입니다");
        System.out.println("K5 주행 종료");
    }
}
