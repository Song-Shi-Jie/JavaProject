/*
 * @Author: 宋世杰
 * @Date: 2023-03-28 17:44:54
 * @LastEditTime: 2023-03-28 20:24:18
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\com\woniu\dao\StuDao.java
 * @Description: 请自行修改描述
 */
package com.woniu.dao;

import java.util.ArrayList;

import com.woniu.entity.Student;

public interface StuDao {
    // 添加员工
    void add(ArrayList<Student> list);

    // 显示所有员工
    void display(ArrayList<Student> list);

    // 按照编号查找员工
    void searchById(int id, ArrayList<Student> list);

    // 按名字
    void searchByName(String name, ArrayList<Student> list);

    // 按年龄
    void searchByAge(int age, ArrayList<Student> list);

    // 按性别
    void searchBySex(String sex, ArrayList<Student> list);

    // 按地址
    void searchByAdd(String add, ArrayList<Student> list);

    // 修改学生信息
    void updateStu();

    // 删除
    void del(ArrayList<Student> list);

    // 总删除方法
    void search(ArrayList<Student> list);
}
