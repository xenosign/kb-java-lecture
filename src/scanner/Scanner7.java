package scanner;

import java.util.Scanner;

public class Scanner7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String id = null;
        String pw = null;
        String name = null;
        String addr = null;

        System.out.println("id = " + id);
        System.out.println("pw = " + pw);
        System.out.println("name = " + name);
        System.out.println("addr = " + addr);

        System.out.println("=== 회원 가입을 시작 합니다 ===");
        System.out.print("ID를 입력하세요 : ");
        id = scanner.nextLine();
        System.out.print("비밀번호를 입력하세요 : ");
        pw = scanner.nextLine();
        System.out.print("이름을 입력하세요 : ");
        name = scanner.nextLine();
        System.out.print("주소를 입력하세요 : ");
        addr = scanner.nextLine();
        System.out.println("회원 가입을 축하합니다!");

        System.out.println("id = " + id);
        System.out.println("pw = " + pw);
        System.out.println("name = " + name);
        System.out.println("addr = " + addr);
    }
}
