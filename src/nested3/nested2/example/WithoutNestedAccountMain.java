package nested3.nested2.example;

public class WithoutNestedAccountMain {
    public static void main(String[] args) {
        Account account = new Account("이효석", 1000);

        account.deposit(500);
        account.withdraw(1000);
        account.withdraw(1000);
    }
}
