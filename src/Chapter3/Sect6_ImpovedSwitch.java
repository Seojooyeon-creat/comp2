package Chapter3;
/*
Java 12부터는 “화살표”를 사용하는 향상된 switch 문을 사용할 수 있다. “case->S ”과 같은 형식을 사용한다.

 */
public class Sect6_ImpovedSwitch {
    public static void main(String[] args) {

        String dday = "MON";
        String weekday1 = "";
        String weekday2 = "";
        switch(dday){
            case "SAT":
            case "SUN": weekday1 = "주말"; break;
            default: weekday1 = "주중";
        }
        System.out.println(weekday1);

        //향상된 switch
        switch (dday){
            case "SAT", "SUN"  -> weekday2 = "주말";
            default -> weekday2 = "주중";
        }
        System.out.println(weekday2);
//        var today = "";
//        switch (day) {
//            case "SAT", "SUN" -> today = "주말";
//            case "MON", "TUS", "WED", "THU", "FRI" -> today = "주중";
//            default -> System.out.println("Error");
//        }
//        System.out.println(today);
    }

}
/*
[기존 switch 문 (:)]
 switch (value) {
    case 1: ... break;
    case 2: ... break;
    default: ... }
    - break를 직접 작성해야 함
    - break를 빼먹으면 다음 case까지 실행(Fall-through)
    - 실행문(Statement) 중심
    - Java 초기부터 제공

    [화살표 switch 문 (->)]
    switch (value) {
        case 1 -> ...;
        case 2 -> ...;
        default -> ...;
    }
   - break가 필요 없음
   - Fall-through 발생 안 함
   - 여러 case를 쉼표로 묶을 수 있음 case 1, 2, 3 -> ...
   - 값을 반환하는 switch 표현식 사용 가능
   - 더 간결하고 안전함

   [핵심]

   if → 조건(>, <, >=, <=) 판단
   switch → 값(value) 선택 기존
   switch(:) → break 관리 필요 화살표
   switch(->) → break 없이 안전하게 동작
 */
