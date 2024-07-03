package ex.ch16.sec01;

@FunctionalInterface
public interface Calculable {
    // 이름과 매개 변수의 수 까지만 결정, 메서드의 코드는 즉시 구현하여 사용한다
    void calculate(int x, int y);
}
