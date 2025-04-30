package assignment.ch15.exam03;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        // Iterator
        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // For
        for (String element : set) {
            System.out.println(element);
        }
    }
}
