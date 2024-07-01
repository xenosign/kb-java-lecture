package nested.inner.ex1;

public class Engine {
    private Car car;

    public Engine(Car car) {
        this.car = car;
    }

    public void start() {
        System.out.println("자동자 주유 상태 확인 : " + car.getOilAmount());
        System.out.println(car.getModel() + "의 엔진을 구동합니다");
    }
}
