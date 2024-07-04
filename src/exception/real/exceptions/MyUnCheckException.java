package exception.real.exceptions;

// RuntimeException 을 상속하면 언체크 예외가 된다
public class MyUnCheckException extends RuntimeException {
    public MyUnCheckException(String message) {
        super(message);
    }
}
