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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        int n = sc.nextInt();
        Student[] std = new Student[n];
        for (int i = 0; i < n; i++) {
            Student st = new Student();
            System.out.println("Nhap thong tin hoc sinh thu " + (i + 1) + ": ");
            sc.nextLine();
            st.Input(sc);
            std[i] = st;
        }
        System.out.println("\nThong tin hoc sinh da duoc nhap la:");
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin hoc sinh thu " + (i + 1) + ": ");
            std[i].Output();
        }
    }
}
