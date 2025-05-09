package collection.list;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // 배열 제일 뒤에 6 을 추가해 봅시다!
        int[] temp = new int[arr.length + 1];

        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        temp[temp.length - 1] = 6;
        arr = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
