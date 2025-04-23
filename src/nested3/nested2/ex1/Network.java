package nested3.nested2.ex1;

import java.util.Random;

public class Network {
    private boolean networkCondition;

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
}
