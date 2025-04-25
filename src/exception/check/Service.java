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
        }

        System.out.println("막았는가!?");
    }
}
