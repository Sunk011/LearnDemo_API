package ContainerDemo;

import javax.swing.*;
import java.awt.*;
//JScrollPane是带滚动条的面板，JScrollPane内只能添加一个组件，JScrollPane中时，先将需要的组件添加到JPanel中，再将JPane添加到JScrollPane中
public class JpanelDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("jframe");
        jf.setBounds(400, 300, 500, 200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton jb1 = new JButton("botton 1");
        JButton jb2 = new JButton("botton 2");
        JButton jb3 = new JButton("botton 3");

        JPanel jp = new JPanel(new FlowLayout());
        jp.setBackground(new Color(84, 191, 106));
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);

        jf.add(jp);
    }
}
