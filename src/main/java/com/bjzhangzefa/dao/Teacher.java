package com.bjzhangzefa.dao;

public class Teacher {
    int teacherid;
    String teachername;
    int teacherage;
    String teacheraddress;
    long teacherphone;

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public int getAge() {
        return teacherage;
    }

    public void setAge(int age) {
        this.teacherage = teacherage;
    }

    public String getTeacheraddress() {
        return teacheraddress;
    }

    public void setTeacheraddress(String teacheraddress) {
        this.teacheraddress = teacheraddress;
    }

    public long getTeacherphone() {
        return teacherphone;
    }

    public void setTeacherphone(long teacherphone) {
        this.teacherphone = teacherphone;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherid=" + teacherid +
                ", teachername='" + teachername + '\'' +
                ", teacherage=" + teacherage +
                ", teacheraddress='" + teacheraddress + '\'' +
                ", teacherphone=" + teacherphone +
                '}';
    }

    public Teacher() {
    }
}
