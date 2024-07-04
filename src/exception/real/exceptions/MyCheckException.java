package exception.real.exceptions;

// 명시적 처리를 피하기 위해 RuntimeException 상속으로 변경
public class MyCheckException extends RuntimeException {
    public MyCheckException(String message) {
        super(message);
    }
}
