package nested3.ex;

import java.util.Scanner;

public class Library2 {
    Book[] books;
    int bookCount;
    static final int LIBRARY_SIZE = 4;

    public Library2() {
        this.books = new Book[LIBRARY_SIZE];
        bookCount = 0;
    }

    public void addBook() {
        if (bookCount == LIBRARY_SIZE) {
            System.out.println("=== 더 이상 책을 보관할 수 없습니다 ===");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("책 제목을 입력 하세요 : ");
        String title = scanner.nextLine();
        System.out.print("책 저자를 입력 하세요 : ");
        String author = scanner.nextLine();

        books[bookCount++] = new Book(title, author);

        System.out.println("보관 된 책의 수는 : " + bookCount);
        System.out.println("=== 책 보관 완료 ===");
    }

    public void removeBook() {
        if (bookCount == 0) {
            System.out.println("*** 보관 된 책이 존재하지 않습니다 ***");
            return;
        }

        for (int i = 1; i < bookCount; i++) {
            books[i - 1] = books[i];
        }

        books[--bookCount] = null;

        System.out.println("*** 가장 오래된 책이 삭제되었습니다. ***");
    }

    public void showBooks() {
        System.out.println("=== 책 목록 출력 ===");
        System.out.println("*** 총 보관 책의 수는 : " + bookCount + " 입니다 ***");
        for (int i = 0; i < bookCount; i++) {
            System.out.println((i + 1) + ". 제목 : " + books[i].title + " / 저자 : " + books[i].author);
        }
    }

    static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
