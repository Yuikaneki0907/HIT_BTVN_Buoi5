/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class QuanLy {

    private String MaQL;
    private String HoTen;

    public String getMaQL() {
        return MaQL;
    }

    public void setMaQL(String MaQL) {
        this.MaQL = MaQL;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public QuanLy() {
    }

    public QuanLy(String MaQL, String HoTen) {
        this.MaQL = MaQL;
        this.HoTen = HoTen;
    }

    public void Nhap(Scanner sc) {
        System.out.print("Nhap ma quan ly: ");
        MaQL = sc.nextLine();
        System.out.print("Nhap ten quan ly: ");
        HoTen = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ma quan ly la: " + this.MaQL);
        System.out.println("Ten quan ly la: " + this.HoTen);
    }
}
