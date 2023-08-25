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
public class NSX {

    private String MaNSX;
    private String TenNSX;
    private String DcNSX;

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String MaNSX) {
        this.MaNSX = MaNSX;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String TenNSX) {
        this.TenNSX = TenNSX;
    }

    public String getDcNSX() {
        return DcNSX;
    }

    public void setDcNSX(String DcNSX) {
        this.DcNSX = DcNSX;
    }

    public NSX() {
    }

    public NSX(String MaNSX, String TenNSX, String DcNSX) {
        this.MaNSX = MaNSX;
        this.TenNSX = TenNSX;
        this.DcNSX = DcNSX;
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap ma nha san xuat: ");
        MaNSX = sc.nextLine();
        System.out.print("Nhap ten nha san xuat: ");
        TenNSX = sc.nextLine();
        System.out.print("Nhap dia chi nha san xuat: ");
        DcNSX = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ma nha san xuat la: " + this.MaNSX);
        System.out.println("Ten nha san xuat la: " + this.TenNSX);
        System.out.println("Dia chi nha san xuat la: " + this.DcNSX);
    }
}
