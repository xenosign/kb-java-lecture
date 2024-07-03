package ex.ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        // x + y 계산
        action((x, y) -> {
            // 값은 action 에서 x, y 값을 결정함
            // 단 실제 메서드 구현 부분은 여기서 람다식으로 결정하여 전달
            // 따라서 전달에 따라 다른 결과를 낼 수 있음 + 매번 클래스로 복잡하게 안해도 됨
            // JS 콜백 기억 나시나요!????
            int result = x + y;
            System.out.println("result = " + result);
        });
        
        // x - y 계산
        action((x, y) -> {
            int result = x - y;
            System.out.println("result = " + result);
        });
    }

    public static void action(Calculable calculable) {
        // 전달할 값 결정
        int x = 10;
        int y = 4;
        // 아직 메서드 코드(바디)`가 확정이 안된 람다에게 전달
        calculable.calculate(x, y);
    }

    // 람다식의 장점
    // 클래스 구조가 가져다 주는 불필요한 코드 제거 가능, 가독성 증대
    // Vue3 문법 기억하시나요!?
}
