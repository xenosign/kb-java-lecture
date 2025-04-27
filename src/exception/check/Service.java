package exception.check;

public class Service {
    public static void main(String[] args) {
        Client client = new Client();

        try {
            client.callException();
            client.checkRandException();
        } catch (MyCheckException e) {
            e.getMessage();
            e.printStackTrace(System.out);
        } catch (MyCheckException2 e) {
            e.getMessage();
            e.printStackTrace(System.out);
        } finally {
            System.out.printf("반드시 실행할 코드");
        }

        // 실행 여부 확인
        System.out.println("막았는가!?");
    }
}
