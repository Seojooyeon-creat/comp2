package Chapter8;


import javax.swing.*;
import java.awt.*;

public class MyFrame2 extends JFrame {
    public MyFrame2(){
        setTitle("두번째 창");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setLayout(new FlowLayout());
        JButton btn = new JButton("확인");
        add(btn);
        JButton btn2 = new JButton("취소");
        add(btn2);

        setVisible(true);
    }
    public static void main(String[] args) {
        new MyFrame2();
    }
}
