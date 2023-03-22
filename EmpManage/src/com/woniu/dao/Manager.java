/*
 * @Author: 宋世杰
 * @Date: 2023-03-22 12:09:33
 * @LastEditTime: 2023-03-22 18:10:54
 * @LastEditors: 宋世杰
 * @FilePath: \EmpManage\src\com\woniu\dao\Manager.java
 * @Description: 该模块为管理者，负责实现对员工的各种操作
 */
/*
 *                        _oo0oo_
 *                       o8888888o
 *                       88" . "88
 *                       (| -_- |)
 *                       0\  =  /0
 *                     ___/`---'\___
 *                   .' \\|     |// '.
 *                  / \\|||  :  |||// \
 *                 / _||||| -:- |||||- \
 *                |   | \\\  - /// |   |
 *                | \_|  ''\---/''  |_/ |
 *                \  .-\__  '-'  ___/-. /
 *              ___'. .'  /--.--\  `. .'___
 *           ."" '<  `.___\_<|>_/___.' >' "".
 *          | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *          \  \ `_.   \_ __\ /__ _/   .-` /  /
 *      =====`-.____`.___ \_____/___.-`___.-'=====
 *                        `=---='
 * 
 * 
 *      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * 
 *            佛祖保佑     永不宕机     永无BUG
 * 
 *        佛曰:  
 *                写字楼里写字间，写字间里程序员；  
 *                程序人员写程序，又拿程序换酒钱。  
 *                酒醒只在网上坐，酒醉还来网下眠；  
 *                酒醉酒醒日复日，网上网下年复年。  
 *                但愿老死电脑间，不愿鞠躬老板前；  
 *                奔驰宝马贵者趣，公交自行程序员。  
 *                别人笑我忒疯癫，我笑自己命太贱；  
 *                不见满街漂亮妹，哪个归得程序员？
 */

package com.woniu.dao;

import java.util.Arrays;

import com.woniu.entity.Empolyee;

public class Manager {
    private Empolyee[] e = new Empolyee[0];

    public void getEmpNum() {
        System.out.println("当前员工有" + e.length + "人。");
    }

    public void add() {
        e = Arrays.copyOf(e, e.length + 1);
        Empolyee newe = new Empolyee();
        e[e.length - 1] = newe;
        System.out.println("员工添加成功！！！");
    }

    public void pop() {
        if (e.length != 0) {
            e = Arrays.copyOf(e, e.length - 1);
            System.out.println("员工删除成功！！！");
        } else {
            System.out.println("没员工你删个鬼！！！");
        }

    }

    public Empolyee[] getInfo() {
        return e;
    }

    public void display() {
        if (e.length != 0) {
            for (Empolyee cur : e) {
                System.out.println(cur);
            }
        } else {
            System.out.println("非法输出,请添加员工在输出！！！");
        }
    }

    public void changeName(int i, String name) {
        System.out.println("员工原姓名为" + e[i].getName());
        e[i].setName(name);
        System.out.println("员工修改后姓名为" + e[i].getName());
    }

    public void changeAge(int i, int age) {
        System.out.println("员工原年龄为" + e[i].getName());
        e[i].setAge(age);
        ;
        System.out.println("员工修改后年龄为" + e[i].getName());
    }

    public void changeSex(int i, String sex) {
        System.out.println("员工原性别为" + e[i].getName());
        e[i].setSex(sex);
        ;
        System.out.println("员工修改后性别为" + e[i].getName());
    }

    public void changeAdd(int i, String add) {
        System.out.println("员工原籍贯为" + e[i].getName());
        e[i].setAdd(add);
        ;
        System.out.println("员工修改后籍贯为" + e[i].getName());
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        // Empolyee[] e = m.getInfo();
        m.getEmpNum();
        m.display();
        m.add();
        m.add();
        m.getEmpNum();
        m.display();
        m.pop();
        m.display();
        m.getEmpNum();
        m.changeName(0, "张三");
    }

}
