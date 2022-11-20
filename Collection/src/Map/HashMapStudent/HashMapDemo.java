package Map.HashMapStudent;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Student> hm= new HashMap<String, Student>();

        Student s1= new Student("徐强", 21);
        Student s2= new Student("徐若", 24);
        Student s3= new Student("徐偌", 23);

        hm.put("00001", s1);
        hm.put("00002", s2);
        hm.put("00003", s3);

        Set<String> keySet = hm.keySet();
        for(String key: keySet){
            Student value = hm.get(key);
            System.out.println(key+" "+value.toString());
        }
        System.out.println("------------ ");

        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        for(Map.Entry k_v: entries)
            System.out.println(k_v.getKey()+", "+k_v.getValue().toString());
    }
}
