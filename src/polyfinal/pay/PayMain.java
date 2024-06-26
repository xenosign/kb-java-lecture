package polyfinal.pay;

import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {
        PaySystem paySystem = new PaySystem();
        Scanner scanner = new Scanner(System.in);
        int option;
        int amount;

        System.out.print("결제 옵션을 입력하세요 (1. KB 페이 / 2. 카카오페이) : ");
        option = scanner.nextInt();
        System.out.print("결제 금액을 입력하세요 : ");
        amount = scanner.nextInt();

        paySystem.findPay(option);
        paySystem.payment(amount);
    }
}
