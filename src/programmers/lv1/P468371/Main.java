package programmers.lv1.P468371;

public class Main {
    public static void main(String[] arg) {
        int[][] s = {{2, 1, 2}, {5, 1, 1}};
        int[][] s2 = {{2, 3, 2}, {3, 1, 3}, {2, 1, 1}};
        int[][] s3 = {{3, 3, 3}, {5, 4, 2}, {2, 1, 2}};
        int[][] s4 = {{1, 1, 4}, {2, 1, 3}, {3, 1, 2}, {4, 1, 1}};
        solution(s4);
    }

    public static int solution(int[][] signals) {
        int limit = 1;

        for (int[] signal : signals) {
            limit *= signal[0] + signal[1] + signal[2];
        }

        for (int i = 1; i <= limit; i++) {
            boolean isYellow = false;

            for (int[] signal : signals) {
                int cycle = signal[0] + signal[1] + signal[2];
                int current = (i - 1) % cycle;

                if (current >= signal[0] && current < signal[0] + signal[1]) {
                    isYellow = true;
                } else {
                    isYellow = false;
                    break;
                }
            }

            if (isYellow) {
                System.out.println(i);
                return i;
            }
        }

        return -1;
    }
}
