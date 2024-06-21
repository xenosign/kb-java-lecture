package access;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(1000); // 시작 금액 입력

        account.deposit(10000); // 용돈
        account.withdraw(5000); // 학식

        account.total = 500000000;

        System.out.println("남은 금액은 : " + account.total);
    }
}
