package java_assignment.hw10_1;

import javax.swing.Timer;

/****************************
 // 파일명: LamdaTest.java
 // 작성자: 이우빈
 // 작성일: 26.09.20
 // 내용: 람다식을 이용하여 1초마다 beep을 출력하는 프로그램
 ****************************/

public class LamdaTest {

    public static void main(String[] args) {
        System.out.println("hw10_1: 이우빈");

        Timer t = new Timer(1000,
                event -> System.out.println("beep"));

        t.start();

        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
