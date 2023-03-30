package com.woniu.dao;

import java.util.HashSet;
import java.util.TreeSet;

import com.woniu.tools.ScannerTools;
import com.woniu.entity.Student;

public class SetImp implements SetStuDao {
    @Override
    public void add(HashSet<Student> set) {
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
        set.add(tmp);
    }

    @Override
    public void display(HashSet<Student> set) {
        for (Student cur : set) {
            System.out.println(cur);
        }
    }

    @Override
    public void searchById(int id, HashSet<Student> set) {
        for (Student cur : set) {
            if (cur.getEID() == id) {
                System.out.println(cur);
                break;
            }
        }
    }

    @Override
    public void searchByName(String name, HashSet<Student> set) {
        for (Student cur : set) {
            if (cur.getSname().equals(name)) {
                System.out.println(cur);
            }
        }
    }

    @Override
    public void searchByAge(int age, HashSet<Student> set) {
        for (Student cur : set) {
            if (cur.getSage() == age) {
                System.out.println(cur);
            }
        }
    }
    String s;
    @Override
    public void searchBySex(String sex, HashSet<Student> set) {
        for (Student cur : set) {
            if (cur.getSsex().equals(sex)) {
                System.out.println(cur);
            }
        }
    }

    @Override
    public void searchByAdd(String add, HashSet<Student> set) {
        for (Student cur : set) {
            if (cur.getSadd().equals(add)) {
                System.out.println(cur);
            }
        }
    }

    @Override
    public void updateStu() {

    }

    @Override
    public void del(HashSet<Student> set) {
    }

    @Override
    public void search(HashSet<Student> set) {
        System.out.println("请输入要查询的依据（1、编号；2、姓名；3、年龄；4、性别；5、地址）：");
        int opt = ScannerTools.getInt();
        if (opt == 1) {
            System.out.print("请输入学生编号：");
            int id = ScannerTools.getInt();
            searchById(id, set);
        } else if (opt == 2) {
            System.out.print("请输入学生姓名：");
            String name = ScannerTools.getString();
            searchByName(name, set);
        } else if (opt == 3) {
            System.out.print("请输入学生年龄：");
            int age = ScannerTools.getInt();
            searchByAge(age, set);
        } else if (opt == 4) {
            System.out.print("请输入学生性别：");
            String sex = ScannerTools.getString();
            searchBySex(sex, set);
        } else if (opt == 5) {
            System.out.print("请输入学生地址：");
            String add = ScannerTools.getString();
            searchByAdd(add, set);
        }
    }

}
