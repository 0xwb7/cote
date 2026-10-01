package programmers.P1845;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        int[] n = {3,3,3,2,2,4};
        solution(n);
    }

    public static int solution(int[] n) {
        ArrayList<Integer> arr = new ArrayList<>();

        int len = n.length / 2;

        for (int i = 0; i < n.length; i++) {
            arr.add(n[i]);
        }

        long cnt = arr.stream()
                        .distinct()
                                .count();

        if (len < cnt) {
//            System.out.println(len);
            return len;
        } else {
//            System.out.println(cnt);
            return (int) cnt;
        }
    }
}
