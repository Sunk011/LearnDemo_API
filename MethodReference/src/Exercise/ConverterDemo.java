package Exercise;
//引用类方法
/*
 * 1.定义一个接口Converter，里面定义一个抽象方法 int convert(String s)
 * 2.定义一个测试类ConberterDemo, 在测试类中有两个方法
 *   useConverter(Converter c)
 *   主方法， 调用useConverter*/
public class ConverterDemo {
    public static void main(String[] args) {
        useConverter((String s) -> {
            return Integer.parseInt(s);
        });
        //lambda表达式被类方法替代的时候，它的形式参数全部传递给静态方法作为参数
        useConverter(Integer::parseInt);

        Converter c = Integer::parseInt;
        System.out.println(c.convert("3435"));

    }

    public static void useConverter(Converter c) {
        int num = c.convert("1234");
        System.out.println(num);
    }
}

interface Converter {
    int convert(String s);
}
