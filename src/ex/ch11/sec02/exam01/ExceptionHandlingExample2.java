package ex.ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        try {
            int result = data.length(); // data 자체가 null 이면 .length 에서 NPE 발생
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Try Catch 구문의 finally 수행");
        }

    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); // null 을 대입해서 5번째 줄의 문제를 유발하는 코드
        System.out.println("[프로그램 종료]");
    }
}
