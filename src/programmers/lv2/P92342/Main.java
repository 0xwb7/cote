package programmers.lv2.P92342;

import java.util.Arrays;

public class Main {

    static int[] ryan;
    static int[] info;
    static int[] answer;
    static int maxDiff;

    public static void main(String[] args) {
        int[] info1 = {2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
        int[] info2 = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] info3 = {0, 0, 1, 2, 0, 1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(solution(5, info1)));
    }

    public static int[] solution(int n, int[] inf) {
        info = inf;
        ryan = new int[11];
        answer = new int[]{-1};
        maxDiff = 0;

        dfs(0, n);

        return answer;
    }

    public static void dfs(int idx, int remain) {
        if (idx == 10) {
            ryan[10] = remain;
            return;
        }

        int required = info[idx] + 1;

        if (remain >= required) {
            ryan[idx] = required;
            dfs(idx + 1, remain - required);
            ryan[idx] = 0;
        }

        dfs(idx + 1, remain);
    }



}
