/*
{정적 변수를 사용할 때 주의할 점}

정적 메소드는 정적 멤버만 사용할 수 있다.
정적 메소드는 객체가 생성되지 않아도 사용할 수 있다.
따라서 객체가 생성된 후에 생성되는 인스턴스 멤버를 사용하면 안 된다.
class Test {
	int a;			// 인스턴스 변수
	static int b;		// 정적 변수

	void sub1() { a = 0; }		    // OK!
	static void sub2() { a = 0; }   // 오류! 인스턴스 멤버를 사용하면 안 됨
}
public class Test {
       public static void main(String args[]) {
             add(10, 20); // 오류! 정적 메소드 안에서 인스턴스 메소드 호출
       }
       int add(int x, int y) {
             return x + y;
       }
}
정적 메소드는 this를 사용할 수 없다. this는 현재 객체를 가리키는 참조 변수이다. 정적 메소드는 객체가 없을 때도 호출될 수 있기 때문에 현재 객체라는 개념이 없다.

class Test {
	static int a;			// 인스턴스 변수

	static void sub(int x) {
		this.a = x;        // 오류! 정적 메소드에서는 this를 사용하면 안 됨
	}
}
main() 메소드도 정적 메소드이기 때문에 인스턴스 메소드를 호출할 수 없다.
하지만 정적 메소드는 main() 메소드에서 호출할 수 있다.
public class Test {

   public static int cube(int x) {		    // 정적 메소드
        int result = x * x * x;
        return result;
  }

  public static void main(String args[]) {		// 정적 메소드
      System.out.println("10*10*10은 " + cube(10));	// 정적 메소드 호출
  }
}


 */
public class Sect7_cautions {
}
