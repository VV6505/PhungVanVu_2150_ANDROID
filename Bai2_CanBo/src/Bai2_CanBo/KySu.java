package Bai2_CanBo;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao150;

    public KySu() {
    }

    public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        this.nganhDaoTao150 = nganhDaoTao;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập ngành đào tạo: ");
        nganhDaoTao150 = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tNgành đào tạo: " + nganhDaoTao150);
    }
}