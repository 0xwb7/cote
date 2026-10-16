//***************************
// 파일명: StreamFilter.java
// 작성자: 202014056 이우빈
// 작성일: 10.16
// 내용: 4개의 문자열 리스트 객체에서 문자열 크기가 2인 단어 중 하나만 출력하는 프로그램
//***************************

package java_assignment.hw12_1;

import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        System.out.println("hw12_1: 이우빈");
        Stream<String> s1 = Stream.of("갈매기", "나비", "다람쥐", "라마");

        s1.filter(s -> s.length() == 2)
                .limit(1)
                .forEach(System.out::println);
    }
}
