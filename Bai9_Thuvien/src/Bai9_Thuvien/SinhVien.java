package Bai9_Thuvien;

import java.util.Scanner;

public class SinhVien {
    // thuoc tinh
    protected String hoTen150;
    protected String maSV150;
    protected String ngaySinh150;
    protected String lop150;

    // phuong thuc
    // ham khoi tao khong doi so
    public SinhVien() {

    }

    // ham khoi tao co doi so
    public SinhVien(String hoTen, String maSV, String ngaySinh, String lop) {
        this.hoTen150 = hoTen;
        this.maSV150 = maSV;
        this.ngaySinh150 = ngaySinh;
        this.lop150 = lop;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ho ten: ");
        hoTen150 = sc.nextLine();

        System.out.print("\tNhap ma sinh vien: ");
        maSV150 = sc.nextLine();

        System.out.print("\tNhap ngay sinh: ");
        ngaySinh150 = sc.nextLine();

        System.out.print("\tNhap lop: ");
        lop150 = sc.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        System.out.println("  Ho ten: " + hoTen150);
        System.out.println("  Ngay sinh: " + ngaySinh150);
        System.out.println("  Ma sinh vien: " + maSV150);
        System.out.println("  Lop: " + lop150);
    }
}