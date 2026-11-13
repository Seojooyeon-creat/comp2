/*
[예외 처리 ]
잘못된 코드, 부정확한 데이터, 예외적인 상황 때문에 오류는 언제든지 발생할 수 있다.
자바에서는 이런 ‘예상치 못한 사고’를 예외(exception)라고 부른다.
보통 오류가 발생하면 프로그램은 “난 못하겠어!”하고 종료되지만, 이왕이면 우아하게 대처하는 게 더 낫지 않을까?
정상 처리
─────────────► [예외 발생] ─────────────► 계속 진행
                    │                       ▲
                    ▼                       │
               catch 블록                   │
                    │                       │
                    ▼                       │
               예외 처리 후 ────────────────┘

 예외발생예
 public class DivideByZero {
	public static void main(String[] args) {

		int result = 10 / 0;

		System.out.println("나눗셈 결과: " + result);
	}
}
[try-catch 문]
try {
    // 예외가 발생할 수 있는 코드
}
catch (예외 클래스 변수) {
    // 예외를 처리하는 코드
}
finally {   ← 생략 가능
    // try 블록이 끝나면 무조건 실행되는 코드
}



 public class DivideByZero {
	public static void main(String[] args) {
        try{
		    int result = 10 / 0;

		    System.out.println("나눗셈 결과: " + result);
		}catch(ArithmeticException e){
		    System.out.println("0으로 나누어서 결과가 없네요")
		}
	}
}
[예외의 종류 ]

모든 예외는 Throwable 클래스로부터 상속되어서 Error와 Exception이라고 하는
두 개의 클래스로 나누어진다. Exception은 다시 RuntimeException과 그 외로 나누어진다.


Throwable
├─ Error ----------------------------> 비체크 예외
│
└─ Exception
   ├─ RuntimeException --------------> 비체크 예외
   │   ├─ ArithmeticException
   │   ├─ NullPointerException
   │   └─ ArrayIndexOutOfBoundsException
   │
   └─ 기타 Exception ----------------> 체크 예외
       ├─ ClassNotFoundException
       ├─ IOException
       ├─ InterruptedException
       ├─ SQLException
       └─ FileNotFoundException
 * 참고
 Error → JVM 수준 오류 → 보통 처리하지 않음(JVM이 정상적으로 작동하지 않음:예 무한루프)
RuntimeException 계열 → 비체크 예외(Unchecked Exception)-컴파일할때 에러가 없음
RuntimeException을 제외한 Exception 계열 → 체크 예외(Checked Exception)
모든 예외와 오류의 최상위 클래스는 Throwable 입니다.




 */
public class Sect11_Exception {
}
