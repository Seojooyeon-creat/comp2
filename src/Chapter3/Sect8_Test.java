package Chapter3;
/*
for문을 이용하여 팩토리얼 값을 계산해 보라.
팩토리얼 수식은 다음과 같다.

𝑛!=1×2×3×…×𝑛

(출력)정수를 입력하시오: (입력)20
(출력)20!은 2432902008176640000입니다.
 */
public class Sect8_Test {
    public static void main(String[] args) {
        long fect = 1;
        for(int i = 1; i <= 20; i++){
            fect = fect*i;
        }
        System.out.println(fect);

    }
}
