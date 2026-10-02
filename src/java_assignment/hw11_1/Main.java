package java_assignment.hw11_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hw11_1: 이우빈");

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.print("점수를 입력하세요: ");
            int n = sc.nextInt();

            if (n < 0) {
                break;
            }

            list.add(n);
        }

        int max = Collections.max(list);

        System.out.println("전체 학생은 " + list.size() + "명이다.");

        System.out.print("학생들의 성적: ");
        list.forEach(score -> System.out.print(score + " "));
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "번 학생의 성적은 " + list.get(i) + "점이며 등급은 " + getGrade(list.get(i), max) + "이다.");
        }
    }

    public static String getGrade(int score, int max) {
        if (max - score < 10) {
            return "A";
        } else if (max - score <= 20) {
            return "B";
        } else if (max - score <= 30) {
            return "C";
        } else if (max - score <= 40) {
            return "D";
        } else {
            return "F";
        }
    }
}
