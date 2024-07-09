package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // HashMap 선언
        Map<String, Integer> hashMap = new HashMap<>();

        // 데이터 추가 (put)
        hashMap.put("사과", 10000);
        hashMap.put("바나나", 2000);
        hashMap.put("토마토", 500);
        hashMap.put("수박", 20000);

        // HashMap 출력
        System.out.println("HashMap: " + hashMap);

        // 특정 키의 값 가져오기 (get)
        int appleCount = hashMap.get("사과");
        System.out.println("사과 가격 : " + appleCount);

        // 키가 존재하는지 확인 (containsKey)
        boolean hasBanana = hashMap.containsKey("바나나");
        System.out.println("바나나 가격 : " + hasBanana);

        // 값이 존재하는지 확인 (containsValue)
        boolean hasValue20000 = hashMap.containsValue(20000);
        System.out.println("Contains value 20000: " + hasValue20000);

        // 데이터 삭제 (remove)
        int removedValue = hashMap.remove("수박");
        System.out.println("Removed value: " + removedValue);
        System.out.println("HashMap after removal: " + hashMap);

        // HashMap의 크기 확인 (size)
        int size = hashMap.size();
        System.out.println("HashMap size: " + size);
    }
}
