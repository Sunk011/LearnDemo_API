package biaoqian;

import javax.swing.*;
import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        //显示文本回提示信息
        JFrame jf = new JFrame("Frame");
        jf.setBounds(400, 300, 400, 300);
        jf.setLayout(new FlowLayout(FlowLayout.CENTER));


      /*
        JLabel jl = new JLabel("账号", SwingConstants.LEFT);
        jl.setVisible(true);
        jf.add(jl);
        */
      /*
        JButton jb = new JButton("按钮");
        jb.setVisible(true);//是否可见
        jb.setEnabled(true);//是否可点击
        jb.setBorderPainted(false);//是否显示边界
        jf.add(jb);
        */
/*
//        单选
        JRadioButton jrb1 = new JRadioButton("男");
        JRadioButton jrb2 = new JRadioButton("女");

        jf.add(jrb1);
        jf.add(jrb2);*/
/*
//        多选
        JCheckBox jcb1 = new JCheckBox("sing", true);
        JCheckBox jcb2 = new JCheckBox("dance", false);
        JCheckBox jcb3 = new JCheckBox("rap");
        JCheckBox jcb4 = new JCheckBox("basketball");

        jf.add(jcb1);
        jf.add(jcb2);
        jf.add(jcb3);
        jf.add(jcb4);*/

/*
//        下拉列表
        JComboBox jcb=new JComboBox();
        jcb.addItem("选择学历");
        jcb.addItem("高中");
        jcb.addItem("大学");
        jcb.addItem("硕士");
        jf.add(jcb);
        */
/*

//        菜单栏JMenuBar   菜单JMenu     菜单项JMenuItem

        JMenuBar jmb = new JMenuBar();
        JMenu jm1 = new JMenu("11111");
        JMenu jm2 = new JMenu("22222");
        JMenu jm3 = new JMenu("33333");
        JMenu jm4 = new JMenu("44444");
        JMenu jm5 = new JMenu("55555");
        JMenu jm6 = new JMenu("66666");
        JMenuItem jmt1 = new JMenuItem("1");
        JMenuItem jmt2 = new JMenuItem("2");
        JMenuItem jmt3 = new JMenuItem("3");
        JMenuItem jmt4 = new JMenuItem("4");
        JMenuItem jmt11 = new JMenuItem("1");
        JMenuItem jmt22 = new JMenuItem("2");
        JMenuItem jmt33 = new JMenuItem("3");
        JMenuItem jmt44 = new JMenuItem("4");

        jm1.add(jmt1);
        jm1.add(jmt2);
        jm1.add(jmt3);
        jm1.add(jmt4);

        jm2.add(jmt11);
        jm2.add(jmt22);
        jm2.add(jmt33);
        jm2.add(jmt44);

        jmb.add(jm1);
        jmb.add(jm2);
        jmb.add(jm3);
        jmb.add(jm4);
        jmb.add(jm5);
        jmb.add(jm6);

        jf.add(jmb);
*/


      /*  JLabel jl = new JLabel("账号:");
//        文本组件
        JTextField jft = new JTextField("Input:", 22);
        jf.add(jl);
        jf.add(jft);

//        密码框
        JLabel jl1 = new JLabel("密码:");
        JPasswordField jpf = new JPasswordField("", 20);
        jpf.setEchoChar('*');
        jf.add(jl1);
        jf.add(jpf);
*/


/*
//        文本域组件
        JTextArea jta = new JTextArea(20, 10);
        jta.setLineWrap(true);//自动换行
        jf.add(jta);
//        获取输入的内容
        System.out.println(jta.getText());
        */

//        常用布局
        /*流布局：默认居中
        new FlowLayout()
        new FlowLayout(int aligment)默认对齐方式
        new FlowLayout(int aligment, int horizGap, int vertGap)对齐方式+ 上下偏移222222222
        FlowLayout.LEFT = 0;
        FlowLayout.CENTER = 1;
        FlowLayout.RIGHT = 2;



        边界布局：
        将容器默认分为：
        东BorderLayout.WEST
        西BorderLayout.EAST
        南BorderLayout.SOUTH
        北BorderLayout.NORTH
        中BorderLayout.CNETER
        jf.add(button, BorderLayout.WEST);



        网格布局：
        GridLayout(int rows, int colums)行 列
        GridLayout(int rows, int colums, int horizGap, int vertGap)
        行 列 水平间隔 垂直间隔
        * */

//监听事件

        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
