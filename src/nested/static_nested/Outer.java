package nested.static_nested;

public class Outer {
    static String outerStaticValue = "outerStaticValue";
    private static String outerPrivateStaticValue = "outerPrivateStaticValue";
    String outerInstanceValue = "outInstanceValue";
    private String outerPrivateInstanceValue = "outInstanceValue";

    static class NestedStatic {
        static String nestedStaticValue = "nestedStaticValue";
        private static String nestedPrivateStaticValue = "nestedPrivateStaticValue";
        String nestedInstanceValue = "nestedInstanceValue";
        private String nestedPrivateInstanceValue = "nestedPrivateInstanceValue";

        public void print() {            
            // 인스턴스의 멤버에는 접근 불가능
            // System.out.println("outerInstanceValue = " + outerInstanceValue);
    
            // 클래스 내부의 private 멤버 접근 가능
            System.out.println("outerPrivateStaticValue = " + outerPrivateStaticValue);
            System.out.println("nestedPrivateStaticValue = " + nestedPrivateStaticValue);
            System.out.println("nestedPrivateInstanceValue = " + nestedPrivateInstanceValue);
        }
    }
}
