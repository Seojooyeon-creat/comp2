package Chapter3;
/*
for-each 문은 배열이나 컬렉션의 모든 요소를 차례대로 가져다주는 도구이다.
예를 들어, 여러분이 “이 배열 안에 있는 모든 사과를 하나씩 확인해 주세요!”라고 하면,
for-each 문은 알아서 순서대로 사과를 꺼내 준다.
int[] list = { 1, 2, 3, 4, 5 };

for (int e : list) {
    System.out.println(e);
}
예제
int[] numbers = { 10, 20, 30 };가 있다  이를 for each 문으로 모두 출력하는 코드 작성
실행시 아래 출력
(출력)10 20 30


 */
public class Sect15_for_each {
    public static void main(String[] args) {
        int [] list = {1, 2, 3, 4, 5};
        for(int i = 0; i < list.length; i++ ){
            System.out.println(list[i]);
        }
        for(int a : list){
            System.out.println(a);
        }
        String [] food = {"탕수육", "돼지갈비", "닭갈비"};
        for(String kfood : food){
            System.out.println(kfood);
        }
    }

}
