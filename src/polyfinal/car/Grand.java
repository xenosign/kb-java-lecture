package polyfinal.car;

public class Grand implements Car{
    @Override
    public void openDoor() {
        System.out.println("그랜져 차문을 엽니다");
    }

    @Override
    public void drive() {
        System.out.println("그랜져가 주행을 시작 합니다");
        System.out.println("그랜져 주행 종료");
    }
}
