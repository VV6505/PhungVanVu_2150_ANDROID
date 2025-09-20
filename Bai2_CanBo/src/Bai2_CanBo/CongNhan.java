package Bai2_CanBo;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private String bac150;

    public CongNhan() {
    }

    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String bac) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.bac150 = bac;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập bậc công nhân: ");
        bac150 = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tBậc công nhân: " + bac150);
    }
}