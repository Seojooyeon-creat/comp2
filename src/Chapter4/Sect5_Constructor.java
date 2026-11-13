package Chapter4;
/*
[생성자]
객체는 어떻게 초기화하면 좋을까? 객체를 초기화한다는 것은 주로 객체 안의 필드에 값을 할당하는 것이다.
객체가 생성된 후에 필드에 값을 할당하여도 된다. 하지만 이러한 방법은 많은 단점을 가지고 있다.
개발자가 깜빡 잊어버릴 수 있기 때문이다.
생성자(constructor) 는 객체가 생성될 때 자동으로 호출되어서 객체를 초기화하는 특수한 메소드이다

class Circle3 {
    int radius;
    String color;


    //아래에 생성자를 만들어보자



    double getArea() {
        return 3.14 * radius * radius;
    }
}

public class Sect5_Constructor {

        public static void main(String[] args) {
            Circle3 obj;
            obj = new Circle3(100, "blue");

            double area = obj.getArea();
            System.out.println("원의 면적 = " + area);
        }

}

 */