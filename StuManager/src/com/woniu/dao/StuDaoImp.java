/*
 * @Author: 宋世杰
 * @Date: 2023-03-28 17:56:41
 * @LastEditTime: 2023-03-28 20:30:16
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\com\woniu\dao\StuDaoImp.java
 * @Description: 请自行修改描述
 */
package com.woniu.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import com.woniu.entity.Student;
import com.woniu.tools.ScannerTools;

public class StuDaoImp implements StuDao {

    @Override
    public void add(ArrayList<Student> list) {
        System.out.println("请输入学生id：");
        int id = ScannerTools.getInt();
        System.out.println("请输入学生姓名：");
        String name = ScannerTools.getString();
        System.out.println("请输入学生年龄：");
        int age = ScannerTools.getInt();
        System.out.println("请输入学生性别：");
        String sex = ScannerTools.getString();
        System.out.println("请输入学生地址：");
        String add = ScannerTools.getString();
        Student tmp = new Student(id, name, age, sex, add);
        list.add(tmp);
    }

    @Override
    public void display(ArrayList<Student> list) {
        for (Student cur : list) {
            System.out.println(cur);
        }
    }

    @Override
    public void searchById(int id, ArrayList<Student> list) {
        for (Student cur : list) {
            if (cur.getEID() == id) {
                System.out.println(cur);
                break;
            }
        }
    }

    @Override
    public void searchByName(String name, ArrayList<Student> list) {
        for (Student cur : list) {
            if (cur.getSname().equals(name)) {
                System.out.println(cur);
            }
        }
    }

    @Override
    public void searchByAge(int age, ArrayList<Student> list) {
        for (Student cur : list) {
            if (cur.getSage() == age) {
                System.out.println(cur);
            }
        }
    }

    @Override
    public void searchBySex(String sex, ArrayList<Student> list) {
        for (Student cur : list) {
            if (cur.getSsex().equals(sex)) {
                System.out.println(cur);
            }
        }
    }

    @Override
    public void searchByAdd(String add, ArrayList<Student> list) {
        for (Student cur : list) {
            if (cur.getSadd().equals(add)) {
                System.out.println(cur);
            }
        }
    }

    @Override
    public void updateStu() {

    }

    @Override
    public void del(ArrayList<Student> list) {
    }

    @Override
    public void search(ArrayList<Student> list) {
        System.out.println("请输入要查询的依据（1、编号；2、姓名；3、年龄；4、性别；5、地址）：");
        int opt = ScannerTools.getInt();
        if (opt == 1) {
            System.out.print("请输入学生编号：");
            int id = ScannerTools.getInt();
            searchById(id, list);
        } else if (opt == 2) {
            System.out.print("请输入学生姓名：");
            String name = ScannerTools.getString();
            searchByName(name, list);
        } else if (opt == 3) {
            System.out.print("请输入学生年龄：");
            int age = ScannerTools.getInt();
            searchByAge(age, list);
        } else if (opt == 4) {
            System.out.print("请输入学生性别：");
            String sex = ScannerTools.getString();
            searchBySex(sex, list);
        } else if (opt == 5) {
            System.out.print("请输入学生地址：");
            String add = ScannerTools.getString();
            searchByAdd(add, list);
        }
    }

    LinkedList link = new LinkedList<>();
}
