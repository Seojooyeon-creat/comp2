package Chapter4;

class Circle3{
    //아래를 기본생성자
    //기본생성자는 자바 컴파일러가 자동으로 만들어줌
    public Circle3(int radius, String color){
        this.radius = radius;
        this.color = color;
    }
    int radius;
    String color;
    double getArea(){
        return radius * radius * 3.14;
    }
}

public class CircleTest3 {
    static void main(String[] args){
        //Circle3 obj = new Circle3();
        //Circle3 obj = new Circle3(5);
        Circle3 obj2 = new Circle3(5, "빨간색");
    }
}
