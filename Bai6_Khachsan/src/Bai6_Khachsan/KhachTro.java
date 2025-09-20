package Bai6_Khachsan;

import java.util.Scanner;

public class KhachTro extends Nguoi {
    // thuoc tinh
    private int soNgayTro150;
    private String loaiPhong150;
    private double giaPhong150;

    // phuong thuc
    // ham khoi tao khong doi so
    public KhachTro() {

    }

    // ham khoi tao co doi so
    public KhachTro(String hoTen, int CMND, int soNgayTro, String loaiPhong, double giaPhong) {
        this.hoTen150 = hoTen;
        this.CMND150 = CMND;
        this.soNgayTro150 = soNgayTro;
        this.loaiPhong150 = loaiPhong;
        this.giaPhong150 = giaPhong;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("\tNhap so ngay tro: ");
        soNgayTro150 = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhap loai phong: ");
        loaiPhong150 = sc.nextLine();
        System.out.print("\tNhap gia phong: ");
        giaPhong150 = sc.nextDouble();
        sc.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tSo ngay tro: " + soNgayTro150);
        System.out.println("\tLoai phong: " + loaiPhong150);
        System.out.printf("\tGia phong: %.2f VND\n", giaPhong150);
    }

    // ham lay ra thong tin so ngay tro
    public int getSoNgayTro() {
        return soNgayTro150;
    }

    // ham lay thong tin gia phong
    public double getGiaPhong() {
        return giaPhong150;
    }
}