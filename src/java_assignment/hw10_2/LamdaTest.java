package java_assignment.hw10_2;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class LamdaTest {
    public static void main(String[] args) {
        System.out.println("hw10_2: 이우빈");

        Scanner sc = new Scanner(System.in);
        int x, y;

        BiConsumer<Integer, Integer> m =
                (a, b) -> System.out.println("\n두 정수의 곱은 " + (a * b) + " 입니다.");

        System.out.print("첫 번째 정수 입력 : ");
        x = sc.nextInt();

        System.out.print("두 번째 정수 입력 : ");
        y = sc.nextInt();

        m.accept(x, y);

        sc.close();
    }
}
