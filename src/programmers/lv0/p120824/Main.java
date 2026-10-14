package programmers.lv0.p120824;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(int[] n) {
        int[] ans = {0, 0};

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                ans[0]++;
            } else {
                ans[1]++;
            }
        }

        return ans;
    }
}
