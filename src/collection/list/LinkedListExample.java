package collection.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        // 처음과 마지막에 데이터 추가
        linkedList.addFirst(0);        
        linkedList.addLast(6);

        // 특정 인덱스에 데이터 추가
        linkedList.add(3, 22);

        // LinkedList 출력
        System.out.println("LinkedList: " + linkedList);

        // 데이터 검색
        int firstElement = linkedList.getFirst(); // 첫 번째 데이터
        int lastElement = linkedList.getLast(); // 마지막 데이터
        int elementAtIndex = linkedList.get(3); // 인덱스 3의 데이터

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
        System.out.println("Element at index 3: " + elementAtIndex);

        // 데이터 삭제
        linkedList.removeFirst(); // 첫 번째 데이터 삭제
        linkedList.removeLast(); // 마지막 데이터 삭제
        linkedList.remove(2); // 인덱스 2의 데이터 삭제

        // LinkedList 출력
        System.out.println("LinkedList after removals: " + linkedList);

        // 데이터 포함 여부 확인
        boolean contains30 = linkedList.contains(30);
        System.out.println("Contains 30: " + contains30);
    }
}
