package Exercise;

//ArrayList<Integer>集合中添加一个字符串数据

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Exe01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        创建集合
        ArrayList<Integer> al=new ArrayList<>();

        Class<? extends ArrayList> c = al.getClass();
        Method add = c.getMethod("add", Object.class);

        add.invoke(al, "hello");

        al.add(10);
        al.add(30);
        al.add(150);
        al.add(50);
        al.add(340);
        al.add(123);
        al.add(130);
        System.out.println(al);
//        al.add(Integer.valueOf("hello"));


    }
}
