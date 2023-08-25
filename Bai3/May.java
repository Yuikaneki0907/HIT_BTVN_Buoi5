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
public class May {

    private String MaMay;
    private String TenMay;
    private String TinhTrang;

    public String getMaMay() {
        return MaMay;
    }

    public void setMaMay(String MaMay) {
        this.MaMay = MaMay;
    }

    public String getTenMay() {
        return TenMay;
    }

    public void setTenMay(String TenMay) {
        this.TenMay = TenMay;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public May() {
    }

    public May(String MaMay, String TenMay, String TinhTrang) {
        this.MaMay = MaMay;
        this.TenMay = TenMay;
        this.TinhTrang = TinhTrang;
    }

    public void Nhap(Scanner sc) {
        System.out.print("Nhap ma may: ");
        MaMay = sc.nextLine();
        System.out.print("Nhap ten may: ");
        TenMay = sc.nextLine();
        System.out.print("Nhap tinh trang may: ");
        TinhTrang = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ma may la: " + this.MaMay);
        System.out.println("Ten may la: " + this.TenMay);
        System.out.println("Tinh trang may la: " + this.TinhTrang);
    }
}
