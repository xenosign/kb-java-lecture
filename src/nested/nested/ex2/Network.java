package nested.nested.ex2;

import java.util.Random;

public class Network {
    boolean networkCondition;

    public boolean checkNetwork() {
        System.out.println("네크워크 상태를 점검합니다");
        Random rand = new Random();
        networkCondition = rand.nextBoolean();
        if(networkCondition) {
            System.out.println("네트워크 상태 정상");
        } else {
            System.out.println("네트워크 상태 이상");
            System.out.println("네트워크 종료");
        }
        return networkCondition;
    }

    public void sendMsg(String msg) {
        NetworkMsg networkMsg = new NetworkMsg(msg);
        networkMsg.send();
    }

    private class NetworkMsg {
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
}
