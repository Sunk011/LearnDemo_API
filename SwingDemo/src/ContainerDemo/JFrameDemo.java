package ContainerDemo;

import javax.swing.*;

public class JFrameDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        /*jf.setSize(400, 250);
        jf.setLocation(400, 300);*/
        jf.setBounds(400, 300, 400, 250);
        jf.setTitle("1111");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}

