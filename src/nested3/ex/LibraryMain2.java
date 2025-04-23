package nested3.ex;

import java.util.Scanner;

public class LibraryMain2 {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 도서 관리 프로그램에 오신 것을 환영 합니다 ===");
        while (true) {
            System.out.println("=== 원하는 기능을 선택 하세요 ===");
            System.out.print("1. 도서 추가 / 2. 도서 목록 출력 / 3. 프로그램 종료 : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                lib.addBook();
            } else if (choice == 2) {
                lib.showBooks();
            } else if (choice == 3) {
                System.out.println("=== 프로 그램을 종료 합니다 ===");
                return;
                // lib.showBooks();
            } else {
                System.out.println("=== 프로 그램을 종료 합니다 ===");
                return;
            }
        }
    }
}