package Chapter7;

abstract class Shape{
    abstract public double calculateArea();

}

class Circle extends Shape{
    private int radius;
    public void setRadius(int radius){
        this.radius = radius;
    } //생성자를 사용해서 초기값 세팅. 생성자는 상속과 상관 없음.
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return radius * radius * 3.14;
    }
}

class Rectangle extends Shape{
    private int width, height;
    public Rectangle(int width, int height){
        this.height = height; this.width = width;
    }
    public double calculateArea(){
        return width * height;
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Shape s = new Circle(5);
        System.out.println(s.calculateArea());
//        s.radius = 5; private여서 안됨
//        s.setradius(5); S가 Shape 인데 여기에는 setRaius가 없음.
        s = new Rectangle(5, 5);
        System.out.println((s.calculateArea()));
    }
}
