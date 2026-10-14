package programmers.lv0.p120817;

public class Main {

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution(n));
    }

    public static double solution(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return (double) sum / numbers.length;
    }
}
