package Chapter8;

import javax.swing.*;
import java.awt.FlowLayout;

public class FlowLayoutTest extends JFrame {
    public FlowLayoutTest() {
        setTitle("TEST");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);
        JPanel panel = new JPanel();
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 30, 15);
        panel.setLayout(fl);
        panel.add(new JButton("btn1"));
        panel.add(new JButton("btn2"));
        panel.add(new JButton("btn3"));
        panel.add(new JButton("btn4"));
        panel.add(new JButton("btn5"));
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutTest();
    }
}