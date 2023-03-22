package student;

public class Student {
    private int eid;
    private String ename;
    private int eage;
    private String esex;
    private String eaddress;
    private IOmethod io = new IOmethod();

    public Student() {
        System.out.print("请输入学号：");
        int id = io.inputInt();
        setId(id);
        System.out.print("请输入姓名：");
        String name = io.inputString();
        setName(name);
        System.out.print("请输入年龄：");
        int age = io.inputInt();
        setAge(age);
        System.out.print("请输入性别（男/女）：");
        String sex = io.inputString();
        setSex(sex);

        System.out.print("请输入籍贯（写省市即可）：");
        String add = io.inputString();
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
