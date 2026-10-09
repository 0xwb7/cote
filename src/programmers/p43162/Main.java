package programmers.p43162;

public class Main {

    static boolean[] visited;

    public static void main(String[] args) {
        int[][] c = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(solution(3, c));
    }

    public static int solution(int n, int[][] computers) {
        visited = new boolean[n];

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                cnt++;
                dfs(computers, n, i);
            }
        }

        return cnt;
    }

    public static void dfs(int[][] c, int n, int idx) {
        visited[idx] = true;

        for (int i = 0; i < n; i++) {
            if (c[idx][i] == 1 && !visited[i]) {
                dfs(c, n, i);
            }
        }
    }
}
