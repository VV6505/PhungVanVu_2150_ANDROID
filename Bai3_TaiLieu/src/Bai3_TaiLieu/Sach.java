package Bai3_TaiLieu;

import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tacGia150;
    private int soTrang150;

    public Sach() {
    }

    public Sach(String tacGia, int soTrang, String maTaiLieu, String tenNXB, int soBanPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.tacGia150 = tacGia;
        this.soTrang150 = soTrang;
    }
    
    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap tac gia: ");
        tacGia150 = sc.nextLine();
        System.out.print("\tNhap so trang: ");
        soTrang150 = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tTac gia: " + tacGia150);
        System.out.println("\tSo trang: " + soTrang150);
    }
}