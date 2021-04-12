package Resizeable;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(80);
        System.out.println("Bán kính gốc");
        System.out.println(circle.getRadius());
        System.out.println("Bán kính sau khi chỉnh");
        circle.resize(30);
        System.out.println(circle.getRadius());

        Rectangle rectangle = new Rectangle(4,5);
        rectangle.resize(100);
        System.out.println(Math.round(rectangle.getArea()));
    }
}
