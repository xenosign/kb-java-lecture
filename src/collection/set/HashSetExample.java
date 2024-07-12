package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 선언
        Set<Integer> set = new HashSet<>();

        // 데이터 추가
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        // 중복된 데이터 추가 시도
        boolean isAdded = set.add(30); // 중복 요소 추가 시도
        System.out.println("30 추가 시도 결과: " + isAdded);

        // Set 출력
        System.out.println("Set: " + set);

        // 데이터 검색
        boolean contains20 = set.contains(20);
        boolean contains60 = set.contains(60);
        System.out.println("Set에 20이 있는가?: " + contains20);
        System.out.println("Set에 60이 있는가?: " + contains60);

        // 데이터 삭제
        boolean isRemoved = set.remove(20);
        System.out.println("20 삭제 시도 결과: " + isRemoved);
        System.out.println("Set after removal: " + set);

        // Set의 크기 확인
        int size = set.size();
        System.out.println("Set 크기: " + size);

        // Set 순회
        System.out.print("Traversing the set: ");
        for (int element : set) {
            System.out.print(element + " ");
        }
    }
}
