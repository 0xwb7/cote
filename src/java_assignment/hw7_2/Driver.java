package java_assignment.hw7_2;

interface Speakable {
    void speak();
}


public class Driver {

    public static void main(String[] args) {
        System.out.println("hw7_2: 이우빈");

        Speakable myDog = new Speakable() {

            @Override
            public void speak() {
                System.out.println("멍멍");
            }
        };

        myDog.speak();

        Speakable clock = new Speakable() {

            private int number = 5;

            @Override
            public void speak() {
                for (int i = 0; i < number; i++) {
                    System.out.print("삐");
                }

                System.out.println();

                number = number + 3;
            }
        };

        clock.speak();
        clock.speak();
    }
}
