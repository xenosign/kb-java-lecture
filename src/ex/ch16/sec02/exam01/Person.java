package ex.ch16.sec02.exam01;

public class Person {
    public void action(Workable workable) {
        // Person 의 action 메서드가 실행되면 외부에서 람다로 메서드 구현을 받아서 실행시켜 준다!!
        // 오늘 배운 코드 덩어리 전달 기억 나시나요!??
        workable.work();
    }
}
