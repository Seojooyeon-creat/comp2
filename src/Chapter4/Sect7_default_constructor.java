package Chapter4;
/*
기본 생성자(default contrcutor)는 매개 변수가 없는 생성자이다.
만약 개발자가 생성자를 하나도 정의하지 않으면 자바 컴파일러는 기본 생성자를 자동으로 만든다
1.기본 생성자가 자동으로 생성되는 경우
public class Circle {
    int radius;
    String color;


    double getArea() {
        return 3.14 * radius * radius;
    }
}




2. 기본 생성자가 자동으로 추가되는 않는 경우
public class Box {
	int width, height, depth;
	public Box(int w, int h, int d)	{
		width=w;	height=h;	depth=d;
	}

	public static void main(String[] args) {
		Box b = new Box();		// 오류 발생!! 생성자가 하나 있어서 기본 생성자를 추가하지 않아요!

		System.out.println("상자의 크기: (" + b.width + "," + b.height + "," + b.depth + ")");
	}
}

[this()]
this()는 다른 생성자를 의미한다.
public class Circle5 {
    int radius;

    public Circle5(int radius) {
        this.radius = radius;
    }

    public Circle5() {
        this(0);
    }
    double getArea() {
        return 3.14 * radius * radius;
    }
}

 */
public class Sect7_default_constructor {
}
