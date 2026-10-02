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
//        System.out.println(Arrays.toString(p));

        for (int i = 0; i < p.length; i++) {
            for (int j = p.length; j > i; j--) {
                System.out.println(p[i] + " " + p[j]);;
            }
        }


        return 0;
    }
}
