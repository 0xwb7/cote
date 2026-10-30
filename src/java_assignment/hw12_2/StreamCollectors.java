//***************************
// 파일명: StreamCollector.java
// 작성자: 202014056 이우빈
// 작성일: 26.10.30
// 내용: Stream API와 Collectors를 사용하여 데이터를 집계하는 코드입니다.
//***************************

package java_assignment.hw12_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectors {
    public static void main(String[] args) {
        System.out.println("hw12_2: 이우빈");

        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student("김민수", "게임", 90),
                new Student("이서연", "게임", 80),
                new Student("박지훈", "컴퓨터", 75),
                new Student("최유진", "게임", 95),
                new Student("정하준", "컴퓨터", 85),
                new Student("오지우", "AI", 70),
                new Student("한예린", "AI", 100)
        ));

        // 전공명 : 학생수
        Map<String, Long> map1 =
                studentList.stream()
                        .collect(Collectors.groupingBy(
                                Student::getMajor,
                                Collectors.counting()
                        ));

        System.out.println(map1);

        // 전공명 : 평균점수
        Map<String, Double> map2 =
                studentList.stream()
                        .collect(Collectors.groupingBy(
                                Student::getMajor,
                                Collectors.averagingInt(Student::getScore)
                        ));

        System.out.println(map2);

        /*
        점수가 80점 이상인 학생과 80점 미만인 학생을 구분하고,
        각 그룹의 학생 이름을 문자열로 결합하여 Map으로 수집하고 출력하시오.
         */
        Map<Boolean, String> map3 =
                studentList.stream()
                        .collect(Collectors.partitioningBy(
                                p -> p.getScore() >= 80,
                                Collectors.mapping(
                                        Student::getName,
                                        Collectors.joining(", ")
                                )

                        ));

        System.out.println(map3);
    }

    public static class Student {
        private final String name;
        private final String major;
        private final int score;

        public String getName() {
            return name;
        }

        public String getMajor() {
            return major;
        }

        public int getScore() {
            return score;
        }

        public Student(String name, String major, int score) {
            this.name = name;
            this.major = major;
            this.score = score;
        }
    }
}
