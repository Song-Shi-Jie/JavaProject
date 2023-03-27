/*
 * @Author: 宋世杰
 * @Date: 2023-03-22 16:27:49
 * @LastEditTime: 2023-03-27 10:05:28
 * @LastEditors: 宋世杰
 * @FilePath: \EmpManage\src\student\StudentManager.java
 * @Description: 请自行修改描述
 */
package student;

import java.util.Arrays;

public class StudentManager {
    private Student[] e = new Student[0];
    // private Student[] e = { "1 张三 19 男 陕西", "2 李四 32 女 四川", "3 张国立 24 男 陕西", "4
    // 张默 56 男 四川", "5 王五 15 男 四川",
    // "6 陈六 29 男 四川" };

    public void getEmpNum() {
        System.out.println("当前学生有" + e.length + "人。");
    }

    public void add(Student[] e) {
        e = Arrays.copyOf(e, e.length + 1);
        Student newe = new Student();
        e[e.length - 1] = newe;
        System.out.println("学生添加成功！！！");
    }

    public void pop(Student[] e) {
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

    public void display(Student[] e) {
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
        System.out.println("学生原年龄为" + e[i].getAge());
        e[i].setAge(age);
        ;
        System.out.println("学生修改后年龄为" + e[i].getAge());
    }

    public void changeSex(int i, String sex) {
        System.out.println("学生原性别为" + e[i].getSex());
        e[i].setSex(sex);
        ;
        System.out.println("学生修改后性别为" + e[i].getSex());
    }

    public void changeAdd(int i, String add) {
        System.out.println("学生原籍贯为" + e[i].getAdd());
        e[i].setAdd(add);
        System.out.println("学生修改后籍贯为" + e[i].getAdd());
    }

    public String searchIndex(int i) {
        String lind = "";
        for (int j = 0; j < e.length; j++) {
            if (e[j].getId() == i) {
                lind += j;
                break;
            }
        }
        return lind;
    }

    public String searchName(String name) {
        String lind = "";
        for (int i = 0; i < e.length; i++) {
            if (e[i].getName().equals(name)) {
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
            if (e[i].getSex().equals(sex)) {
                lind += i;
            }
        }
        return lind;
    }

    public String searchAdd(String add) {
        String lind = "";
        for (int i = 0; i < e.length; i++) {
            if (e[i].getAdd().equals(add)) {
                lind += i;
            }
        }
        return lind;
    }

    public String search(int choose,Student[] e) {
        String final_index = "";
        if (choose == 1) {
            System.out.println("请输入要查找的编号：");
            int ind = IOmethod.inputInt();
            final_index = searchIndex(ind);
        } else if (choose == 2) {
            System.out.println("请输入要查找的姓名：");
            String ind = IOmethod.inputString();
            final_index = searchName(ind);
        } else if (choose == 3) {
            System.out.println("请输入要查找的年龄：");
            int ind = IOmethod.inputInt();
            final_index = searchAge(ind);
        } else if (choose == 4) {
            System.out.println("请输入要查找的性别：");
            String ind = IOmethod.inputString();
            final_index = searchSex(ind);
        } else if (choose == 5) {
            System.out.println("请输入要查找的籍贯：");
            String ind = IOmethod.inputString();
            final_index = searchAdd(ind);
        }
        return final_index;
    }

    public void change(Student[] e) {
        System.out.println("请输入你要更改的信息：");
        System.out.println("1、姓名；2、年龄；3、性别；4、籍贯；");
        int choose = IOmethod.inputInt();
        if (choose == 1) {
            System.out.println("请选择你要查找的依据：");
            System.out.println("1、编号；2、姓名；3、年龄；4、性别；5、籍贯");
            int tmp = IOmethod.inputInt();
            String index = "";
            switch (tmp) {
                case 1:
                    index = search(tmp,e);
                    break;
                case 2:
                    index = search(tmp,e);
                    break;
                case 3:
                    index = search(tmp,e);
                    break;
                case 4:
                    index = search(tmp,e);
                    break;
                case 5:
                    index = search(tmp,e);
                    break;
            }
            System.out.println("请输入要修改的姓名：");
            String tname = IOmethod.inputString();
            for (int i = 0; i < index.length(); i++) {
                char ind = index.charAt(i);
                int p = Character.getNumericValue(ind);
                changeName(p, tname);
            }
        } else if (choose == 2) {
            System.out.println("请选择你要查找的依据：");
            System.out.println("1、编号；2、姓名；3、年龄；4、性别；5、籍贯");
            int tmp = IOmethod.inputInt();
            String index = "";
            switch (tmp) {
                case 1:
                    index = search(tmp,e);
                    break;
                case 2:
                    index = search(tmp,e);
                    break;
                case 3:
                    index = search(tmp,e);
                    break;
                case 4:
                    index = search(tmp,e);
                    break;
                case 5:
                    index = search(tmp,e);
                    break;
            }
            System.out.println("请输入要修改的年龄：");
            int tage = IOmethod.inputInt();
            for (int i = 0; i < index.length(); i++) {
                char ind = index.charAt(i);
                int p = Character.getNumericValue(ind);
                changeAge(p, tage);
            }
        } else if (choose == 3) {
            System.out.println("请选择你要查找的依据：");
            System.out.println("1、编号；2、姓名；3、年龄；4、性别；5、籍贯");
            int tmp = IOmethod.inputInt();
            String index = "";
            switch (tmp) {
                case 1:
                    index = search(tmp,e);
                    break;
                case 2:
                    index = search(tmp,e);
                    break;
                case 3:
                    index = search(tmp,e);
                    break;
                case 4:
                    index = search(tmp,e);
                    break;
                case 5:
                    index = search(tmp,e);
                    break;
            }
            System.out.println("请输入要修改的性别：");
            String tsex = IOmethod.inputString();
            for (int i = 0; i < index.length(); i++) {
                char ind = index.charAt(i);
                int p = Character.getNumericValue(ind);
                changeSex(p, tsex);
            }
        } else if (choose == 4) {
            System.out.println("请选择你要查找的依据：");
            System.out.println("1、编号；2、姓名；3、年龄；4、性别；5、籍贯");
            int tmp = IOmethod.inputInt();
            String index = "";
            switch (tmp) {
                case 1:
                    index = search(tmp,e);
                    break;
                case 2:
                    index = search(tmp,e);
                    break;
                case 3:
                    index = search(tmp,e);
                    break;
                case 4:
                    index = search(tmp,e);
                    break;
                case 5:
                    index = search(tmp,e);
                    break;
            }
            System.out.println("请输入要修改的籍贯：");
            String tadd = IOmethod.inputString();
            for (int i = 0; i < index.length(); i++) {
                char ind = index.charAt(i);
                int p = Character.getNumericValue(ind);
                changeAdd(p, tadd);
            }
        }
    }

    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        // sm.add();
        String index = sm.searchSex("1");
        System.out.println(index);
    }
}
