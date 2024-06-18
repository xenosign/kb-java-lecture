package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 : ");
        String str = scanner.nextLine(); // 사용자 입력을 문자열로 받기
        System.out.println("입력한 문자열은!? : " + str);

        System.out.print("정수를 입력하세요 : ");
        int intNum = scanner.nextInt(); // 사용자 입력을 정수로 받기
        System.out.println("입력한 정수는!?! : " + intNum);

        System.out.print("실수를 입력하세요 : ");
        double doubleNum = scanner.nextDouble(); // 사용자 입력을 정수로 받기
        System.out.println("입력한 실수는!?! : " + doubleNum);

    }
}
