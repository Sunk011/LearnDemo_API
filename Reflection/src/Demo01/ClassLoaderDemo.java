package Demo01;
/*  1. static  ClassLoader getSystemClassLoader():返回用于委派的系统类加载器
    2. ClassLoader getParent():返回父类加载器进行委派*/
public class ClassLoaderDemo {
    public static void main(String[] args) {
        ClassLoader c=ClassLoader.getSystemClassLoader();
        System.out.println(c);//AppClassLoader@2437c6

        ClassLoader c2 = c.getParent();
        System.out.println(c2);//PlatformClassLoader

        ClassLoader c3 = c2.getParent();
        System.out.println(c3);//null
    }
}
