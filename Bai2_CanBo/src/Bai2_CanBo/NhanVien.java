package Bai2_CanBo;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec150;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.congViec150 = congViec;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập công việc: ");
        congViec150 = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tCông việc: " + congViec150);
    }
}