package btvn_trenLopB4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author khoihoang
 */
public class SinhVien {
    private String name;
    private int age;
    public void sayHello(){
        System.out.println("Xin chao, toi ten la " + name + ", nam nay " + age + " tuoi");
    }
    public SinhVien(String name, int tuoi){
        this.name = name;
        this.age = tuoi;
    }
    public String getName(){
        return name;
    }
public void setName(String name)
{
    this.name = name;
}
public int getAge(){
    return age;
}
public void setAge(int age){
    this.age = age;
}
    public SinhVien(){}
    public static void main(String[] args) {
        SinhVien a = new SinhVien();
        try(Scanner in = new Scanner(System.in)){
            a.name = in.nextLine();
            a.age = in.nextInt();
            a.sayHello();  
        }
        SinhVien b = new SinhVien("khoi",19);
        b.setName("Dep trai");
        b.setAge(18);
        System.out.println("Xin chao, toi ten la " + b.getName() + " tuoi" + ", nam nay " + b.getAge());
    }
}
