package LambdaDemo001;

/*带参带返回值
 * 定义一个接口(Addable)，里面定义一个抽象方法：int add(int x, int y);
 * 定义一个测试类(AddableDemo)，在测试类中提供两个方法
 *   useAddable(Addable s)
 *   主方法，调用useAddable方法*/
public class LambdaDemo04 {
    public static void main(String[] args) {
        //匿名内部类
       /* useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        });*/

        //lambda
        //需要配合public static void useAddable(Addable a)使用
        useAddable((int x, int y) -> {
            return x + y;
        });

        //直接定义
        Addable a = (int x, int y) -> {
            return x + y;
        };
        Addable b = (int x, int y) -> {
            return x - y;
        };

        System.out.println(a.add(10, 30));
        System.out.println(b.add(10, 30));
    }

    public static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);

    }
}

interface Addable {
    int add(int x, int y);
}
