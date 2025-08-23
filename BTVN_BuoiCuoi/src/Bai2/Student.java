/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author khoihoang
 */
public class Student {
    private String id, name, email, className, address;
    private double score;
    private int age;
    public char getGrade(){
        if(score >= 8)
            return 'A';
        if(score >= 6)
            return 'B';
        if(score >=4)
            return 'C';
        if(score >= 0)
            return 'D';
        if(score > 10 || score < 0)
            System.out.println("Diem khong hop le!");
        return 0;
    }

    public Student(String id, String name, String email, String className, String address, double score, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.className = className;
        this.address = address;
        this.score = score;
        this.age = age;
    }

    public Student() {
    }
    public void hien(){
        System.out.printf("%-20s| %-20s| %-5d| %-20s| %-20s| %-20s| %-10.3f| %-5c\n",id, name,age,email,className,address, score,getGrade());
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
