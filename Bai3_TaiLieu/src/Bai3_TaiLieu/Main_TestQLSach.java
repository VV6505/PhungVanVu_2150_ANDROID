package Bai3_TaiLieu;

import java.util.Scanner;

public class Main_TestQLSach {
    public static void main(String[] args) {
        QLSach qls = new QLSach();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("1. Thêm thông tin về tài liệu");
            System.out.println("2. Tìm kiếm theo loại tài liệu");            
            System.out.println("3. Tìm kiếm theo mã tài liệu");
            System.out.println("4. Hiển thị tất cả tài liệu");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    qls.nhapDanhSach(sc);
                    break;
                case 2:
                    System.out.print("Nhập loại tài liệu cần tìm: ");
                    String loai = sc.nextLine();
                    qls.timKiemLoaiTL(loai);                    
                    break;
                case 3:
                    System.out.print("Nhập mã tài liệu cần tìm: ");
                    String maTL = sc.nextLine();
                    qls.timKiemTheoMa(maTL);
                    break;
                case 4:
                    qls.hienThiTatCa();
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình!");
                    return;
                default:
                    System.out.println("Chọn sai, mời nhập lại!");
            }
        }
    }  
}