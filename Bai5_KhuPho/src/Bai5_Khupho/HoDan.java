package Bai5_Khupho;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
    // thuoc tinh
    private int soNguoi150;
    private int soNha150;
    private Nguoi[] list150; // list la mang danh sach chua cac thanh vien trong ho

    // phuong thuc
    // ham khoi tao khong doi so
    public HoDan() {
        list150 = new Nguoi[10];
    }

    // ham khoi tao co doi so
    public HoDan(String hoTen, Date ngaySinh, String ngheNghiep, int soNguoi, int soNha) {
        super(hoTen, ngaySinh, ngheNghiep);
        this.soNguoi150 = soNguoi;
        this.soNha150 = soNha;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap so nguoi: ");
        soNguoi150 = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhap so nha: ");
        soNha150 = sc.nextInt();
        sc.nextLine();
        System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
        for (int i = 0; i < soNguoi150; i++) {
            System.out.println("Nguoi thu " + (i + 1) + " la:");
            list150[i] = new Nguoi();
            list150[i].nhapThongTin(sc);
        }
    }

    // hien thi
    public void hienThiThongTin() {
        System.out.println("\tSo nguoi: " + soNguoi150);
        System.out.println("\tSo nha: " + soNha150);
        System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
        for (int i = 0; i < soNguoi150; i++) {
            System.out.println("Nguoi thu " + (i + 1) + " la:");
            list150[i].hienThiThongTin();
        }
    }

    // ham lay ra thanh vien trong ho dan
    public Nguoi[] getList() {
        return list150;
    }

    // ham lay ra so thanh vien trong ho gia dinh
    public int getSoNguoi() {
        return soNguoi150;
    }
}