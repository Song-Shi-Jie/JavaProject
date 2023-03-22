/*
 * @Author: 宋世杰
 * @Date: 2023-03-22 17:44:08
 * @LastEditTime: 2023-03-22 17:46:31
 * @LastEditors: 宋世杰
 * @FilePath: \EmpManage\src\student\IOmethod.java
 * @Description: 请自行修改描述
 */
package student;

import java.util.Scanner;

public class IOmethod {
    public int inputInt() {
        Scanner i = new Scanner(System.in);
        int tmp = i.nextInt();
        return tmp;
    }

    public String inputString() {
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine();
        return tmp;
    }

}
