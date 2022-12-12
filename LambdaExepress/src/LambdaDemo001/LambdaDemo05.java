package LambdaDemo001;
/*lambda表达式的省略模式
* 参数类型可以省略，多个参数时不能只省略部分
* 只有一个参数时小括号可以省略
* 代码块的语句只有一句时大括号和分号可以省略,如果有return也要省略掉
* */

public class LambdaDemo05 {
    public static void main(String[] args) {

    }
}
interface Addable_{
    int add(int x,int y);
}
interface  Flyable_{
    void fly(String s);
}