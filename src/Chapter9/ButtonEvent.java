package Chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEvent extends JFrame {
    public ButtonEvent() {
        setTitle("Button Event");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton btn = new JButton("Click me");
        add(btn);
        btn.addActionListener(new MyListener());
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonEvent();
    }

}

class MyListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("안녕");
        JOptionPane.showMessageDialog(null, "Button was clicked");
    }
}
