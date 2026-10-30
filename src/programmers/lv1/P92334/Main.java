package programmers.lv1.P92334;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] id1 = {"muzi", "frodo", "apeach", "neo"};
        String[] r1 = {
                "muzi frodo", "apeach frodo",
                "frodo neo", "muzi neo", "apeach muzi"
        };
        int k1 = 2;

        String[] id2 = {"con", "ryan"};
        String[] r2 = {
                "ryan con", "ryan con",
                "ryan con", "ryan con"
        };
        int k2 = 3;

        System.out.println(Arrays.toString(solution(id1, r1, k1)));
//        System.out.println(Arrays.toString(solution(id2, r2, k2)));
    }

    public static int[] solution(String[] id, String[] report, int k) {
        int n = id.length;
        int[] answer = new int[n];

        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> r = new HashSet<>(Arrays.asList(report));

        for (String s : r) {
            String[] arr = s.split(" ");

            map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
        }

        HashMap<String, Integer> cnt = new HashMap<>();

        for (String s : r) {
            String[] arr = s.split(" ");

            if (map.get(arr[1]) >= k) {
                cnt.put(arr[0], cnt.getOrDefault(arr[0], 0) + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            answer[i] = cnt.getOrDefault(id[i], 0);
        }

        return answer;
    }
}
