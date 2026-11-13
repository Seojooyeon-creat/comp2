/*
[예외 떠넘기기]
발생하는 예외를 바로 처리하지 않으려면 메소드가 이 예외를 던진다고 메소드 정의에 ‘throws’로 표시하여야 한다.

import java.io.*;

public class ExceptionTest2 {


	public static void main(String args[]) throws IOException {
		FileReader fr = new FileReader("test.txt");
		char[] a = new char[50];
		fr.read(a);
		for (char c : a)
			System.out.print(c);
	}
}

 */

public class Sect13_throws {
}
