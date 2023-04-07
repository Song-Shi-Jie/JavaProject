/*
 * @Author: 宋世杰
 * @Date: 2023-04-06 17:26:55
 * @LastEditTime: 2023-04-06 17:44:01
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\Sale.java
 * @Description: 请自行修改描述
 */
public class Sale {
    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            int count = 10;

            @Override
            public void run() {
                synchronized(this){
                    while (count > 0) {
                        count--;
                        System.out.println(Thread.currentThread().getName() + "卖了一张票，剩余：" + count);
                    }
                }

            }


        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        t1.start();
        t2.start();
        t3.start();
    }
}
