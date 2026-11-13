package Chapter8;

import javax.swing.*;
import java.awt.*;

public class MyFrame4 extends JFrame {
    public MyFrame4(){
        setTitle("네번째");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        add(panel);
        JButton btn = new JButton("확인");
        btn.setBackground(Color.YELLOW);
        panel.add(btn);
        JButton btn2 = new JButton("취소");
        btn2.setBackground(Color.GREEN);
        panel.add(btn2);
        add(panel);

        panel.setBackground(Color.ORANGE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame4();
    }
}
