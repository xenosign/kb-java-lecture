package nested3.nested2.example2;
import java.time.LocalDateTime;

public class Account {
    private String owner;
    private int balance;

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        Transaction transaction = new Transaction("DEPOSIT", amount);
        transaction.print();
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
            return;
        }

        balance -= amount;
        Transaction transaction = new Transaction("WITHDRAW", amount);
        transaction.print();
    }

    private class Transaction {
        private String type;
        private int amount;
        private LocalDateTime timestamp;

        public Transaction(String type, int amount) {
            this.type = type;
            this.amount = amount;
            this.timestamp = LocalDateTime.now();
        }

        public void print() {
            System.out.println("[" + timestamp + "] " + type + " - 금액: " + amount + "원, 잔액: " + balance + "원");
        }
    }
}

