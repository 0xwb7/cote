package programmers.lv0.p120821;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(int[] n) {
        int[] reverse = new int[n.length];

        int j = 0;
        for (int i = n.length - 1; i >= 0; i--) {
            reverse[j] = n[i];
            j++;
        }

        return reverse;
    }
}
