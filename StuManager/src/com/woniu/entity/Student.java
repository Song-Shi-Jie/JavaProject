/*
 * @Author: 宋世杰
 * @Date: 2023-03-28 17:37:48
 * @LastEditTime: 2023-03-28 18:57:33
 * @LastEditors: 宋世杰
 * @FilePath: \StuManager\src\com\woniu\entity\Student.java
 * @Description: 请自行修改描述
 */
package com.woniu.entity;

import com.woniu.tools.ScannerTools;

public class Student {
    private final int EID;
    private String sname;
    private int sage;
    private String ssex;
    private String sadd;

    public Student() {
        System.out.print("请输入id：");
        int sid = ScannerTools.getInt();
        EID = sid;
    }

    public Student(int eID) {
        EID = eID;
    }

    public Student(int eID, String sname, int sage, String ssex, String sadd) {
        EID = eID;
        this.sname = sname;
        this.sage = sage;
        this.ssex = ssex;
        this.sadd = sadd;
    }

    public int getEID() {
        return EID;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSadd() {
        return sadd;
    }

    public void setSadd(String sadd) {
        this.sadd = sadd;
    }

    @Override
    public String toString() {
        return "Student [EID=" + EID + ", sname=" + sname + ", sage=" + sage + ", ssex=" + ssex + ", sadd=" + sadd
                + "]";
    }

}
