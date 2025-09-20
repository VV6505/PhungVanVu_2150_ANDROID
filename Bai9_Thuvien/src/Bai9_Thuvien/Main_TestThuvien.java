package Bai9_Thuvien;

import java.util.Scanner;

public class Main_TestThuvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy ql = new QuanLy();
        int choice;

        do {
            System.out.println("===== Quan Ly Thu Vien =====");
            System.out.println("1. Nhap danh sach the muon");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Hien thi sinh vien tra sach cuoi thang");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    ql.nhapDanhSach(sc);
                    break;
                case 2:
                    ql.hienThiDanhSachSinhVien();
                    break;
                case 3:
                    ql.hienThiDanhSachTraCuoiThang();
                    break;
                case 4:
                    System.out.println("Thoat!");
                    break;
                default:
                    System.out.println("Chon sai!");
            }
        } while (choice != 4);

        sc.close();
    }
}