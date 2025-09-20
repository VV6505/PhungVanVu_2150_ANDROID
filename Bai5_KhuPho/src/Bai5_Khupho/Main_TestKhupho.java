package Bai5_Khupho;

import java.util.Scanner;

public class Main_TestKhupho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        KhuPho qlkp = new KhuPho();

        qlkp.nhapDanhSach(sc);

        System.out.println("----Danh sach ho dan co nguoi 80 tuoi la:----");
        qlkp.timKiemThongTin();
    }
}