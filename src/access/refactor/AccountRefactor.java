package access.refactor;

public class AccountRefactor {
    public String bank;  // 은행명
    String grade;   // 회원 등급
    private String name; // 계좌 소유주
    private int total;  // 은행 잔고

    public AccountRefactor(int total, String name, String grade, String bank) {
        this.total = total;
        this.name = name;
        this.grade = grade;
        this.bank = bank;
    }

    private void changeTotal(int total) {
        System.out.println("private 메서드 호출");
        this.total = total;
    }

    private void changeName(String name) {
        System.out.println("private 메서드 호출");
        this.name = name;
    }

    void deposit(int amount) {
        System.out.println("default 메서드 호출");
        this.total += amount;
    }

    void withdraw(int amount) {
        System.out.println("default 메서드 호출");
        this.total -= amount;
    }

    void showGrade() {
        System.out.println("default 메서드 호출");
        System.out.println("회원님의 등급은 : " + this.grade);
    }


    public void showBank() {
        System.out.println("public 메서드 호출");
        System.out.println(this.bank);
    }
}
