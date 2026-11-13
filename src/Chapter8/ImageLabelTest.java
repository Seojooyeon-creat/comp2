package Chapter8;

import javax.swing.*;

public class ImageLabelTest extends JFrame{
    public ImageLabelTest(){
        setTitle("레이블");
        setSize(400,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pannel = new JPanel();
        add(pannel);
        ImageIcon img = new ImageIcon("./src/Chapter8/dog.png");

        JLabel label = new JLabel("안녕하세요");
        label.setIcon(img);

        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageLabelTest();
    }
}