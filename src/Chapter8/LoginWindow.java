package Chapter8;

import javax.swing.*;

public class LoginWindow extends JFrame {
    public LoginWindow(){
        setTitle("로그인 윈도우");
        setSize(300,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        add(panel);
        panel.add(new JLabel("id"));
        panel.add(new JTextField(20));
        panel.add(new JLabel("pass"));
        panel.add(new JTextField(20));



        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginWindow();
    }
}
