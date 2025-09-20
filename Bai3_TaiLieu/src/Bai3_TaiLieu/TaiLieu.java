package Bai3_TaiLieu;

import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu150;
    private String tenNXB150;
    private int soBanPhatHanh150;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        this.maTaiLieu150 = maTaiLieu;
        this.tenNXB150 = tenNXB;
        this.soBanPhatHanh150 = soBanPhatHanh;
    }
    
    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap ma tai lieu: ");
        maTaiLieu150 = sc.nextLine();
        System.out.print("Nhap ten nha xuat ban: ");
        tenNXB150 = sc.nextLine();
        System.out.print("Nhap so ban phat hanh: ");
        soBanPhatHanh150 = sc.nextInt();
        sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Ma tai lieu: " + maTaiLieu150);
        System.out.println("Ten nha xuat ban: " + tenNXB150);
        System.out.println("So ban phat hanh: " + soBanPhatHanh150);
    }

    public String getMaTaiLieu() {
        return maTaiLieu150;
    }
}