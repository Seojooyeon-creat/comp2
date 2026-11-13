/*
객체를 저장하는 배열을 객체 배열이라고 한다.
정수형 배열에는 정수 값이 저장되어 있지만, 객체 배열에는 객체에 대한 참조 값이 저장되어 있다.
class Rect {
	int width, height;
	public Rect(int w, int h){
		this.width = w;
		this.height = h;
	}
	double getArea() {	 return (double) (width * height); }
}
public class RectArrayTest {
	public static void main(String[] args) {
		Rect[] list;
		list = new Rect[5];

		for (int i = 0; i < list.length; i++)
		    list[i] = new Rect(i, i);

		for (int i = 0; i < list.length; i++)
 		    System.out.println(i + "번째 사각형의 면적 = " + list[i].getArea());
	}
}
 */
public class Sect8_ObjectArray {
}
