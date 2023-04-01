/*
 * @Author: 宋世杰
 * @Date: 2023-03-30 19:05:22
 * @LastEditTime: 2023-03-30 20:24:05
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\com\woniu\Pra.java
 * @Description: 请自行修改描述
 */
package com.woniu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.woniu.entity.Student;

public class Pra {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student u1 = new Student(1, "张三", 23, "男", "陕西");
        Student u2 = new Student(2, "李四", 33, "男", "山西");
        Student u3 = new Student(3, "小美", 24, "女", "北京");
        list.add(u2);
        list.add(u3);
        list.add(u1);
        // Iterator<Student> it = list1.iterator();
        // while(it.hasNext()){
        // Student tmp = it.next();
        // System.out.println(tmp);
        // }
        // HashMap<Integer, Student> map = new HashMap<>();
        // map.put(1, u1);
        // map.put(2, u2);
        // map.put(3, u3);
        // Set set = map.keySet();
        // Iterator it = set.iterator();
        // while (it.hasNext()) {
        // Object obj = it.next();
        // System.out.println(obj);
        // }
        // Collection<Student> col = map.values();
        // it = col.iterator();
        // while (it.hasNext()) {
        // Object obj = it.next();
        // System.out.println(obj);
        // }

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(u1);
        ts.add(u2);
        ts.add(u3);
        Iterator<Student> it = ts.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
        for (Student cur : list) {
            System.out.println(cur);
        }
        Collections.sort(list);
        for (Student cur : list) {
            System.out.println(cur);
        }
    }
}
