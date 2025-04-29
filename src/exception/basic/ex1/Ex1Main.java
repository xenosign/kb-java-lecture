package exception.basic.ex1;

public class Ex1Main {
    static class Parent {};
    static class Child extends Parent {
        void childMethod() { System.out.println("Child.childMethod"); }
    };
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child poly = (Child) parent;
        poly.childMethod();
        System.out.println("예외 처리 내용 출력!");
    }
}
