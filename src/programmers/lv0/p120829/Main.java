package programmers.lv0.p120829;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(70));
    }

    public static int solution(int angle) {
        if (angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle > 90) {
            if (angle == 180) {
                return 4;
            }

            return 3;
        }

        return 0;
    }
}
