package Bai3_TaiLieu;

import java.util.Scanner;

public class Bao extends TaiLieu {
    private String ngayPhatHanh150;

    public Bao() {
    }

    public Bao(String ngayPhatHanh, String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh150 = ngayPhatHanh;
    }
    
    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap ngay phat hanh: ");
        ngayPhatHanh150 = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tNgay phat hanh: " + ngayPhatHanh150);
    }
}