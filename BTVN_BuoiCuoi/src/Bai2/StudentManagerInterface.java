/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author khoihoang
 */
public interface StudentManagerInterface {
    public void sortByScoreDesc();
    public void sortByScoreAsc();
    public Student findByName(String name);
    public void printStudents();
}
