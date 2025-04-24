package nested.example2;

public class NestedAccountMain {
    public static void main(String[] args) {
        Account account = new Account("이효석", 1000);
        Account account2 = new Account("안태현", 100000);

        Account.StaticAccountStatus.showStatus();
        account2.showInnerStatus();

        Account.InnerAccountStatus inner = account2.new InnerAccountStatus();
        inner.showStatus();
    }
}
