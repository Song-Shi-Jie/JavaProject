import java.util.List;

/*
 * @Author: 宋世杰
 * @Date: 2023-04-06 15:22:38
 * @LastEditTime: 2023-04-06 16:43:40
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\Runnable1.java
 * @Description: 请自行修改描述
 */
public class Runnable1 implements Runnable {

	private List<String> list;

	public Runnable1(List<String> list) {
		this.list = list;
	}

	public void run() {
		while (true) {
			// 将list锁住，同一时间，只能一个线程操作list对象
			synchronized (list) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

				if (list.size() == 0) {
					System.out.println("生产了一个汉堡包");
					list.add("汉堡包");
					// 现在线程1正在执行生产的过程，生产完毕后，应该唤醒对方线程
					// 线程线程2正在等待
					list.notify();
				} else {
					System.out.println("已经有汉堡包了");
					// 现在线程1已经有汉堡包，只能等待
					// 线程线程2正在出售汉堡包
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
