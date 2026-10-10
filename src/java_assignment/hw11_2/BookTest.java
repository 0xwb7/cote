//*********************************
// 파일명: BookTest.java
// 작성자: 이우빈
// 작성일: 2026-10-11
// 내용: 람다식과 Collection을 활용한 도서 목록 관리 및 가격 계산 프로그램
//*********************************

package java_assignment.hw11_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class BookTest {
    public static void main(String[] args) {
        System.out.println("hw11_2: 이우빈");

        // 1. Book 객체들을 담은 ArrayList 생성
        List<Book> bookList = new ArrayList<>(Arrays.asList(
                new Book("자바 프로그래밍", "IT", 30000),
                new Book("파이썬 기초", "IT", 25000),
                new Book("세계 역사 이야기", "역사", 18000),
                new Book("소설 삼국지", "문학", 15000),
                new Book("클린 코드", "IT", 35000)
        ));

        // 2. 전체 도서 목록 출력 (.forEach와 람다식 또는 메서드 참조 사용)
        System.out.println("=== 전체 도서 목록 ===");
        bookList.forEach(System.out::println);
        System.out.println();

        // 3. IT 분야 도서의 평균 가격 계산 (람다식 매개변수 전달)
        double itAverage = averagePrice(
                bookList,
                category -> category.equals("IT"),  // IT 카테고리인지 확인하는 Predicate 람다식
                Book::getPrice // Book 객체에서 가격(Integer)을 추출하는 Function 람다식 또는 메서드 참조
        );

        System.out.println("IT 분야 도서 평균 가격 : " + itAverage + "원");
        System.out.println();

        // 4. IT 분야 도서 가격 10% 할인 적용 (replaceAll과 람다식 사용)
        System.out.println("=== IT 분야 도서 10% 할인 적용 후 ===");
        bookList.replaceAll(book -> {
            if (book.getCategory().equals("IT")) {
                return new Book(book.getTitle(), book.getCategory(), book.getPrice() - (book.getPrice() / 10));
            }

            return book;
        });
        // IT 분야 도서의 가격을 10% 할인하여 새 Book 객체로 반환하는 UnaryOperator 람다식

        bookList.forEach(b -> System.out.println(b));
    }

    // 조건(Predicate)에 맞는 도서의 가격을 추출(Function)하여 평균을 계산하는 메서드
    public static double averagePrice(
            List<Book> books,
            Predicate<String> category, // Predicate 매개변수 타입 및 변수명 선언
            Function<Book, Integer> price // Function 매개변수 타입 및 변수명 선언
    ) {
        int sum = 0;
        int cnt = 0;

        for (Book book : books) {
            if (category.test(book.getCategory())) {
                sum += price.apply(book);
                cnt++;
            }
        }

        return cnt == 0 ? 0 : (double) sum / cnt;
    }
}

class Book {
    private String title;
    private String category;
    private int price;

    public Book(String title, String category, int price) {
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s - %d원", category, title, price);
    }
}
