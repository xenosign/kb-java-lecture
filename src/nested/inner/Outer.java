package nested.inner;

public class Outer {
    private static String outerPrivateStaticValue = "outerPrivateStaticValue";
    private String outerStaticValue = "outerStaticValue";

    class Inner {
        private String innerInstanceValue = "innerInstanceValue";

        public void print() {
            System.out.println("innerInstanceValue = " + innerInstanceValue);
            System.out.println("outerPrivateStaticValue = " + outerPrivateStaticValue);
            System.out.println("outerStaticValue = " + outerStaticValue);
        }

    }
}
