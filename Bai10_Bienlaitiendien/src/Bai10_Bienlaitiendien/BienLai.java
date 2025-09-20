package Bai10_Bienlaitiendien;

import java.util.Scanner;

public class BienLai extends KhachHang {
    // Thuoc tinh
    private int chiSoMoi150;
    private int chiSoCu150;
    private double tien150;

    // Phuong thuc
    // Ham khoi tao khong doi so
    public BienLai() {

    }

    // Ham khoi tao co doi so
    public BienLai(int chiSoMoi, int chiSoCu, double tien) {
        this.chiSoMoi150 = chiSoMoi;
        this.chiSoCu150 = chiSoCu;
        this.tien150 = tien;
    }

    public BienLai(String tenChuHo, int chiSoMoi, int chiSoCu, double tien) {
        this.tenChuHo150 = tenChuHo;
        this.chiSoMoi150 = chiSoMoi;
        this.chiSoCu150 = chiSoCu;
        this.tien150 = tien;
    }

    // Ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap chi so moi: ");
        chiSoMoi150 = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhap chi so cu: ");
        chiSoCu150 = sc.nextInt();
        sc.nextLine();
        tien150 = (chiSoMoi150 - chiSoCu150) * 750;
    }

    // Ham hien thi
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tChi so moi: " + chiSoMoi150);
        System.out.println("\tChi so cu: " + chiSoCu150);
        System.out.println("\tTien: " + tien150);
    }
}