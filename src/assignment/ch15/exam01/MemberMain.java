package assignment.ch15.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MemberMain {
    public static void main(String[] args) {
        Set<Member> members = new HashSet<>();
        members.add(new Member("효석", 41));
        members.add(new Member("대상혁", 30));

        for (Member member : members) {
            System.out.println(member);
        }
    }
}
