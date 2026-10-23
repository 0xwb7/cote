package programmers.lv1.P258712;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] f = {"muzi", "ryan", "frodo", "neo"};
        String[] g = {
                "muzi frodo", "muzi frodo",
                "ryan muzi", "ryan muzi",
                "ryan muzi", "frodo muzi",
                "frodo ryan", "neo muzi"
        };

        String[] f2 = {"joy", "brad", "alessandro", "conan", "david"};
        String[] g2 = {
                "alessandro brad", "alessandro joy",
                "alessandro conan", "david alessandro",
                "alessandro david"
        };

        String[] f3 = {"a", "b", "c"};
        String[] g3 = {"a b", "b a", "c a", "a c", "a c", "c a"};

//        solution(f, g);
//        solution(f2, g2);
        solution(f3, g3);
    }

    public static int solution(String[] f, String[] g) {
        HashMap<String, Integer> map = new HashMap<>();

        int n = f.length;
        int[][] table = new int[n][n];
        int[] score = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            map.put(f[i], i);
        }

        for (String gift : g) {
            String[] arr = gift.split(" ");

            int from = map.get(arr[0]);
            int to = map.get(arr[1]);

            table[from][to]++;

            score[from]++;
            score[to]--;
        }

//        for (int i = 0; i < f.length; i++) {
//            for (int j = 0; j < f.length; j++) {
//                System.out.print(table[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(Arrays.toString(score));

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (table[i][j] > table[j][i]) {
                    result[i]++;
                } else if (table[i][j] < table[j][i]) {
                    result[j]++;
                } else {
                    if (score[i] > score[j]) {
                        result[i]++;
                    } else if (score[i] < score[j]) {
                        result[j]++;
                    }
                }
            }
        }

//        System.out.println(Arrays.toString(result));

        int answer = 0;

        for (int cnt : result) {
            answer = Math.max(answer, cnt);
        }

        return answer;
    }
}
