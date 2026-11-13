package Chapter6;

class Shape {
    public void draw() {
        System.out.println("Shape 중 하나를 그릴 예정입니다.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        super.draw();
        //super.toString();
    }
}

public class ShapeTest {

}