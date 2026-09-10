package P42586;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        int[] p = {99};
        int[] s = {1};

        solution(p, s);
    }

    static int[] solution(int[] p, int[] s) {
        int len = p.length;
        int[] duration = getDuration(p, s, len);
        ArrayList<Integer> deployCounts = new ArrayList<>();

        int cnt = 1;
        int deployDay = duration[0];

        for (int i = 1; i < len; i++) {
            if (deployDay >= duration[i]) {
                cnt++;
            } else {
                deployCounts.add(cnt);
                cnt = 1;
                deployDay = duration[i];
            }
        }

        deployCounts.add(cnt);

        int[] retArr = new int[deployCounts.size()];

        for (int i = 0; i < deployCounts.size(); i++) {
            retArr[i] = deployCounts.get(i);
        }

        System.out.println(deployCounts);
        return retArr;
    }

    public static int[] getDuration(int[] p, int[] s, int len) {
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            if ((100 - p[i]) % s[i] != 0) {
                arr[i] = (100 - p[i]) / s[i] + 1;
            } else {
                arr[i] = (100 - p[i]) / s[i];
            }
        }

        return arr;
    }
}
