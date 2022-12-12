package Demo_2;

import java.util.*;
import java.util.stream.Stream;

/*1. Collections体系的集合可以使用默认方法stream()生成流
   - default Stream stream()
2. Map体系的集合间接的生成流
   -
3. 数组可以通过Stream接口的静态方法of(T…values)生成流*/
public class StreamDemo {
    public static void main(String[] args) {
        //Collections体系的集合可以使用默认方法stream()生成流
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();

        Map<String, Integer> map = new HashMap<>();
//        键对应的流
        Stream<String> keyStream = map.keySet().stream();
//        值对应的流
        Stream<Integer> valueStream = map.values().stream();
//        键值对对应的流
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

//        数组可以通过Stream接口的静态方法of(T…values)生成流
        String[] strArray={"hello","world","java"};
        Stream<String> sttArrayStream1 = Stream.of(strArray);
        Stream<String> strArrayStream2 = Stream.of("hello", "world", "java");
        Stream<Integer> intStream = Stream.of(10, 30, 239, 234);



    }
}
