/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author khoihoang
 */
public class StudentManager implements StudentManagerInterface {
    private final ArrayList<Student> students = new ArrayList<>();
    @Override
    public void sortByScoreDesc() {
        Collections.sort(students, (Student o1, Student o2) -> Double.compare(o1.getScore(), o2.getScore()));
    }

    @Override
    public void sortByScoreAsc() {
        Collections.sort(students, (Student o1, Student o2) -> Double.compare(o2.getScore(),o1.getScore()));
    }

    @Override
    public Student findByName(String name) {
        boolean check = false;
        for(Student i : students){
            if(name.equalsIgnoreCase(i.getName())){
                check = true;
                System.out.printf("%-20s| %-20s| %-5s| %-20s| %-20s| %-20s| %-10s| %-5s\n", "ID", "Name", "Age", "Email", "Class", "Address", "Score", "Grade");
                i.hien();
                return i;
            }
        }
        if(!check)
            System.out.println("Khong co ten hoc sinh trong danh sach!");
        return null;
    }

    @Override
    public void printStudents() {
        System.out.printf("%-20s| %-20s| %-5s| %-20s| %-20s| %-20s| %-10s| %-5s\n", "ID", "Name", "Age", "Email", "Class", "Address", "Score", "Grade");
        for(Student i : students){   
            i.hien();
        }
    }
    public void fakeData(){
        students.add(new Student("S001", "Nguyen Van A", "a@example.com", "KTPM01", "Ha Noi", 8.5, 20));
        students.add(new Student("S002", "Tran Thi B", "b@example.com", "KTPM01", "Da Nang", 6.5, 19));
        students.add(new Student("S003", "Le Van C","c@example.com", "KTPM02", "Hai Phong", 3.9, 2));
        students.add(new Student("S004", "Pham Thi D", "d@example.com", "KTPM02", "HCMC", 5.5, 22));
        students.add(new Student("S005", "nguyen van a", "a2@example.com", "KTPM03", "Ha Noi", 9.1, 20));
    }
}
