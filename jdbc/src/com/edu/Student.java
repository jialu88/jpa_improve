package com.edu;

public class Student {
    private String StuNo;
    private String StuName;
    private String Age;

    public String getStuNo() {
        return StuNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StuNo='" + StuNo + '\'' +
                ", StuName='" + StuName + '\'' +
                ", Age='" + Age + '\'' +
                ", Sex=" + Sex +
                '}';
    }

    public void setStuNo(String stuNo) {
        StuNo = stuNo;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public Boolean getSex() {
        return Sex;
    }

    public void setSex(Boolean sex) {
        Sex = sex;
    }

    private Boolean Sex;
}
