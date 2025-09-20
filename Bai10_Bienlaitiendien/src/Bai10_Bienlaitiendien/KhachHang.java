package Bai10_Bienlaitiendien;

import java.util.Scanner;

public class KhachHang {
    // Thuoc tinh
    protected String tenChuHo150;
    protected int soNha150;
    protected String maCongTo150;

    // Phuong thuc
    // Ham khoi tao khong doi so
    public KhachHang() {

    }

    // Ham khoi tao co doi so
    public KhachHang(String tenChuHo, int soNha, String maCongTo) {
        this.tenChuHo150 = tenChuHo;
        this.soNha150 = soNha;
        this.maCongTo150 = maCongTo;
    }

    // Ham nhap
    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ten chu ho: ");
        tenChuHo150 = sc.nextLine();
        System.out.print("\tNhap so nha: ");
        soNha150 = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhap ma cong to: ");
        maCongTo150 = sc.nextLine();
    }

    // Ham hien thi
    public void hienThiThongTin() {
        System.out.println("\tTen chu ho: " + tenChuHo150);
        System.out.println("\tSo nha: " + soNha150);
        System.out.println("\tMa cong to: " + maCongTo150);
    }
}