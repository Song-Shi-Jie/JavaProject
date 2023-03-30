/*
 * @Author: 宋世杰
 * @Date: 2023-03-29 19:09:24
 * @LastEditTime: 2023-03-29 19:11:08
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\com\woniu\dao\SetStuDao.java
 * @Description: 请自行修改描述
 */
package com.woniu.dao;

import java.util.HashSet;

import com.woniu.entity.Student;

public interface SetStuDao {

    // 添加员工
    void add(HashSet<Student> list);

    // 显示所有员工
    void display(HashSet<Student> list);

    // 按照编号查找员工
    void searchById(int id, HashSet<Student> list);

    // 按名字
    void searchByName(String name, HashSet<Student> list);

    // 按年龄
    void searchByAge(int age, HashSet<Student> list);

    // 按性别
    void searchBySex(String sex, HashSet<Student> list);

    // 按地址
    void searchByAdd(String add, HashSet<Student> list);

    // 修改学生信息
    void updateStu();

    // 删除
    void del(HashSet<Student> list);

    // 总删除方法
    void search(HashSet<Student> list);

}
