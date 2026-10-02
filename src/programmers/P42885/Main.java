package programmers.P42885;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] p = {70, 50, 80, 50};
        int l = 100;

        solution(p, l);
    }

    public static int solution(int[] p, int l) {
        Arrays.sort(p);

        int firstIndex = 0;
        int lastIndex = p.length - 1;
        int cnt = 0;

        while (true) {
            if (p[firstIndex] + p[lastIndex] <= l) {
                cnt++;
                firstIndex++;
                lastIndex--;
            } else {
                cnt++;
                lastIndex--;
            }

            if (firstIndex > lastIndex) {
//                System.out.println(cnt);
                return cnt;
            }
        }
    }
}
