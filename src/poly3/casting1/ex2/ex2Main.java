package poly3.casting1.ex2;

public class ex2Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = new Child();
        GrandChild grandChild = (GrandChild) new Child();
    }
}
