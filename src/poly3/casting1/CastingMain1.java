package poly3.casting1;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = new Child();
        child.childMethod();

        int a = (int) 1118.1118;

        System.out.println(a);

        child.childMethod();
        child.parentMethod();

        parent.parentMethod();
        // parent.childMethod(); // 실행이 되나요!?


    }
}
