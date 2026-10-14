package programmers.p42577;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] pb = {"119", "97674223", "1195524421"};
        System.out.println(solution(pb));
    }

    public static boolean solution(String[] pb) {
        Arrays.sort(pb);

        for (int i = 0; i < pb.length - 1; i++) {
            if (pb[i + 1].startsWith(pb[i])) {
                return false;
            }
        }

        return true;
    }
}
