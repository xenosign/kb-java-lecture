package lang.immutable;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableUser user1 = new ImmutableUser("효석");
        // 객체가 참조 값을 복사하는 것을 막을 수는 없습니다!
        ImmutableUser user2 = user1;

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);

        user2 = user1.setName("시완");
        System.out.println("user2 의 이름을 '시완'으로 변경");
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
    }
}
