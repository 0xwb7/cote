package programmers.P42579;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] g = {"classic", "pop", "classic", "classic", "pop"};
        int[] p = {500, 600, 150, 800, 2500};

        System.out.println(Arrays.toString(solution(g, p)));
    }

    public static int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> hm = new HashMap<>();
        HashMap<String, List<int[]>> songs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            hm.put(genres[i], hm.getOrDefault(genres[i], 0) + plays[i]);

            songs.computeIfAbsent(
                    genres[i], k -> new ArrayList<>())
                    .add(new int[]{i, plays[i]}
                    );
        }

        ArrayList<String> keys = new ArrayList<>(hm.keySet());
        keys.sort((a, b) -> Integer.compare(hm.get(b), hm.get(a)));

        ArrayList<Integer> list = new ArrayList<>();

        for (String key : keys) {
            List<int[]> genre = songs.get(key);

            genre.sort((a, b) -> {
                if (b[1] == a[1]) {
                    return Integer.compare(a[0], b[0]);
                }

                return Integer.compare(b[1], a[1]);
            });

            for (int i = 0; i < Math.min(2, genre.size()); i++) {
                list.add(genre.get(i)[0]);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
