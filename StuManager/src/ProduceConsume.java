import java.util.ArrayList;
import java.util.List;

/*
 * @Author: 宋世杰
 * @Date: 2023-04-06 17:50:49
 * @LastEditTime: 2023-04-06 20:02:45
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\ProduceConsume.java
 * @Description: 请自行修改描述
 */
public class ProduceConsume {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                while (true) {
                    synchronized (list) {
                        if (list.size() == 0) {
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("生产了一个汉堡包");
                            list.add("汉堡包");
                            list.notify();
                        } else {
                            System.out.println("已经有了一个汉堡包");
                            try {
                                list.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }

        };

        Runnable r2 = new Runnable() {

            @Override
            public void run() {
                while (true) {
                    synchronized (list) {
                        if (list.size() == 1) {
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("出售了一个汉堡包");
                            list.remove(0);
                            list.notify();
                        } else {
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
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
