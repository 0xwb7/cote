package P1844;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main2 {

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        boolean[][] visited = new boolean[n][m];

        Queue<int[]> q = new ArrayDeque<>();

        q.offer(new int[]{0, 0, 1});
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int[] current = q.poll();

            int x = current[0];
            int y = current[1];
            int distance = current[2];

            if (x == m - 1 && y == n - 1) {
                return distance;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= m || ny < 0 || ny >= n) {
                    continue;
                }

                if (maps[ny][nx] == 0) {
                    continue;
                }

                if (visited[ny][nx]) {
                    continue;
                }

                visited[ny][nx] = true;
                q.offer(new int[]{nx, ny, distance + 1});
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] map = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}
        };

        System.out.println(solution(map));
    }
}
