package programmers.lv0.p120825;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("hello", 3));
    }

    public static String solution(String s, int n) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            ans += String.valueOf(s.charAt(i)).repeat(n);
        }

        return ans;
    }
}
