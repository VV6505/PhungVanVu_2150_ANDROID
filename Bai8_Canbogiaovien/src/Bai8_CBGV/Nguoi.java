package Bai8_CBGV;

import java.util.Scanner;
public class Nguoi {
    // thuoc tinh
    protected String hoTen150;
    protected String ngaySinh150;
    protected String queQuan150;

    // phuong thuc
    // ham khoi tao khong so
    public Nguoi() {}

    // ham khoi tao co doi so
    public Nguoi(String hoTen, String ngaySinh, String queQuan) {
        this.hoTen150 = hoTen;
        this.ngaySinh150 = ngaySinh;
        this.queQuan150 = queQuan;
    }

    // ham nhap thong tin
    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ho ten: ");
        hoTen150 = sc.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        ngaySinh150 = sc.nextLine();
        System.out.print("\tNhap que quan: ");
        queQuan150 = sc.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen150);
        System.out.println("\tNgay sinh: " + ngaySinh150);
        System.out.println("\tQue quan: " + queQuan150);
    }
}