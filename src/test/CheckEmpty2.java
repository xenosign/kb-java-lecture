package test;

import java.util.ArrayList;

public class CheckEmpty2 {
    public static String[] solution(String my_string) {
        ArrayList<String> strList = new ArrayList<>();
        String temp  = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == ' ' && !temp.isEmpty()) {
                strList.add(temp);
                temp = "";
            } else if (my_string.charAt(i) == ' ') {
                continue;
            } else {
                temp += my_string.charAt(i);
            }

        }

        if(!temp.isEmpty()) {
            strList.add(temp);
        }

        String[] answer = new String[strList.size()];
        answer = strList.toArray(answer);


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(" i    love  you"));
        System.out.println(solution(	"    programmers  "));
    }
}
