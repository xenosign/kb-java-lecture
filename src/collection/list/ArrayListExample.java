package collection.list;


import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(3);
        list.add(2);
        list.add(8);
        list.add(22);
        list.add(76);
        list.add(54);

        System.out.println("list = " + list);
        System.out.println("size = " + list.size());

        System.out.println(list.get(4));

    }
}

