package programmers.lv0.p120816;

public class Main {
    public static void main(String[] args) {
        int s = 7;
        int n = 10;
        System.out.println(solution(s, n));
    }

    public static int solution(int slice, int n) {
        if (slice > n) {
            return 1;
        } else {
            if (n % slice == 0) {
                return n / slice;
            }

            return n / slice + 1;
        }
    }
}
