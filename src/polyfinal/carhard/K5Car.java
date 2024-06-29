package polyfinal.carhard;

// 차의 종류에 상관 없이 공통으로 사용해도 되는 기능을 부모로부터 받아 쓰기 위해 AbstractCar 를 상속
// 차의 종류에 따라 다르게 구현해야하는 drive() 메서드는 Car 인터페이스로 부터 받아서 구현하여 사용 
public class K5Car extends AbstractCar implements Car {
    // 연비 값은 상수로 선언하여 가독성 증대 (사실 크게 필요없긴 합니다. 일단 상수 사용을 보여드리고자 쓴 부분)
    private final int EFFICIENCY = 2;
    // 부모의 공통 기능에 이름을 넘겨줘야 하기 때문에, 해당 이름읜 K5Car 라는 클래스에 고정적인 부분이므로
    // 생성자를 통해 초기화 하는 것이 아니라 처음부터 초기값을 할당
    protected String name = "K5";

    // 사실 drive 도 이름과 연비만 다를 뿐 같은 로직으로 돌아가기 때문에 추상 클래스를 상속 받아
    // 부모의 메서드에 매개 변수를 전달하는 형태로 사용이 가능 + 더 효율적인 코드이지만
    // 추상 클래스와 인터페이스를 동시 상속 구현이 가능하다는 점을 보여드리기 위해 요렇게 작성 하였습니다!
    // 그랜져, G70 도 정확하게 같은 로직을 사용하므로 해당 클래스에는 주석을 생략 하였습니다
    @Override
    public void drive() {
        // 부모의 inputOilAmount 메서드 사용을 위해 super 사용
        // 차 종을 매개 변수로 넘겨서 어떤 차에 주유하는지 표시
        super.inputOilAmount(this.name);
        // 부모의 openDoor 메서드 사용을 위해 super 사용
        // 차 종을 매개 변수로 넘겨서 어떤 차에 주유하는지 표시
        super.openDoor(this.name);

        System.out.println(this.name + " 가 주행을 시작 합니다");

        // 주행 거리를 구하는 로직
        int distance = 0;
        while (this.oil >= EFFICIENCY) {
            // 연비당 1km 씩 증가
            super.oil -= EFFICIENCY;
            distance++;
            System.out.println(this.name + " 가 " + distance + "km 를 주행했습니다.");
        }
        
        // 최종 결과 출력
        System.out.println(this.name + " 가 최종 주행한 거리는 " + distance + "km 입니다");
        System.out.println(this.name + " 주행 종료");
    }
}
