package ContainerDemo;

import javax.swing.*;

public class JdialogDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("jframe");
        jf.setBounds(400, 300, 400, 250);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JDialog jd = new JDialog(jf, "dialog");
        jd.setBounds(450, 350, 200, 200);
        jd.setVisible(true);
        jd.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }
}
