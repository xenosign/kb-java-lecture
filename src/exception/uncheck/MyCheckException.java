package exception.uncheck;

// Exception 을 상속하면 체크 예외가 된다
public class MyCheckException extends Exception {
    public MyCheckException(String message) {
        super(message);
    }
}
