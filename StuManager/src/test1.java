
/*
 * @Author: 宋世杰
 * @Date: 2023-04-06 16:34:10
 * @LastEditTime: 2023-04-06 16:34:37
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\test1.java
 * @Description: 请自行修改描述
 */
import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        // 创建一个集合对象，
        // 创建一个线程A，该线程针对集合对象添加数据：生产一个汉堡包 :一次只能生产一个，卖完之后才能再次生产 add(Object ojb)
        // 创建一个线程B，该线程针对集合对象删除数据：卖一个汉堡包 remove(0)

        List<String> list = new ArrayList<String>();

        Runnable1 r1 = new Runnable1(list);
        Runnable2 r2 = new Runnable2(list);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

    }
}
