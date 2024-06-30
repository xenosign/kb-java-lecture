package lang.math.lotto;

import java.util.Random;

public class LottoGenerator {
    private Random random = new Random();
    private int[] lottoNumbers;
    private int count;
    private static final int LOTTO_NUMS = 6;
    private static final int LOTTO_BOUNDARY = 46;

    public void generate() {
        lottoNumbers = new int[LOTTO_NUMS];
        count = 0;

        while (count < LOTTO_NUMS) {
            int rand = random.nextInt(LOTTO_BOUNDARY);

            if(isUnique(lottoNumbers, rand)) {
                lottoNumbers[count] = rand;
                count++;
            }
        }
    }

    public void printLottoNumbers() {
        System.out.print("로또 번호 : ");
        for (int i = 0; i < LOTTO_NUMS; i++) {
            System.out.print(lottoNumbers[i] + " ");
        }
    }

    private boolean isUnique(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return false;
            }
        }
        return true;
    }
}
