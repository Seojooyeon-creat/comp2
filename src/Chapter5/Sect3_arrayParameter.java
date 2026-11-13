/*

자바에서는 배열도 객체이다. 따라서 배열이 전달되는 경우에도 객체가 전달되는 것과 동일하게 처리된다.
즉, 배열이 전달되는 것이 아니라 배열을 가리키는 참조 값이 복사되고 메소드에서 매개변수를 통하여
배열을 변경하면 원본 배열이 변경된다.

int[] list = {1,2,3,4,5};

ArrayProc obj = new ArrayProc();

obj.inc(list);

...
`

void inc(int[] array)
{
    ...

    for(int i = 0; i < array.length; i++)
        array[i] = array[i] + 1;
}



배열을 전달받은 메쏘드를 작성하는데 배열을 받아 최소 값을 구하는 메쏘드를 작성하여라
메인함수에 적용되는 초기값
double[] a = {1.1, 2.2, 3.3, 4.4, 0.1, 0.2};
double[] b = {-2.0, 3.0, -9.0, 2.9, 1.5};
실행화면
첫 번째 배열의 최솟값 = 0.1
두 번째 배열의 최솟값 = -9.0



public class ArrayArgumentTest {
	public static double minArray(double[] list) {
		double min = list[0];

		for (int i = 1; i < list.length; i++) {
			if (list[i] < min)
				min = list[i];
		}
		return min;
	}
	public static void main(String args[]) {
		double[] a = {1.1, 2.2, 3.3, 4.4, 0.1, 0.2};
		double[] b = {-2.0, 3.0, -9.0, 2.9, 1.5};

		double min;
		min = minArray(a);
		System.out.println("첫 번째 배열의 최솟값 = " + min);
		min = minArray(b);
		System.out.println("두 번째 배열의 최솟값 = " + min);
	}
}

 */

public class Sect3_arrayParameter {


}
