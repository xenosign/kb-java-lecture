package poly3.interfacee;

public class Tetz implements Animal, Human {
    @Override
    public void eat() {
        System.out.println("테츠가 밥처럼 콜라를 마십니다!");
    }

    @Override
    public void sleep() {
        System.out.println("테츠가 강의 준비로 잠을 잘 못잡니다!");
    }

    @Override
    public void think() {
        System.out.println("테츠가 어떻게하면 수업에서 더 웃길지 고민 합니다!");
    }
}
