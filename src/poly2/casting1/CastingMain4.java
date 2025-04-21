package poly2.casting1;

public class CastingMain4 {
    public static void main(String[] args) {
        // 둘 중 하나의 코드에서는 에러가 발생합니다! 어디서 에러가 발생 할까요!?

        // # 1번 코드
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        // # 2번 코드
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod();
    }
}
