package Chapter8;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame {
    public BorderLayoutTest(){
        setTitle("BorderLayout");
        setSize(300,150);
        setLayout(new BorderLayout(10,10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JButton("North"),BorderLayout.NORTH);
        add(new JButton("South"),BorderLayout.SOUTH);
        add(new JButton("Center"),BorderLayout.CENTER);
        add(new JButton("West"),BorderLayout.WEST);
        add(new JButton("East"),BorderLayout.EAST);
        setVisible(true);

    }

    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}
