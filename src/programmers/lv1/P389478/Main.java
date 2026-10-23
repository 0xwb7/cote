package programmers.lv1.P389478;

public class Main {
    public static void main(String[] args) {
        solution(22, 6, 8);
        solution(13, 3, 6);
    }

    public static int solution(int n, int w, int num) {
        int h = (int) Math.ceil((double) n / w);

        int[][] box = new int[h][w];

        int tmp = 1;
        for (int i = 0; i < h; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < w; j++) {
                    box[i][j] = tmp;
                    tmp++;

                    if (tmp > n) {
                        break;
                    }
                }
            } else {
                for (int j = w - 1; j >= 0; j--) {
                    box[i][j] = tmp;
                    tmp++;

                    if (tmp > n) {
                        break;
                    }
                }
            }
        }

        int firstIdx = 0;
        int lastIdx = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (box[i][j] == num) {
                    firstIdx = i;
                    lastIdx = j;
                }
            }
        }

        int cnt = 1;
        firstIdx++;
        while (firstIdx < h) {
            if (box[firstIdx][lastIdx] == 0) {
                break;
            }

            firstIdx++;
            cnt++;
        }

        return cnt;
    }
}
