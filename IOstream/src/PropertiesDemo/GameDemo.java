package PropertiesDemo;
/*
游戏类，猜数字小游戏
测试类，测试类中有main方法，
    从文件中读取数据到Properties集合，用load方法实现
        game.txt
        文件中有一个数据值：count= 0；
    通过Properties几个获取玩游戏的次数
    判断游戏次数
        >3, 提示结束
        <=3,继续游戏，count++，重新写回文件，用store方法实现

*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class GameDemo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        FileReader fr = new FileReader("IOstream\\game.txt");
        prop.load(fr);
        fr.close();

        String count = prop.getProperty("count");
        int num = Integer.parseInt(count);
        if (num >= 3) {
            System.out.println("Game Over! \nPlease Restart Again!");
        } else {
            GuessNumberDemo.start();
            num++;
            prop.setProperty("count", String.valueOf(num));
            FileWriter fw = new FileWriter("IOstream\\game.txt");
            prop.store(fw, null);
            fw.close();
        }


    }
}
