package Bai7_Hocsinh;

import java.util.Scanner;

public class HocSinh extends Nguoi {
    // thuoc tinh
    private String lop150;
    private String khoHoc150;
    private String kyHoc150;

    // phuong thuc
    // ham khoi tao khong doi so
    public HocSinh() {

    }

    // ham khoi tao co doi so
    public HocSinh(String hoTen, String lop, String khoaHoc, String kyHoc) {
        this.hoTen150 = hoTen;
        this.lop150 = lop;
        this.khoHoc150 = khoaHoc;
        this.kyHoc150 = kyHoc;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("\tNhap lop: ");
        lop150 = sc.nextLine();

        System.out.print("\tNhap khoa hoc: ");
        khoHoc150 = sc.nextLine();

        System.out.print("\tNhap ky hoc: ");
        kyHoc150 = sc.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tLop: " + lop150);
        System.out.println("\tKhoa hoc: " + khoHoc150);
        System.out.println("\tKy hoc: " + kyHoc150);
    }

    // ham lay ra thong tin ve lop
    public String getLop() {
        return lop150;
    }
}