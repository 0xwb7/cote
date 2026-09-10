package P42586;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        int[] p = {99};
        int[] s = {1};

        solution(p, s);
    }

    static int[] solution(int[] p, int[] s) {
        int len = p.length;
        int[] duration = getDuration(p, s, len);
        ArrayList<Integer> arr = new ArrayList<>();

        int idx = 0;
        int cnt = 1;
        int peek = duration[idx];
        while (true) {

            if (idx == len - 1) {
                arr.add(cnt);
                break;
            }

            for (int i = idx + 1; i < len; i++) {
                if (peek >= duration[i]) {
                    cnt++;
                } else {
                    arr.add(cnt);
                    cnt = 1;
                    idx = i;
                    peek = duration[idx];
                }

                if (i == len - 1) {
                    idx = i;
                }
            }
        }

        int[] retArr = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            retArr[i] = arr.get(i);
        }

        System.out.println(arr);
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
