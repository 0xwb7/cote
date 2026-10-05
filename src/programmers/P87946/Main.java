package programmers.P87946;

public class Main {
    static boolean[] visited;
    static int maxCount;

    public static int solution(int k, int[][] dungeons) {
        int n = dungeons.length;
        visited = new boolean[n];
        maxCount = 0;

        dfs(dungeons, k, 0);

        return maxCount;
    }

    public static void dfs(int[][] dungeons, int k, int cnt) {
        maxCount = Math.max(maxCount, cnt);

        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i]) {
                continue;
            }

            if (k < dungeons[i][0]) {
                continue;
            }

            visited[i] = true;
            dfs(dungeons, k - dungeons[i][1], cnt + 1);
            visited[i] = false;
        }
    }
}
