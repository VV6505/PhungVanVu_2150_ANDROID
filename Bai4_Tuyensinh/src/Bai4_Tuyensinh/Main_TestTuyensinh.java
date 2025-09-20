package Bai4_Tuyensinh;

import java.util.Scanner;

public class Main_TestTuyensinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh dsTuyenSinh = new TuyenSinh();

        int chon;
        do {
            System.out.println("========== MENU TUYEN SINH ==========");
            System.out.println("1. Nhap danh sach thi sinh");
            System.out.println("2. Hien thi danh sach thi sinh");
            System.out.println("3. Tim kiem thi sinh theo so bao danh");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    dsTuyenSinh.nhapDanhSach(sc);
                    break;
                case 2:
                    dsTuyenSinh.hienThiDanhSach();
                    break;
                case 3:
                    System.out.print("Nhap so bao danh can tim: ");
                    int soBaoDanh = sc.nextInt();
                    sc.nextLine();
                    dsTuyenSinh.timKiemThiSinh(soBaoDanh);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai!");
            }
        } while (chon != 0);

        sc.close();
    }
}