package programmers.lv0.p120819;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int m = 15000;
        System.out.println(Arrays.toString(solution(m)));
    }

    public static int[] solution(int money) {
        int cost = 5500;
        int[] answer = new int[2];

        if (money >= cost) {
            answer[0] = money / cost;
            answer[1] = money % cost;
        } else {
            answer[0] = 0;
            answer[1] = money;
        }

        return answer;
    }
}
