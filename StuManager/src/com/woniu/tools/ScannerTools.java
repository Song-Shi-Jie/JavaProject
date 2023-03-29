/*
 * @Author: 宋世杰
 * @Date: 2023-03-28 18:03:27
 * @LastEditTime: 2023-03-28 18:53:58
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\com\woniu\tools\ScannerTools.java
 * @Description: 负责输入整数和字符串
 */
package com.woniu.tools;

import java.util.Scanner;

public class ScannerTools {
    public static int getInt() {
        Scanner i = new Scanner(System.in);
        return i.nextInt();
    }

    public static String getString() {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
}
