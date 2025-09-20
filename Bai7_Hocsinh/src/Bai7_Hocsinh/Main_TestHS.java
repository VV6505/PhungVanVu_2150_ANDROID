package Bai7_Hocsinh;

import java.util.Scanner;

public class Main_TestHS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLHS list = new QLHS();
        int choice;

        do {
            System.out.println("===== Quan Ly Hoc Sinh =====");
            System.out.println("1. Nhap danh sach hoc sinh");
            System.out.println("2. Tim kiem hoc sinh sinh nam 1985 va que Thai Nguyen");
            System.out.println("3. Tim kiem hoc sinh hoc lop 10A1");
            System.out.println("4. Thoat");
            System.out.print("Chon chuc nang (1-4): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    list.nhapDanhSachHS(sc);
                    break;
                case 2:
                    System.out.println("Nhung hoc sinh sinh nam 1985 va que Thai Nguyen la:");
                    list.timKiemThongTin(1985, "Thai Nguyen");
                    break;
                case 3:
                    System.out.println("Nhung hoc sinh hoc lop 10A1 la:");
                    list.timKiemThongTin("10A1");
                    break;
                case 4:
                    System.out.println("Thoat!");
                    break;
                default:
                    System.out.println("Chuc nang khong hop le, vui long chon lai!");
            }
        } while (choice != 4);

        sc.close();
    }
}