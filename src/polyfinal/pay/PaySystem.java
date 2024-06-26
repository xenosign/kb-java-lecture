package polyfinal.pay;

public class PaySystem {
    private Pay pay;
    
    public void setPay(Pay pay) {
        this.pay = pay;
    }

    public void findPay(int option) {
        if (option == 1) {
            this.setPay(new KBPay());
        } else if (option == 2) {
            this.setPay(new KaKaoPay());
        }
    }
    
    public void payment(int amount) {
        System.out.println("결제를 시작합니다.");
        pay.pay(amount);
    }
}
