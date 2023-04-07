/*
 * @Author: 宋世杰
 * @Date: 2023-03-28 17:56:41
 * @LastEditTime: 2023-04-06 00:42:52
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\com\woniu\dao\StuDaoImp.java
 * @Description: 请自行修改描述
 */
package com.woniu.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public boolean delById(List<Student> list) {
        boolean flag = false;
        try {
            System.out.println("请输入要删除的员工编号：");
            int id = ScannerTools.getInt();
            for (Student cur : list) {
                if (cur.getEID() == id) {
                    list.remove(cur);
                    flag = true;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return flag;
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

    @Override
    public Map<String, Integer> countSex(List<Student> stu) {
        int count1 = 0;
        int count2 = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (Student cur : stu) {
            if (cur.getSsex().equals("男")) {
                count1++;
            } else {
                count2++;
            }
        }
        map.put("男", count1);
        map.put("女", count2);
        return map;
    }

    @Override
    public List<Student> selectAllMan(List<Student> stu) {
        List<Student> tmp = new ArrayList<>();
        for (Student cur : stu) {
            if (cur.getSsex().equals("男")) {
                tmp.add(cur);
            }
        }
        return tmp;

    }

    @Override
    public void writeFile(List<Student> list) throws Exception {
        File f1 = new File("c:\\aaa\\1.txt");

        File f2 = new File(f1.getParent());
        f2.mkdirs();

        FileOutputStream fos = new FileOutputStream(f1);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.close();
        fos.close();
    }

    @Override
    public List<Student> readFile() throws Exception {
        List<Student> list2 = null;

        File f1 = new File("c:\\aaa\\1.txt");
        if (!f1.exists()) {
            List<Student> list = new ArrayList<Student>();
            writeFile(list);
        }
        FileInputStream fis = new FileInputStream(f1);
        ObjectInputStream ois = new ObjectInputStream(fis);
        list2 = (List<Student>) ois.readObject();
        ois.close();
        fis.close();

        return list2;
    }

}
