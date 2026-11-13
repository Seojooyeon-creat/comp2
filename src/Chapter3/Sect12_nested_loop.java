package Chapter3;
/*
반복문은 중첩되어 사용될 수 있다. 즉 반복문 안에 다른 반복문이
실행될 수 있다. 이러한 형태를 중첩 반복문(nested loop)이라고 한다.

for (int i=0; i<5; i++) {

    for (int k=0; k<5; k++) {

        반복문;

    }

}

중첩 반복문은 실제 프로그래밍에서 많이 나오는 형태로 특히 사각형과 비슷한 데이터를 처리하는데 유용하다.
다음 예제는 *기호를 사각형 모양으로 출력한다.
**********
**********
**********
**********
**********
 */
public class Sect12_nested_loop {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++ ){
            for(int j = 1; j <= 10; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
