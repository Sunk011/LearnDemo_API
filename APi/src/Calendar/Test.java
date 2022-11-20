package Calendar;

import java.util.Calendar;
import java.util.Scanner;

/*任意年份的二月的天数
 * 键盘录入任意年份
 * 设置日历对象的年、月、日
 *   年：键盘录入
 *   月：设置为3月，从0开始（设置为2
 *   日：设置为1日
 * 3.1前推一天，即为2月最后一天
 * 获取输出
 * */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
//  设置日历对象的年、月、日
        Calendar c = Calendar.getInstance();
        c.set(year, 2,1);
        c.add(Calendar.DATE, -1);
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年的2月份有"+date+"天");

    }
}
