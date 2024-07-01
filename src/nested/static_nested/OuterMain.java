package nested.static_nested;

public class OuterMain {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.NestedStatic nested = new Outer.NestedStatic();

        System.out.println(Outer.outerStaticValue);
        // System.out.println(Outer.outerPrivateStaticValue);
        System.out.println(outer.outerInstanceValue);
        // System.out.println(outer.outerPrivateInstanceValue);

        System.out.println(Outer.NestedStatic.nestedStaticValue);
        // System.out.println(Outer.NestedStatic.nestedPrivateStaticValue);
        System.out.println(nested.nestedInstanceValue);
        // System.out.println(nested.nestedPrivateInstanceValue);

        nested.print();
    }
}
