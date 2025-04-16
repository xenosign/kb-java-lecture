package access;

public class BankAccount {
    private int balance;

    public BankAccount() { this.balance = 0; }

    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            this.balance += amount;
            System.out.println("현재 잔고 : " + this.balance);
        } else {
            System.out.println("유효하지 않은 금액 입니다.");
        }
    }

    public void withdraw(int amount) {
        if(isAmountValid(amount)) {
            if(isPossibleWithdraw(amount)) {
                this.balance -= amount;
                System.out.println("현재 잔고 : " + this.balance);
            } else {
                System.out.println("잔고가 부족합니다. 현재 잔고 : " + balance);
            }
        } else {
            System.out.println("유효하지 않은 금액 입니다.");
        }
    }

    public void withdrawEarlyReturn(int amount) {
        if (!isAmountValid(amount)) {
            System.out.println("유효하지 않은 금액 입니다.");
            return;
        }
        if (!isPossibleWithdraw(amount)) {
            System.out.println("잔고가 부족합니다. 현재 잔고 : " + balance);
            return;
        }

        this.balance -= amount;
        System.out.println("현재 잔고 : " + this.balance);
    }

    public int getBalance() { return this.balance; }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }

    private boolean isPossibleWithdraw(int amount) {
        return amount <= this.balance;
    }
}
