package P1844;
// DFS, 테스트 케이스는 통과했지만, 효율성 테스트에서 실패함 (시간 초과)

public class Main {
    static int[][] map = {
            {1, 0, 1, 1, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 0, 1},
            {0, 0, 0, 0, 1}
    };

    static boolean[][] visited = new boolean[5][5];

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    static int minDistance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        dfs(0, 0, 1);

        if (minDistance == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(minDistance);
        }
    }

    static void dfs(int x, int y, int distance) {
        if (distance >= minDistance) {
            return;
        }

        if (x == 4 && y == 4) {
            minDistance = distance;
            return;
        }

        visited[y][x] = true;

        for (int i = 0; i < 4; i++) {

            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= 5 || ny < 0 || ny >= 5) {
                continue;
            }

            if (map[ny][nx] == 0) {
                continue;
            }

            if (visited[ny][nx]) {
                continue;
            }

            dfs(nx, ny, distance + 1);
        }

        visited[y][x] = false;
    }
}
