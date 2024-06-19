package array;

public class Arr2 {
    public static void main(String[] args) {
        String[] students;
        students = new String[]{"김연지", "최호진", "이승아", "박소해", "최규찬", "임준수", "김동준", "이태웅"};

        for (int i = 0; i < students.length; i++) {
            System.out.println("student" + i + ": " + students[i]);
        }
    }
}
