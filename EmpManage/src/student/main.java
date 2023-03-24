/*
 * @Author: 宋世杰
 * @Date: 2023-03-22 18:05:03
 * @LastEditTime: 2023-03-23 10:25:09
 * @LastEditors: 宋世杰
 * @FilePath: \EmpManage\src\student\main.java
 * @Description: 系统入口
 */
package student;

public class main {
    static IOmethod io = new IOmethod();
    static StudentManager sm = new StudentManager();

    public static void main(String[] args) {
        while (true) {
            System.out.println("请选择您需要的操作：");
            System.out.println(
                    "1、显示所有员工信息\n2、添加新员工\n3、根据编号删除员工\n4、根据性别查询员工\n5、根据编号查询员工信息\n6、根据姓名查询员工\n7、根据地址查询员工信息\n8、根据名字删除员工\n9、修改信息\n10、退出系统");
            int opt = io.inputInt();
            if (opt == 1) {
                sm.display();
                io.clear();
            } else if (opt == 2) {
                sm.add();
                sm.getEmpNum();
                io.clear();
            } else if (opt == 3) {
                Student[] e = sm.getInfo();
                String index = sm.search(1);
                for (int i = 0; i < index.length(); i++) {
                    char ind = index.charAt(i);
                    int p = Character.getNumericValue(ind);
                    // System.out.println(p);
                    e[p] = e[e.length - 1];
                    sm.pop();
                }
                io.clear();
            } else if (opt == 4) {
                Student[] e = sm.getInfo();
                String index = sm.search(4);
                for (int i = 0; i < index.length(); i++) {
                    char ind = index.charAt(i);
                    int p = Character.getNumericValue(ind);
                    System.out.println(e[p]);
                }
                io.clear();
            } else if (opt == 5) {
                Student[] e = sm.getInfo();
                String index = sm.search(1);
                for (int i = 0; i < index.length(); i++) {
                    char ind = index.charAt(i);
                    int p = Character.getNumericValue(ind);
                    // System.out.println(p);
                    System.out.println(e[p]);
                }
                io.clear();
            } else if (opt == 6) {
                Student[] e = sm.getInfo();
                String index = sm.search(2);
                // System.out.println(index);
                for (int i = 0; i < index.length(); i++) {
                    char ind = index.charAt(i);
                    int p = Character.getNumericValue(ind);
                    // System.out.println(p);
                    System.out.println(e[p]);
                }
                io.clear();
            } else if (opt == 7) {
                Student[] e = sm.getInfo();
                String index = sm.search(5);
                for (int i = 0; i < index.length(); i++) {
                    char ind = index.charAt(i);
                    int p = Character.getNumericValue(ind);
                    System.out.println(e[p]);
                }
                io.clear();
            } else if (opt == 8) {
                Student[] e = sm.getInfo();
                String index = sm.search(2);
                for (int i = 0; i < index.length(); i++) {
                    char ind = index.charAt(i);
                    int p = Character.getNumericValue(ind);
                    e[p] = e[e.length - 1];
                    sm.pop();
                }
                io.clear();
            } else if (opt == 9) {
                sm.change();
                io.clear();
            } else if (opt == 10) {
                System.out.println("感谢使用蜗牛员工管理系统，欢迎下次使用！");
                break;
            }
        }
    }
}
