package programmers.lv1.P388351;

public class Main {
    public static void main(String[] args) {
        int[] s = {700, 800, 1100};
        int[][] tl = {
                {710, 2359, 1050, 700, 650, 631, 659},
                {800, 801, 805, 800, 759, 810, 809},
                {1105, 1001, 1002, 600, 1059, 1001, 1100}
        };
        int sd = 5;

        int[] s2 = {730, 855, 700, 720};
        int[][] tl2 = {
                {710, 700, 650, 735, 700, 931, 912},
                {908, 901, 805, 815, 800, 831, 835},
                {705, 701, 702, 705, 710, 710, 711},
                {707, 731, 859, 913, 934, 931, 905}
        };
        int sd2 = 1;

        solution(s, tl, 1);
//        solution(s2, tl2, sd2);
    }

    public static int solution(int[] s, int[][] t, int day) {
        int cnt = 0;

        for (int i = 0; i < s.length; i++) {
            int tmp = 0;
            int attendanceTime = 0;

            for (int j = 0; j < t[i].length; j++) {
                if (day == 6) {
                    tmp++;
                    day++;
                    continue;
                }

                if (day == 7) {
                    tmp++;
                    day = 1;
                    continue;
                }

                attendanceTime = s[i] + 10;

//                if (String.valueOf(attendanceTime).length() == 3) {
//                    if (Integer.parseInt(String.valueOf(s[i]).substring(1, 3)) >= 50) {
//                        attendanceTime += 40;
//                    }
//                } else {
//                    if (Integer.parseInt(String.valueOf(s[i]).substring(2, 3)) >= 50) {
//                        attendanceTime += 40;
//                    }
//                }

                if (attendanceTime % 100 >= 60) {
                    attendanceTime += 40;
                }

                if (attendanceTime >= t[i][j]) {
//                    System.out.println(attendanceTime + " " + t[i][j] + " " + day);
                    tmp++;
                }

                day++;
            }

            if (tmp == t[i].length) {
                cnt++;
            }
        }

//        System.out.println(cnt);
        return cnt;
    }
}
