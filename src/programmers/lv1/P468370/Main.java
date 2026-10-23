package programmers.lv1.P468370;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String m1 = "here is muzi here is a secret message";
        String m2 = "my phone number is 01012345678 and may i have your phone number";

        int[][] sR1 = {{0, 3}, {23, 28}};
        int[][] sR2 = {{5, 5}, {25, 28}, {34, 40}, {53, 59}};

        System.out.println(solution(m1, sR1));
    }

    public static int solution(String m, int[][] r) {
        String[] s = m.split(" ");
        int[][] sr = new int[s.length][2];

        int len = 0;
        for (int i = 0; i < s.length; i++) {
            len += s[i].length() + 1;

            sr[i][0] = len - s[i].length() - 1;
            sr[i][1] = len - 2;
        }

        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < sr.length; i++) {
            for (int j = 0; j < r.length; j++) {
                if (r[j][1] >= sr[i][0] && r[j][0] <= sr[i][1]) {
                    list.add(s[i]);
                    s[i] = "";
                }

            }
        }

//        System.out.println(list);
//        System.out.println(Arrays.toString(s));

        for (String str : s) {
            set.add(str);
        }

//        System.out.println(set);
//        System.out.println();

        int cnt = 0;
        for (String str : list) {
            if (set.add(str)) {
//                System.out.println(str);
                cnt++;
            }
        }

        return cnt;
    }
}
