package nested.anonymous;

public class AnonymousOuter2 {
    private String outerInstance = "outerInstance";

    public void outerMethod(String methodParameter) {
        String methodString = "methodString"; // 지역 변수

        Print print = new Print() {
            String localInstance = "localInstance";

            @Override
            public void printLocal() {
                System.out.println("outerInstance = " + outerInstance);
                System.out.println("methodString = " + methodString);
                System.out.println("localInstance = " + localInstance);
                System.out.println("parameter = " + methodParameter);
            }
        };

        print.printLocal();
    }

    public static void main(String[] args) {
        AnonymousOuter2 localOuter = new AnonymousOuter2();
        localOuter.outerMethod("parameter");
    }
}
