package programmers.lv0.p120822;

public class Main {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        return reverse;
    }
}
