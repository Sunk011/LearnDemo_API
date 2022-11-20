package Map.ArrayListHashMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        HashMap<String, ArrayList> hm= new HashMap<String, ArrayList>();

        ArrayList<String> a1=new ArrayList<String>();
        ArrayList<String> a2=new ArrayList<String>();
        ArrayList<String> a3=new ArrayList<String>();

        a1.add("诸葛亮");
        a1.add("赵子龙");

        a2.add("唐僧");
        a2.add("猪八戒");

        a3.add("武松");
        a3.add("鲁智深");

        hm.put("三国演义", a1);
        hm.put("西游记", a2);
        hm.put("水浒传", a3);

        Set<Map.Entry<String, ArrayList>> entries = hm.entrySet();
        for(Map.Entry k_v: entries){
            System.out.println(k_v.getKey()+", "+k_v.getValue());
        }
    }
}
