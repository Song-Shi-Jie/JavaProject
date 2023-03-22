package com.woniu.entity;

/*
 * @Author: 宋世杰
 * @Date: 2023-03-22 11:15:48
 * @LastEditTime: 2023-03-22 12:02:08
 * @LastEditors: 宋世杰
 * @FilePath: \JavaProject\EmpManage\src\entity\Empolyee.java
 * @Description: 请自行修改描述
 */

// import java.util.Scanner;

public class Empolyee {
    private int eid;
    private String ename;
    private int eage;
    private String esex;
    private String eaddress;

    Empolyee() {
    }

    void setId(int id) {
        eid = id;
    }

    void setName(String name) {
        ename = name;
    }

    void setAge(int age) {
        eage = age;
    }

    void setSex(String sex) {
        esex = sex;
    }

    void setAdd(String add) {
        eaddress = add;
    }

    String get() {
        return eid + " " + ename + " " + eage + " " + esex + " " + eaddress;
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
