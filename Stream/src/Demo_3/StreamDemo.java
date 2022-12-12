package Demo_3;

import java.util.ArrayList;
import java.util.stream.Stream;

/*两个ArrayLsit分别存储6名男演员和6名女演员名称
 *   男演员只要名字为 3个字的前三人
 *   女演员只用姓林的，并且不要第一个
 *   把过滤后的男、女演员姓名合并到一起
 *   把上演一部操作后的元素作为构造方法的参数创建元素对象，遍历元素
 *       演员类Actor，里面*有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法
 */
public class StreamDemo {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> manList = new ArrayList<>();

        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰");

        ArrayList<String> womanList = new ArrayList<>();

        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("柳岩");
        womanList.add("林志玲");
        womanList.add("王祖贤");
//        男演员只要名字为 3 个字的前三人
        Stream<String> manStream = manList.stream().filter(s -> s.length() == 3);
//        女演员只用姓林的，并且不要第一个
        Stream<String> womanStream = womanList.stream().filter(s -> s.startsWith("林")).skip(1);
//        把过滤后的男、女演员姓名合并到一起
        Stream<String> linkedStream = Stream.concat(manStream, womanStream);
//        把上演一部操作后的元素作为构造方法的参数创建元素对象，遍历元素
//        linkedStream.map(Actor::new).forEach(s -> System.out.println(s.toString()));
        Stream.concat(manList.stream().filter(s -> s.length() == 3).limit(3), womanList.stream().filter(s -> s.startsWith("林")).skip(1)).map(Actor::new).forEach(s -> System.out.println(s.toString()));
    }
}

class Actor {
    private String name;

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Actor{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}