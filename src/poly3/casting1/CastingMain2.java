package poly3.casting1;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스를 참조
        Parent poly = new Child();

        Child child = (Child) poly; // 부모 타입으로 선언된 인스턴스를 자식 타입으로 캐스팅!
        child.childMethod();
    }
}
