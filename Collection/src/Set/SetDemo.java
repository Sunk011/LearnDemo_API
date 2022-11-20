package Set;

//HashSet对集合的迭代顺序不做保证
public class SetDemo {
    /* public static void main(String[] args) {
         Set<String> set= new HashSet<>();

         set.add("hello");
         set.add("world");
         set.add("java");
         //不含重复元素
         set.add("java");

         for(String s :set)
             System.out.println(s);
     }*/
   /*   public static void main(String[] args) {
       //创建对象
       Student s1= new Student("张三", 23);

       //同一个对象多次调用hashCode的返回值不变
       System.out.println(s1.hashCode());//1060830840
       System.out.println(s1.hashCode());
       System.out.println("-------------------------");

       Student s2= new Student("张三", 23);

       //默认情况下，不同对象的哈希值不同
       System.out.println(s2.hashCode());
       System.out.println(s2.toString());
       System.out.println("汉字".hashCode());
       System.out.println("语言".hashCode());
       System.out.println("-------------------------");

       System.out.println("通话".hashCode());
       System.out.println("重地".hashCode());
   }*/
   /*  public static void main(String[] args) {
       HashSet <String> hs= new HashSet<>();

       hs.add("hello");
       hs.add("world");
       hs.add("java");
       hs.add("world");
       //遍历
       for(String str: hs)
           System.out.println(str);
   }*/
   /*public static void main(String[] args) {
       LinkedHashSet<String> lhs= new LinkedHashSet<>();

       lhs.add("hello");
       lhs.add("world");
       lhs.add("java");
       lhs.add("python");
       lhs.add("PHP");

       lhs.add("java");


       for(String s: lhs)
           System.out.println(s);
   }*/
   /* public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(3);
        ts.add(1);
        ts.add(2);
        ts.add(5);
        ts.add(4);

        for (Integer i : ts)
            System.out.println(i);
        System.out.println("-------------------");

        TreeSet<String> ts1= new TreeSet<>();

        ts1.add("asd");
        ts1.add("sad");
        ts1.add("acd");
        ts1.add("bdg");

        for(String s:ts1)
            System.out.println(s);
    }*/
   /* public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();

        Student s1 = new Student("xishi", 23);
        Student s2 = new Student("diaochan", 22);
        Student s3 = new Student("wangzhaojun", 21);
        Student s4 = new Student("yangyuhuan", 24);
        Student s5 = new Student("linqingxia", 24);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for(Student s:ts)
            System.out.println(s.getName()+","+s.getAge());
    }*/

    public static void main(String[] args) {
    }
}
