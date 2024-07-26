package memory;

public class Final {
    int radius;
    static final double PI = 3.14;

    // 불변 변수 설정

    public double getCircleArea() {
        return PI * this.radius * this.radius;
    }
}
