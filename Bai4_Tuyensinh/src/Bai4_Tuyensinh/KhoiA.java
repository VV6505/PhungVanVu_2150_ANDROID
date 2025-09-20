package Bai4_Tuyensinh;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
    // thuoc tinh
    private String mon1150;
    private String mon2150;
    private String mon3150;
    
    // phuong thuc
    // ham khoi tao khong doi so
    public KhoiA() {
        
    }

    // ham khoi tao co doi so
    public KhoiA(String mon1, String mon2, String mon3) {
        this.mon1150 = mon1;
        this.mon2150 = mon2;
        this.mon3150 = mon3;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap mon 1: ");
        mon1150 = sc.nextLine();
        System.out.print("\tNhap mon 2: ");
        mon2150 = sc.nextLine();
        System.out.print("\tNhap mon 3: ");
        mon3150 = sc.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tTo hop mon thi: " + mon1150 + " - " + mon2150 + " - " + mon3150);
    }
}