package Bai1_PhanSo;

import java.util.Scanner;

public class Main_TestPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhanSo tuso150 = new PhanSo();
        PhanSo mauso150 = new PhanSo();
        PhanSo psTong150 = new PhanSo();

        System.out.println("=== Nhập phân số 1 ===");
        tuso150.NhapPS(sc);

        System.out.println("=== Nhập phân số 2 ===");
        mauso150.NhapPS(sc);
        
        psTong150 = tuso150.CongPS(mauso150);
        
        System.out.println("Phân số thứ nhất là: ");
        tuso150.HienThiPS();
        System.out.println("Phân số thứ hai là: ");
        mauso150.HienThiPS();
        System.out.println("Phân số tổng là: ");
        psTong150.HienThiPS();
        
        int choice;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tính toán phân số");
            System.out.println("2. Kiểm tra phân số tổng có tối giản không");
            System.out.println("3. Tìm phân số tối giản của phân số tổng");
            System.out.println("4. Tìm UCLN của tử số và mẫu số phân số tổng");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("=== KẾT QUẢ CÁC PHÉP TOÁN ===");
                    System.out.print("Cộng: " + tuso150.getTuSo() + "/" + tuso150.getMauSo() + " + " + mauso150.getTuSo() + "/" + mauso150.getMauSo() + " = ");
                    psTong150.HienThiPS();
                    System.out.print("Trừ: " + tuso150.getTuSo() + "/" + tuso150.getMauSo() + " - " + mauso150.getTuSo() + "/" + mauso150.getMauSo() + " = ");
                    tuso150.TruPS(mauso150).HienThiPS();
                    System.out.print("Nhân: " + tuso150.getTuSo() + "/" + tuso150.getMauSo() + " * " + mauso150.getTuSo() + "/" + mauso150.getMauSo() + " = ");
                    tuso150.NhanPS(mauso150).HienThiPS();
                    System.out.print("Chia: " + tuso150.getTuSo() + "/" + tuso150.getMauSo() + " / " + mauso150.getTuSo() + "/" + mauso150.getMauSo() + " = ");
                    tuso150.ChiaPS(mauso150).HienThiPS();
                    break;
                case 2:
                    if (psTong150.KiemTraToiGian())
                        System.out.println("Phân số tổng đã tối giản");
                    else
                        System.out.println("Phân số tổng chưa tối giản");
                    break;
                case 3:
                    System.out.print("Phân số tổng sau khi rút gọn: ");
                    psTong150.ToigianPS();
                    psTong150.HienThiPS();
                    break;
                case 4:
                    System.out.println("UCLN của phân số tổng (" + psTong150.getTuSo() + "/" + psTong150.getMauSo() + "): " + psTong150.getUCLN());
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chọn sai, nhập lại!");
            }
        } while (choice != 0);

        sc.close();
    }
}