package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClazzMain {
    public static void main(String[] args) throws Exception {
        Class clazz1 = User.class; // 1. 클래스에서 직접 조회
        Class clazz2 = new User("효석").getClass(); // 2. 인스턴스를 만들어서 조회
        Class clazz3 = Class.forName("lang.clazz.User"); // 3. 문자열로 찾아서 조회

        // 모든 필드 출력
        Field[] fields = clazz1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

        // 메서드 오버라이딩
        Method[] methods = clazz1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        // 상위 클래스 정보 출력
        System.out.println("SuperClass = " + clazz1.getSuperclass());

        // 인터페이스 정보 출력
        Class[] interfaces = clazz1.getInterfaces();
        for (Class inter : interfaces) {
            System.out.println("inter = " + inter);
        }

        User user = (User) clazz1.getDeclaredConstructor().newInstance();
        user.setName("효석");
        System.out.println("user = " + user);
    }
}
