package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(100);
        account.deposit(100);
        account.deposit(-30);
        account.getBalance();
        account.withdraw(100);
        account.withdraw(200);
    }
}
