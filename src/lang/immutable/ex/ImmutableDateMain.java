package lang.immutable.ex;

public class ImmutableDateMain {
    public static void main(String[] args) {
        ImmutableDate date1 = new ImmutableDate(2024, 7, 1);
        ImmutableDate date2 = date1;

        System.out.println("date2 의 년도만 2025일로 변경");
        date2 = date2.withYear(2025);

        // 아래의 출력 결과가 date1 과 date2 가 각각 다르게 나오도록 ImmutableDate 클래스를 만들어 주세요.
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}

