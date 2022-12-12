package biaoqian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ExerciseDemo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("暴打王运涛");

        jf.setBounds(400, 300, 400, 300);
        jf.setVisible(true);
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea jta= new JTextArea(10, 20);
        JButton jb= new JButton("暴打Taoer！");
        jta.setLineWrap(true);

        jb.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.append("求饶！！");
            }
        });

        jf.add(jta);
        jf.add(jb);
        jf.setVisible(true);



    }
}
