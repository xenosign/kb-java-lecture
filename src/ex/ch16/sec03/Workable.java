package ex.ch16.sec03;

@FunctionalInterface
public interface Workable {
    // 얘는 매개 변수가 2개, FunctionalInterface 는 메서드가 1개 고정이므로 다른 인터페이스 선언 필요
    void work(String name, String job);
}