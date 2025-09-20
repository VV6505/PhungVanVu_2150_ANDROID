package Bai10_Bienlaitiendien;

import java.util.Scanner;

public class Main_Testbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy ql = new QuanLy();
        int choice;

        do {
            System.out.println("===== Quan Ly Bien Lai =====");
            System.out.println("1. Nhap danh sach bien lai");
            System.out.println("2. Hien thi danh sach bien lai");
            System.out.println("3. Thoat");
            System.out.print("Chon chuc nang (1-3): ");
            choice = sc.nextInt();
            sc.nextLine();  // Đọc dòng mới

            switch (choice) {
                case 1:
                    ql.nhapDanhSach(sc);
                    break;
                case 2:
                    System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
                    ql.hienThiDanhSach();
                    break;
                case 3:
                    System.out.println("Thoat!");
                    break;
                default:
                    System.out.println("Chuc nang khong hop le, vui long chon lai!");
            }
        } while (choice != 3);
        sc.close();
    }
}