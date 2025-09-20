package Bai4_Tuyensinh;

import java.util.Scanner;

public class ThiSinh {
    // thuoc tinh
    private int soBD150;
    private String hoTen150;
    private String diaChi150;
    private String dienUuTien150;

    // phuong thuc
    // ham khoi tao khong doi so
    public ThiSinh() {

    }

    // ham khoi tao co doi so
    public ThiSinh(int soBD, String hoTen, String diaChi, String dienUuTien) {
        this.soBD150 = soBD;
        this.hoTen150 = hoTen;
        this.diaChi150 = diaChi;
        this.dienUuTien150 = dienUuTien;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap so bao danh: ");
        soBD150 = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhap ho ten: ");
        hoTen150 = sc.nextLine();
        System.out.print("\tNhap dia chi: ");
        diaChi150 = sc.nextLine();
        System.out.print("\tNhap dien uu tien: ");
        dienUuTien150 = sc.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        System.out.println("\tSo bao danh: " + soBD150);
        System.out.println("\tHo ten: " + hoTen150);
        System.out.println("\tDia chi: " + diaChi150);
        System.out.println("\tDien uu tien: " + dienUuTien150);
    }

    // ham lay ra thong tin ve so bao danh
    public int getSoBD() {
        return soBD150;
    }
}