package collection.list;


import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("list = " + list);

        // 여기서 마지막에 6을 추가하려면!?
        list.add(6);
        System.out.println("list = " + list);
                
    }
}

