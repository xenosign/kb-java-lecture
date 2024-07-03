package ex.ch16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        //매개변수가 두 개일 경우
        // 실제 코드 구현 부분이 존재 하는 곳!
        // 값은 결정이 되었으니 해당 값을 어떻게 구현할지를 결정하여 전달 한다!
        person.action1((name, job) -> {
            System.out.print(name + "이 ");
            System.out.println(job + "을 합니다.");
        });
        person.action1((name, job) -> {
            System.out.print(name + "이 ");
            System.out.println(job + "을 하지 않습니다.");
        });

        person.action2(word -> {
            System.out.print("\"" + word + "\"");
            System.out.println("라고 말합니다.");
        });

        person.action2(word -> {
            System.out.print("\"" + word + "\"");
            System.out.println("라고 외칩니다.");
        });

    }
}
