
/*
 * @Author: 宋世杰
 * @Date: 2023-04-03 14:16:14
 * @LastEditTime: 2023-04-03 21:11:38
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\test.java
 * @Description: 请自行修改描述
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class test {
    public static void main(String[] args) {
        // test t1 = new test();
        // File f1 = new File("c:/aaa");
        // t1.t6(f1);

        try {
            // File f1 = new File("c:/aaa/1.txt");
            // FileOutputStream fos = new FileOutputStream(f1);
            // fos.write(20320);// 一次只能写一个字节
            // byte[] b = { 97, 98, 99, 48 };
            // fos.write(b); // 一次写入4个字节，内容在数组中
            // byte[] b = { 97, 98, 99, 48 };
            // // fos.write(b, 1, 2); //一次写入2个字节，内容在数组中,从下标为1开始获得内容
            // fos.write(b, 0, b.length);

            test test3 = new test();
            File f1 = new File("c:/aaa/1.txt");
            File f2 = new File("c:/bbb/1.txt");
            test3.copy(f1, f2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void t6(File f) {
        // System.out.println("aaa" + f);
        if (f.isDirectory()) { // 判断f为目录
            File[] ff = f.listFiles(); // 获得G:/aaa中所有文件:bbb 1.txt 2.txt
            for (File file : ff) { // file = ff[i] bbb 1.txt 2.txt
                t6(file);
            }
        } else { // 说明f是文件
            System.out.println(f);
        }
    }

    public void copy(File f1, File f2) {
        try {
            // File f2 = new File("G:/bbb/1.png"); G:/bbb必须要存在，要么手动创建，要么程序创建
            if (!f2.exists()) {
                String str1 = f2.getParent(); // G:\bbb
                File ff = new File(str1); // File ff = new File(G:\bbb);
                ff.mkdirs();
            }

            FileInputStream fis = new FileInputStream(f1);
            FileOutputStream fos = new FileOutputStream(f2);

            int a = -1;
            while ((a = fis.read()) != -1) {
                fos.write(a);
            }

            // int a = -1;
            // byte[] b = new byte[1024];
            // while((a = fis.read(b)) != -1) {
            // fos.write(b);
            // }

            // int a = -1;
            // byte[] b = new byte[1024];
            // while((a = fis.read(b,0,b.length)) != -1) {
            // fos.write(b);
            // }

            fos.close();
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
