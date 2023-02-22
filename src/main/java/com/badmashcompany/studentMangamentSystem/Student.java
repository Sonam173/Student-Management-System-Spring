package com.badmashcompany.studentMangamentSystem;

public class Student {
    private int adminNo;
    private String name;
    private int age;
    private String branch;

    public Student(int adminNo, String name, int age, String branch) {
        this.adminNo = adminNo;
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    public int getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(int adminNo) {
        this.adminNo = adminNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
