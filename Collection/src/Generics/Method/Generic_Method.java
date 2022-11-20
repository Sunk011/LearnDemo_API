package Generics.Method;

/*
public class Generic_Method {
    public void show(String s) {
        System.out.println(s);
    }

    public void show(Integer s) {
        System.out.println(s);
    }

    public void show(Boolean s) {
        System.out.println(s);
    }
}
*/
/*public class Generic_Method<T>{
 *//*  public  void show(T t){
        System.out.println(t);
    }*//*

    }*/
public class Generic_Method {
    public <T> void show(T t) {
        System.out.println(t);
    }
}