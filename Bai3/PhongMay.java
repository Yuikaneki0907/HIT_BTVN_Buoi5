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
public class PhongMay {

    private String MaPhong;
    private String TenPhong;
    private String DienTich;
    private QuanLy x;
    private May y;
    private int n;

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public String getDienTich() {
        return DienTich;
    }

    public void setDienTich(String DienTich) {
        this.DienTich = DienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May getY() {
        return y;
    }

    public void setY(May y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public PhongMay() {
    }

    public PhongMay(String MaPhong, String TenPhong, String DienTich, QuanLy x, May y) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.DienTich = DienTich;
        this.x = x;
        this.y = y;
    }

    public void Nhap(Scanner sc) {
        System.out.print("Nhap ma phong may: ");
        MaPhong = sc.nextLine();
        System.out.print("Nhap ten phong may: ");
        TenPhong = sc.nextLine();
        System.out.print("Nhap dien tich phong may: ");
        DienTich = sc.nextLine();
        System.out.print("Nhap so luong may: ");
        this.n = sc.nextInt();
    }

    public void Xuat() {
        System.out.println("Ma phong may la: " + this.MaPhong);
        System.out.println("Ten phong may la: " + this.TenPhong);
        System.out.println("Dien tich phong may la: " + this.DienTich);
        System.out.println("So luong may la: " + this.n);
    }
}
