import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
try_catch 사용 예제
import java.io.*;

public class TryTest {
    public static void main(String args[]) {

        FileReader fr = null;

        try {
            fr = new FileReader("test.txt");

            char[] a = new char[50];
            fr.read(a);

            for (char c : a) {
                System.out.print(c);
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

[try-with-resources]
파일이나 데이터베이스 연결을 close할때 유용
try-with-resources 문(자동 리소스 관리라고도 함)은 Java 7에서 도입된 새로운 예외 처리 메커니즘으로, try-catch 문 내에서 사용되는 리소스를 자동으로 닫는다. 생성된 리소스는 블록의 끝에서 자동으로 닫힌다.
import java.io.*;
public class TryTest {
	public static void main(String args[]) {

		try (FileReader fr = new FileReader("src/Chapter5/test.txt")) {

			char[] a = new char[50];
			fr.read(a);
			for (char c : a)
				System.out.print(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

 */
public class Sect12_try_catch_resources {
    static void main(String[] args) {

    }
}
