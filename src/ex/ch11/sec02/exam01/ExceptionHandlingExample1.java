package ex.ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length(); // data 자체가 null 이면 .length 에서 NPE 발생
        System.out.println("문자 수: " + result);
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); // null 을 대입해서 5번째 줄의 문제를 유발하는 코드
        System.out.println("[프로그램 종료]");
    }
}
