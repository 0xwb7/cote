package java_assignment.hw10_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PersonTest {
    public static void main(String[] args) {
        System.out.println("hw10_3: 이우빈");
        System.out.println();
        System.out.println("평균 신장 : " + average(p -> p.getHeight()));
        System.out.println("평균 체중 : " + average(p -> p.getWeight()));
    }

    public static double average(Function<Person, Integer> function) {
        double sum = 0;

        for (Person person : Person.persons) {
            sum += function.apply(person);
        }

        return sum / Person.persons.size();
    }
}

class Person {
    private String name;
    private int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + "(" + height + ", " + weight + ")";
    }

    static List<Person> persons = Arrays.asList(
            new Person("황진이", 160, 45),
            new Person("이순신", 180, 80),
            new Person("김삿갓", 175, 65),
            new Person("홍길동", 170, 68),
            new Person("배장화", 155, 48)
    );
}
