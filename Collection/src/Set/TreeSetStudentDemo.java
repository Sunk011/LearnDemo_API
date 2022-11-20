package Set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStudentDemo {
    public static void main(String[] args) {
        TreeSet<StudentGrade> ts = new TreeSet<StudentGrade>(new Comparator<StudentGrade>() {
            @Override
            public int compare(StudentGrade o1, StudentGrade o2) {
                return o2.getScore()==o1.getScore()?(o2.getChinese()==o1.getChinese()?o2.getName().compareTo(o1.getName()):o2.getChinese()-o1.getChinese()):o2.getScore()-o1.getScore();
            }
        });

        StudentGrade s1 = new StudentGrade("张二", 90, 89);
        StudentGrade s2 = new StudentGrade("张三", 91, 91);
        StudentGrade s3 = new StudentGrade("张四", 94, 89);
        StudentGrade s4 = new StudentGrade("张无", 99, 59);
        StudentGrade s5 = new StudentGrade("张六", 90, 83);
        StudentGrade s6 = new StudentGrade("张器", 89, 90);
        StudentGrade s7 = new StudentGrade("张巴", 89, 90);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);

        for (StudentGrade sg : ts)
            System.out.println(sg.getName() + "," + sg.getChinese() + "," + sg.getMath()+","+sg.getScore());
    }
}
