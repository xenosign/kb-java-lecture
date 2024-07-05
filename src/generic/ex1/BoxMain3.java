package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<Integer>();
        integerGenericBox.setValue(100);
        Integer integer = integerGenericBox.getValue();
        System.out.println("integer = " + integer);
        
        GenericBox<String> stringGenericBox = new GenericBox<String>();
        stringGenericBox.setValue("hello");
        String str = stringGenericBox.getValue();
        System.out.println("str = " + str);

        // 타입에 맞는 인수 전달
        integerGenericBox.setValue(100);
        // 타입에 안맞는 인수 전달
        // integerGenericBox.setValue("l00");

        
    }
}