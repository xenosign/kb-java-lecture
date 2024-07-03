package ex.ch16.sec03;

public class Person {
    // 액션1은 매개 변수 2개 짜리 Workable 의 workd 동작, 값은 홍길동 프로그래밍으로 고정
    public void action1(Workable workable) {
        workable.work("홍길동", "프로그래밍");
    }

    // 액션2은 매개 변수 1개 짜리 Workable 의 workd 동작, 값은 안녕하세요 고정
    public void action2(Speakable speakable) {
        speakable.speak("안녕하세요");
    }
}
