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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hang a = new Hang();
        NSX b = new NSX();
        a.nhap(sc);
        b.nhap(sc);
        a.xuat();
        b.xuat();
    }
}
