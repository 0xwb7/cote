package java_assignment.hw7_1;

interface Shape {
    double PI = 3.14;

    void draw();

    double getArea();

    default void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circle implements Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 " + radius + "인 원입니다.");
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}

class Rect implements Shape {
    private final int width;
    private final int height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public void draw() {
        System.out.println(width + "X" + height + "크기의 사각형입니다.");
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class Driver {

    public static void main(String[] args) {
        System.out.println("hw7_1: 이우빈");

        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(10);
        shapes[1] = new Circle(20);
        shapes[2] = new Rect(10, 40);
        shapes[3] = new Rect(20, 40);

        for (Shape shape : shapes) {
            shape.redraw();
        }

        for (Shape shape : shapes) {
            System.out.println("면적은 " + shape.getArea());
        }
    }
}
