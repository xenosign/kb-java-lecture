package lang.math;

public class MathMain {
    public static void main(String[] args) {
        // 기본 연산
        System.out.println("max(10, 20) = " + Math.max(10, 20)); // 최대
        System.out.println("min(10, 20) = " + Math.min(10, 20)); // 최소
        System.out.println("abs(-10) = " + Math.abs(-10)); // 절대값

        // 소수점 처리
        System.out.println("ceil(2.1) = " + Math.ceil(2.1)); // 올림
        System.out.println("floor(2.1) = " + Math.floor(2.1)); // 내림
        System.out.println("round(2.1) = " + Math.round(2.1)); // 반올림

        // 기타
        System.out.println("sqrt(4) = " + Math.sqrt(4)); // 제곱근
        System.out.println("random() = " + Math.random()); // 0 <= rand < 1
    }
}
