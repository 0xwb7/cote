package programmers.P42587;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        int[] p = {2, 1, 3, 2};
        int loc = 2;

        System.out.println(solution(p, loc));
    }

    public static int solution(int[] priorities, int location) {
        Queue<Process> q = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            q.offer(new Process(i, priorities[i]));
        }

        Integer[] p = sortArr(priorities);

        int cnt = 0;
        int idx = 0;
        while (!q.isEmpty()) {
            Process current = q.poll();

            if (current.priority == p[idx]) {
                cnt++;
                idx++;

                if (current.index == location) {
                    return cnt;
                }
            } else {
                q.offer(current);
            }
        }

        return cnt;
    }

    static class Process {
        int index;
        int priority;

        public Process(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }

    static Integer[] sortArr(int[] p) {
        Integer[] arr = Arrays.stream(p)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }
}
