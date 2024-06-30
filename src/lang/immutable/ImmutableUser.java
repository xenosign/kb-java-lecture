package lang.immutable;

public class ImmutableUser {
    // 필드를 final 변수로 지정하여 생성 시점 이후 변경이 불가능 하도록 수정
    private final String name;    
    
    // 생성자를 사용해야만 필드를 지정할 수 있게 설정
    public ImmutableUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 값을 변경 하는 것이 아니라 새로운 불변 객체를 만들어서 리턴하기!
    public ImmutableUser setName(String name) {
        return new ImmutableUser(name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
