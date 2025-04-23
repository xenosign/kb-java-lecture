package nested.example;

public class WithoutNestedAccountMain {
    public static void main(String[] args) {
        Account account = new Account("이효석", 1000);

        account.deposit(500);
        account.withdraw(1000);
        account.withdraw(1000);
    }
}
