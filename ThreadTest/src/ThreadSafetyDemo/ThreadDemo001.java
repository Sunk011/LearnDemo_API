package ThreadSafetyDemo;

import java.util.*;

public class ThreadDemo001 {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer();
        StringBuilder sbb=new StringBuilder();

        Vector<String> v= new Vector<>();
        ArrayList<String> al= new ArrayList<>();

        Hashtable<Integer, String> ht= new Hashtable<>();
        HashMap<Integer, String> hm= new HashMap<>();


        List<String> objects = Collections.synchronizedList(new ArrayList<String>());
    }
}
