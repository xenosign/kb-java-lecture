package polyfinal.carhard;

public interface Car {
    // K5, 그랜져, G70 에서 클래스 별로 달라야 하는 메서드는 interface 로 내려서, 반드시 오버라이딩 하도록 설계
    void drive();
}
