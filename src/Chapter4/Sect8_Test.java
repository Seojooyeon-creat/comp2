package Chapter4;
/*
Television 클래스에 생성자를 만들어보자. 생성자는 객체가 생성될 때 channel, volume, onOff 필드를 초기화한다.
그리고 아래클래스에 main메소드 작성

 */
class Television {

    private int channel;    // 채널 번호
    private int volume;     // 볼륨
    private boolean onOff;  // 전원 상태

    public void setChannel(int channel){
        this.channel = channel;
    }

    public int getChannel(){return this.channel;}

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void setOnOff(boolean onOff){
        this.onOff = onOff;
    }

//아래에 생성자 추가(매개변수는 채널, 볼륨, 전원)

    void print() {
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }
}


public class Sect8_Test {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.setChannel(11);


    }
}
