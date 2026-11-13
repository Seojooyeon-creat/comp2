package Chapter8;

import javax.swing.*;
import java.awt.*;

public class MyFrame3 extends JFrame {
    public MyFrame3(){
        setTitle("세번째 창");
        setSize(300,200);
//        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JButton("확인"));
        add(new JButton("취소"));
        getContentPane().setBackground(Color.YELLOW);

        setVisible(true);

    }
    public static void main(String[] args) {
        new MyFrame3();
    }
}
