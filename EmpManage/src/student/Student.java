/*
 * @Author: 宋世杰
 * @Date: 2023-03-22 16:24:04
 * @LastEditTime: 2023-03-24 17:45:10
 * @LastEditors: 宋世杰
 * @FilePath: \EmpManage\src\student\Student.java
 * @Description: 请自行修改描述
 */
package student;

public class Student {
    private int eid;
    private String ename;
    private int eage;
    private String esex;
    private String eaddress;

    public Student() {
        System.out.print("请输入学号：");
        int id = IOmethod.inputInt();
        setId(id);
        System.out.print("请输入姓名：");
        String name = IOmethod.inputString();
        setName(name);
        System.out.print("请输入年龄：");
        int age = IOmethod.inputInt();
        setAge(age);
        System.out.print("请输入性别（男/女）：");
        String sex = IOmethod.inputString();
        setSex(sex);

        System.out.print("请输入籍贯（写省市即可）：");
        String add = IOmethod.inputString();
        setAdd(add);
        System.out.println("学生信息为：" + this);
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

}
