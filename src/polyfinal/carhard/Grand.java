package polyfinal.carhard;

public class Grand extends AbstractCar implements Car {
    private final int EFFICIENCY = 3;
    protected String name = "그랜져";

    @Override
    public void drive() {
        super.inputOilAmount(this.name);
        super.openDoor(this.name);

        System.out.println(this.name + " 가 주행을 시작 합니다");

        int distance = 0;
        while (this.oil >= EFFICIENCY) {
            super.oil -= EFFICIENCY;
            distance++;
            System.out.println(this.name + " 가 " + distance + "km 를 주행했습니다.");
        }

        System.out.println(this.name + " 가 최종 주행한 거리는 " + distance + "km 입니다");
        System.out.println(this.name + " 주행 종료");
    }
}
