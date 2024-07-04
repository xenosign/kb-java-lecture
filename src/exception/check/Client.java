package exception.check;

public class Client {
    public void callException() throws MyCheckException {
        throw new MyCheckException("Client.call 에서 에러 발생");
    }
}
