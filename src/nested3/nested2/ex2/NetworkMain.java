package nested3.nested2.ex2;

public class NetworkMain {
    public static void main(String[] args) {
        Network network = new Network();
        if(network.checkNetwork()) network.sendMsg("내일 뭐먹지?");
    }
}
