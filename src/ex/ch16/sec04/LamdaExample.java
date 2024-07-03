package ex.ch16.sec04;

public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        //실행문이 두 개 이상일 경우
        person.action((x, y) -> {
            double result = x + y;
            return result;
        });

        // sum() 메서드를 호출
        // 직접 구현 코드 이외의, 메서드의 참조 값도 전달이 가능하다!
        person.action((x, y) -> sum(x, y));
    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}
