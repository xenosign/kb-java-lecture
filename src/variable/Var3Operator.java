package variable;

public class Var3Operator {
    public static void main(String[] args) {
        // 산술 연산의 특이점
        int a = 3;
        int b = 2;
        System.out.println(a /b); // 결과는?

        // 문자 연산의 특이점
        String str = "a + b = ";
        int c = 10;
        System.out.println(str + c); // 결과는?

        // 문자 연산의 특이점 2
        int d = 10;
        char e = 'e';
        System.out.println(d + e); // 결과는?

        // 증감 연산의 특이점
        int f = 1;
        int g = 0;

        g = f++;

        System.out.println("f = " + f + ", g = " + g); // 결과는?

        // 문자열 비교
        String str1 = "abc";
        String str2 = "def";

        boolean result1 = !"abc".equals("def");
        boolean result2 = !str1.equals("def");
        boolean result3 = !str1.equals(str2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        // 문자 비교의 특이점
        System.out.println("abc" == "abc"); // 결과는!?
        System.out.println("abc" == "def"); // 결과는!?
        System.out.println("abc" == new String("abc")); // 결과는!?

        // 논리연산 실전
        int score = 90;
        boolean result = score >= 80 && score <= 100;
        System.out.println(result);
    }
}
