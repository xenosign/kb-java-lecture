package extendss.superrrr;

public class GrandChild extends Child{
    public GrandChild(){
        super("Child 의 생성자 사용"); // 부모의 기본 생성자 생략 가능
        System.out.println("GrandChild 생성자");
    }
}
