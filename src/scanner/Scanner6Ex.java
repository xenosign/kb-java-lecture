package scanner;

import java.util.Scanner;

public class Scanner6Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rand = (int) Math.floor(Math.random() * 100);


        while (true) {
            System.out.print("랜덤 숫자를 입력하세요 : ");
            int num = scanner.nextInt();
            if(num > rand) {
                System.out.println("Down");
            } else if (num < rand) {
                System.out.println("Up");
            } else {
                System.out.println("정답입니다! 랜덤 숫자는 " + rand);
                break;
            }
        }
    }
}
