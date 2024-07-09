package collection.stack;

import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String input = "난장이장난";

        // 문자열의 각 문자를 스택에 푸시
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // 스택에서 문자를 하나씩 팝하여 배열에 담기
        char[] reversedArray = new char[input.length()];
        int i = 0;
        while (!stack.isEmpty()) {
            reversedArray[i++] = stack.pop();
        }

        // 배열을 문자열로 변환하여 반환
        String reversed = new String(reversedArray);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }


}
