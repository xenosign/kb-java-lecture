package exception.real;

import exception.real.exceptions.MyCheckException;
import exception.real.exceptions.MyUnCheckException;

public class Client {
    public void callException() {
        throw new MyUnCheckException("Client.call 에서 언체크 에러 발생");
    }

    public void callException2() throws MyCheckException {
        throw new MyCheckException("Client.call 에서 체크 에러 발생");
    }
}
