package com.woniu.entity;

/*
 * @Author: 宋世杰
 * @Date: 2023-03-22 11:15:48
 * @LastEditTime: 2023-03-22 13:07:46
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

    int getId() {
        return eid;
    }

    int getAge() {
        return eage;
    }

    String getName(){
        return ename;
    }

    String getSex(){
        return esex;
    }

    String getAdd(){
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
