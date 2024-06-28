package polyfinal.car;

public class G70 implements Car{
    @Override
    public void drive() {
        System.out.println("G70 주행을 시작 합니다");
        System.out.println("G70 주행 종료");
    }
}
