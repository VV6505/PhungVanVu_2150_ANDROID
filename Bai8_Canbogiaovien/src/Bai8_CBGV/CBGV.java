package Bai8_CBGV;

import java.util.Scanner;

public class CBGV extends Nguoi {
    // thuoc tinh
    private double luongCung150;
    private double thuong150;
    private double phat150;
    private double luongThucLinh150;

    // phuong thuc
    // ham khoi tao khong doi so
    public CBGV() {

    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("\tNhap luong cung: ");
        luongCung150 = sc.nextDouble();
        sc.nextLine();

        System.out.print("\tNhap thuong: ");
        thuong150 = sc.nextDouble();
        sc.nextLine();

        System.out.print("\tNhap phat: ");
        phat150 = sc.nextDouble();
        sc.nextLine();

        // tinh luong
        luongThucLinh150 = luongCung150 + thuong150 - phat150;
    }

    // ham hien thi thong tin
    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tLuong cung: " + luongCung150);
        System.out.println("\tThuong: " + thuong150);
        System.out.println("\tPhat: " + phat150);
        System.out.println("\tLuong thuc linh: " + luongThucLinh150);
    }

    // ham lay ra thong tin ve luong thuc linh
    public double getLuongThucLinh() {
        return luongThucLinh150;
    }
}