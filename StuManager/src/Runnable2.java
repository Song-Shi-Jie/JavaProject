
/*
 * @Author: 宋世杰
 * @Date: 2023-04-06 16:33:03
 * @LastEditTime: 2023-04-06 16:40:29
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\Runnable2.java
 * @Description: 请自行修改描述
 */
import java.util.List;

public class Runnable2 implements Runnable {
    private List<String> list;

    public Runnable2(List<String> list) {
        this.list = list;
    }

    public void run() {
        while (true) {
            synchronized (list) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }

                if (list.size() == 1) {
                    System.out.println("卖出去了一个汉堡包");
                    list.remove(0);
                    // 现在线程1正在等待
                    // 线程线程2正在出售汉堡包，唤醒线程1
                    list.notify();
                } else {
                    // 现在线程1正在生产，唤醒线程2
                    // 线程线程2正在等待
                    System.out.println("没有汉堡包了");
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
