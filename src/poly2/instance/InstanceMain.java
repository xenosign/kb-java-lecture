package poly2.instance;

public class InstanceMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        GrandChild grandChild = (GrandChild) new Child();



    }

    public static void callAllClass(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child) {
            Child child = (Child) parent;
            child.parentMethod();
        }

        if (parent instanceof GrandChild) {
            GrandChild grandChild = (GrandChild) parent;
            grandChild.parentMethod();
        }
    }
}
