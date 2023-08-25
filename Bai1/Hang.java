/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Hang {

    private String MaHang;
    private String TenHang;
    private NSX x = new NSX();

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public NSX getX() {
        return x;
    }

    public void setX(NSX x) {
        this.x = x;
    }

    public Hang() {
    }
    public static Scanner sc = new Scanner(System.in);

    public Hang(String MaHang, String TenHang, NSX x) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        x.nhap(sc);
        this.x = x;
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap ma hang: ");
        MaHang = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        TenHang = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ma hang la: " + this.MaHang);
        System.out.println("Ten hang la: " + this.TenHang);
    }
}
