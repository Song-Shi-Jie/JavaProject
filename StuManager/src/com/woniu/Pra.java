/*
 * @Author: 宋世杰
 * @Date: 2023-03-30 19:05:22
 * @LastEditTime: 2023-03-30 19:18:51
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\com\woniu\Pra.java
 * @Description: 请自行修改描述
 */
package com.woniu;

import java.util.ArrayList;
import java.util.Iterator;

import com.woniu.entity.Student;

public class Pra {
    public static void main(String[] args) {
        ArrayList<Student> list1 = new ArrayList<>();
        Student u1 = new Student(1,"张三",23,"男","陕西");
        Student u2 = new Student(2,"李四",33,"男","山西");
        Student u3 = new Student(3,"小美",24,"女","北京");
        list1.add(u1);
        list1.add(u2);
        list1.add(u3);
        Iterator<Student> it = list1.iterator();
        while(it.hasNext()){
            Student tmp = it.next();
            System.out.println(tmp);
        }
    }
}
