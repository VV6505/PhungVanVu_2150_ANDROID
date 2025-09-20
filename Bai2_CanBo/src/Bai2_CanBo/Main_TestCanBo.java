package Bai2_CanBo;

import java.util.Scanner;

public class Main_TestCanBo {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("1. Thêm cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
//            System.out.println("3. Hiển thị tất cả cán bộ");
            System.out.println("3. Thoát");
            System.out.print("Chọn: ");
            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    qlcb.nhapDanhSach(sc);
                    break;
                case 2:
                    System.out.print("Nhập tên cần tìm: ");
                    String ten = sc.nextLine();
                    qlcb.timKiemTheoTen(ten);
                    break;
//                case 3:
//                    qlcb.hienThiTatCa();
//                    break;
                case 3:
                    System.out.println("Kết thúc chương trình!");
                    return;
                default:
                    System.out.println("Chọn sai, mời nhập lại!");
            }
        }
    }
}
