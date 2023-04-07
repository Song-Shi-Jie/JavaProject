/*
 * @Author: 宋世杰
 * @Date: 2023-03-28 17:44:54
 * @LastEditTime: 2023-04-06 00:43:26
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\com\woniu\dao\StuDao.java
 * @Description: 请自行修改描述
 */
package com.woniu.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    // 显示男女数目
    public Map<String, Integer> countSex(List<Student> stu);

    // 显示所有男生
    public List<Student> selectAllMan(List<Student> stu);

    // 删除
    boolean delById(List<Student> list);

    public void writeFile(List<Student> list) throws Exception;

    public List<Student> readFile() throws Exception;

    // 总删除方法
    void search(ArrayList<Student> list);
}
