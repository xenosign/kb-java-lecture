package poly3.casting1;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child poly = (Child) parent;
        poly.childMethod();

        ((Child) parent).childMethod();
    }
}
