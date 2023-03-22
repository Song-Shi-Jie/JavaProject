/*
 * @Author: 宋世杰
 * @Date: 2023-03-22 16:27:49
 * @LastEditTime: 2023-03-22 17:56:02
 * @LastEditors: 宋世杰
 * @FilePath: \EmpManage\src\student\StudentManager.java
 * @Description: 请自行修改描述
 */
package student;

import java.util.Arrays;

public class StudentManager {
    private Student[] e = new Student[0];
    private IOmethod io = new IOmethod();

    public void getEmpNum() {
        System.out.println("当前学生有" + e.length + "人。");
    }

    public void add() {
        e = Arrays.copyOf(e, e.length + 1);
        Student newe = new Student();
        e[e.length - 1] = newe;
        System.out.println("学生添加成功！！！");
    }

    public void pop() {
        if (e.length != 0) {
            e = Arrays.copyOf(e, e.length - 1);
            System.out.println("学生删除成功！！！");
        } else {
            System.out.println("没学生你删个鬼！！！");
        }

    }

    public Student[] getInfo() {
        return e;
    }

    public void display() {
        if (e.length != 0) {
            for (Student cur : e) {
                System.out.println(cur);
            }
        } else {
            System.out.println("非法输出,请添加学生在输出！！！");
        }
    }

    public void changeName(int i, String name) {
        System.out.println("学生原姓名为" + e[i].getName());
        e[i].setName(name);
        System.out.println("学生修改后姓名为" + e[i].getName());
    }

    public void changeAge(int i, int age) {
        System.out.println("学生原年龄为" + e[i].getName());
        e[i].setAge(age);
        ;
        System.out.println("学生修改后年龄为" + e[i].getName());
    }

    public void changeSex(int i, String sex) {
        System.out.println("学生原性别为" + e[i].getName());
        e[i].setSex(sex);
        ;
        System.out.println("学生修改后性别为" + e[i].getName());
    }

    public void changeAdd(int i, String add) {
        System.out.println("学生原籍贯为" + e[i].getName());
        e[i].setAdd(add);
        System.out.println("学生修改后籍贯为" + e[i].getName());
    }

    public String searchIndex(int i) {
        String lind = "";
        for (int j = 0; j < e.length; j++) {
            if (e[i].getId() == i) {
                lind += j;
                break;
            }
        }
        return lind;
    }

    public String searchName(String name) {
        String lind = "";
        for (int i = 0; i < e.length; i++) {
            if (e[i].getName() == name) {
                lind += i;
            }
        }
        return lind;
    }

    public String searchAge(int age) {
        String lind = "";
        for (int i = 0; i < e.length; i++) {
            if (e[i].getAge() == age) {
                lind += i;
            }
        }
        return lind;
    }

    public String searchSex(String sex) {
        String lind = "";
        for (int i = 0; i < e.length; i++) {
            if (e[i].getSex() == sex) {
                lind += i;
            }
        }
        return lind;
    }

    public String searchAdd(String add) {
        String lind = "";
        for (int i = 0; i < e.length; i++) {
            if (e[i].getAdd() == add) {
                lind += i;
            }
        }
        return lind;
    }

    public String search(int choose) {
        String final_index = "";
        if (choose == 1) {
            System.out.println("请输入要查找的编号：");
            int ind = io.inputInt();
            final_index = searchIndex(ind);
        } else if (choose == 2) {
            System.out.println("请输入要查找的姓名：");
            String ind = io.inputString();
            final_index = searchName(ind);
        } else if (choose == 3) {
            System.out.println("请输入要查找的年龄：");
            int ind = io.inputInt();
            final_index = searchAge(ind);
        } else if (choose == 4) {
            System.out.println("请输入要查找的性别：");
            String ind = io.inputString();
            final_index = searchSex(ind);
        } else if (choose == 5) {
            System.out.println("请输入要查找的籍贯：");
            String ind = io.inputString();
            final_index = searchAdd(ind);
        }
        return final_index;
    }
}
