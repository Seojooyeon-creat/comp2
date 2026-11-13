package Chapter4;
/*
필드가 private일때 외부클래스에서 접근하려면
getter와 setter를 만들어준다

아래의 맴버필드에서 regNumber를 제외하고 Sect10...클래스에서 Account에 접근하기 위한 getter와 setter 작성
 */

class Account {
    private int regNumber;
    private String name;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    private int balance;




}
public class Sect10_getter_setter {

}
