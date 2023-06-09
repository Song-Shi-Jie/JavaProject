package com.woniu.entity;

import java.util.Scanner;

/*
 * @Author: 宋世杰
 * @Date: 2023-03-22 11:15:48
 * @LastEditTime: 2023-03-22 15:22:54
 * @LastEditors: 宋世杰
 * @FilePath: \EmpManage\src\com\woniu\entity\Empolyee.java
 * @Description: 请自行修改描述
 */

// import java.util.Scanner;

public class Empolyee {
    private int eid;
    private String ename;
    private int eage;
    private String esex;
    private String eaddress;

    public Empolyee() {
        System.out.print("请输入数字：");
        int id = inputInt();
        setId(id);
        System.out.print("请输入姓名：");
        String name = inputString();
        setName(name);
        System.out.print("请输入年龄：");
        int age = inputInt();
        setAge(age);
        System.out.print("请输入性别（男/女）：");
        String sex = inputString();
        setSex(sex);
        System.out.print("请输入籍贯（写省市即可）：");
        String add = inputString();
        setAdd(add);
        System.out.println("员工信息为：" + this);
    }

    int inputInt() {
        Scanner i = new Scanner(System.in);
        int tmp = i.nextInt();
        return tmp;
    }

    String inputString() {
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine();
        return tmp;
    }

    public void setId(int id) {
        eid = id;
    }

    public void setName(String name) {
        ename = name;
    }

    public void setAge(int age) {
        eage = age;
    }

    public void setSex(String sex) {
        esex = sex;
    }

    public void setAdd(String add) {
        eaddress = add;
    }

    public int getId() {
        return eid;
    }

    public int getAge() {
        return eage;
    }

    public String getName() {
        return ename;
    }

    public String getSex() {
        return esex;
    }

    public String getAdd() {
        return eaddress;
    }

    @Override
    public String toString() {

        return eid + " " + ename + " " + eage + " " + esex + " " + eaddress;
    }

    // public static void main(String[] args) {
    // Empolyee emp1 = new Empolyee();
    // System.out.println(emp1);
    // }

}
