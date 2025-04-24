package exception.check;

import java.util.Random;

public class Client {
    public void callException() throws MyCheckException {
        throw new MyCheckException("Client.call 에서 에러 발생");
    }

    public void checkRandException() throws MyCheckException2 {
        boolean rand = new Random().nextBoolean();
        if (rand) {
            throw new MyCheckException2("오늘은 운이 없으시군요");
        } else {
            throw new MyCheckException2("오늘은 운이 좋으시군요");
        }
    }
}
