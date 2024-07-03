package exception.basic;

public class ExceptionWithout2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        if (accessArr(arr, 5)) {
            System.out.println("배열 접근이 가능합니다!");
            System.out.println("원하던 작업을 이어 갑니다!");

            Object object = null;

            if (accessNull(object)) {
                System.out.println("객체가 null 입니다");
                System.out.println("원하던 작업을 이어 갑니다!");
            } else {
                System.out.println("객체가 null 이 아닙니다. 에러를 발생 시킵니다.");
            }
        } else {
            System.out.println("배열 접근 불가 에러를 발생 시킵니다");
        }
    }

    public static boolean accessArr(int[] arr, int idx) {
        if (idx < arr.length) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean accessNull(Object obj) {
        if (obj == null) {
            return true;
        } else {
            return false;
        }
    }
}
