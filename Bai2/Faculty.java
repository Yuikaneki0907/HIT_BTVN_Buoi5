/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Faculty {

    private String Name;
    private String Date;
    private School x = new School();

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }

    public Faculty() {
    }

    public Faculty(String Name, String Date, School x) {
        this.Name = Name;
        this.Date = Date;
        this.x = x;
    }

    public void Input(Scanner sc) {
        System.out.print("Nhap ten truong: ");
        x.setName(sc.nextLine());
        System.out.print("Nhap ngay vao truong: ");
        x.setDate(sc.nextLine());
        x.getDate();
        System.out.print("Nhap ten khoa: ");
        Name = sc.nextLine();
        System.out.print("Nhap ngay vao khoa: ");
        Date = sc.nextLine();
    }

    public void Output() {
        System.out.println("Ten truong la: " + this.x.getName());
        System.out.println("Ngay vao truong la: " + this.x.getDate());
        System.out.println("Ten khoa la: " + this.Name);
        System.out.println("Ngay vao khoa la: " + this.Date);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Faculty s = new Faculty();
        s.Input(sc);
        s.Output();
    }
}
