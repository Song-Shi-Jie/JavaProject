/*
 * @Author: 宋世杰
 * @Date: 2023-03-22 17:44:08
 * @LastEditTime: 2023-03-27 08:49:30
 * @LastEditors: 宋世杰
 * @FilePath: \EmpManage\src\student\IOmethod.java
 * @Description: 请自行修改描述
 */
package student;

import java.util.Scanner;

public class IOmethod {
    public static int inputInt() {
        Scanner i = new Scanner(System.in);
        return i.nextInt();
    }

    public static String inputString() {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static void clear() {

        Scanner c = new Scanner(System.in);
        while (true) {
            System.out.println("请输入字母c来清空并结束当前选择！");
            String tmp = c.nextLine();
            if (tmp.equals("c")) {
                System.out.println("\033[H\033[2J");
                System.out.flush();
                break;
            }
        }
    }

}
