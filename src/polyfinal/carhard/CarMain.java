package polyfinal.carhard;

public class CarMain {
    public static void main(String[] args) {
        // '구현' 파트만 변경이 되었으므로 메인 운영 코드도 그대로 유지 가능!
        Driver driver = new Driver();
        driver.selectCar();
    }
}
