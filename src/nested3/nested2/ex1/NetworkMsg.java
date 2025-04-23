package nested3.nested2.ex1;

public class NetworkMsg {
    private String msg;

    public NetworkMsg(String msg) {
        this.msg = msg;
    }

    public void send() {
        System.out.println("네트워크 메세지를 전송합니다.");
        System.out.println(msg);
        System.out.println("네트워크 메세지를 전송 종료.");
    }
}
