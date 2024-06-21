package access.refactor2;

import access.refactor.AccountRefactor;

public class AccountRefactorOuterMain {
    public static void main(String[] args) {
        AccountRefactor account = new AccountRefactor(1000, "이효석", "gold", "국민은행");

        // public 요소 접근
        System.out.println("public 요소 접근");
        System.out.println("은행명은? " + account.bank);

        // default 요소 접근
        System.out.println("default 요소 접근");
//        System.out.println("회원 등급은? " + account.grade);

        // private 요소 접근
        System.out.println("private 요소 접근");
//        System.out.println("회원 이름은? " + account.name);
    }
}
