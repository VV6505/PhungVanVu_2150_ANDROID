package Bai6_Khachsan;

import java.util.Scanner;

public class Main_TestKhachsan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        KhachSan ql = new KhachSan();

        ql.nhapDanhSach(sc);

        System.out.print("Nhap vao khach tro can tinh tien (nhap CMND): ");
        int cmnd = sc.nextInt();

        System.out.println("==> Tong tien la: " + ql.tinhTien(cmnd));

        sc.close();
    }
}