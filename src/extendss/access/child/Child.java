package extendss.access.child;

import extendss.access.parent.Parent;

public class Child extends Parent {
    public void access() {
        System.out.println("publicValue : " + publicValue); // 어디서든 접근 가능
        System.out.println("protectedValue : " + protectedValue); // 다른 패키지이나, 상속 관계
//        System.out.println("defaultValue : " + defaultValue); // 에러 발생, 다른 패키지
//        System.out.println("privateValue : " + privateValue); // 에러 발생, 내부에서만 접근 가능

        publicMethod(); // 어디서든 접근 가능
        protectedMethod(); // 다른 패키지이나, 상속 관계
//        defaultMethod(); // 에러 발생, 다른 패키지
//        privateMethod(); // 에러 발생, 내부에서만 접근 가능
//
        printParent(); // Parent 가 직접 내부의 변수와 메서드를 호출하는 public 메서드
    }
}

