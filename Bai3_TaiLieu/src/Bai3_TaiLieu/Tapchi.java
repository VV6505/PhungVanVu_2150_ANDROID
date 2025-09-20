package Bai3_TaiLieu;

import java.util.Scanner;

public class Tapchi extends TaiLieu {
    private int soPhatHanh150;
    private int thangPhatHanh150;

    public Tapchi() {
    }

    public Tapchi(int soPhatHanh, int thangPhatHanh, String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.soPhatHanh150 = soPhatHanh;
        this.thangPhatHanh150 = thangPhatHanh;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap so phat hanh: ");
        soPhatHanh150 = sc.nextInt();
        System.out.println("\tNhap thang phat hanh: ");
        thangPhatHanh150 = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo phat hanh: " + soPhatHanh150);
        System.out.println("\tThang phat hanh: " + thangPhatHanh150);
    }    
}