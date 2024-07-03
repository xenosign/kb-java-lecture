package exception.basic;

public class ExceptionWithout {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int idx = 5;

        if(idx < arr.length) {
            System.out.println("정상적 배열에 대한 접근입니다");
            System.out.println("접근한 배열의 값은");
            System.out.println(arr[idx]);
        } else {
            System.out.println("잘 못 된 배열에 대한 접근이 발견 되었습니다");
            System.out.println("나오나요?");
            System.out.println("프로그램 종료");
        }
        
        // 또 다른 작업을 시작
    }
}
