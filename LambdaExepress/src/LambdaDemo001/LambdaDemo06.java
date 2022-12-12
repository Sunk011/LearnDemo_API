package LambdaDemo001;

public class LambdaDemo06 {
    public static void main(String[] args) {
        /*Inter i = () -> {
            System.out.println("study");
        };*/
        Inter i = () -> System.out.println("study");
        i.show();

//        必须有上下文才能推导出lambda对应的接口
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("内部匿名类");
            }
        }).start();


        Runnable r = () -> System.out.println("lambda表达式");
        new Thread(r).start();
        new Thread(() -> System.out.println("Runnable")).start();
    }
}

interface Inter {
    void show();
}