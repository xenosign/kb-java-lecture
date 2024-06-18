package variable;

public class Var2Number {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 *기본

        long l = 9223372036854775807L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        // 실수
        float f = 4.3f; // float 이라는 것을 표현하기 위해 f 사용, 소수점 7자리 까지
        double d = 4.3; // 소수점 15자리 까지 *기본
    }
}
