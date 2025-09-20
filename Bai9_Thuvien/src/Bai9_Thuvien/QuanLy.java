package Bai9_Thuvien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    // thuoc tinh
    private ArrayList<TheMuon> ds150;

    // phuong thuc
    // ham khoi tao khong doi so
    public QuanLy() {
        ds150 = new ArrayList<TheMuon>(10);
    }

    // ham them the muon vao danh sach
    public void themTheMuon(TheMuon theMuon) {
        ds150.add(theMuon);
    }

    // ham nhap vao danh sach
    public void nhapDanhSach(Scanner sc) {
        TheMuon theMuon;

        System.out.print("Nhap vao so luong the muon: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap vao danh sach:");
        for (int i = 0; i < n; i++) {
            System.out.println("The muon thu " + (i + 1) + " la:");
            theMuon = new TheMuon();
            theMuon.nhapThongTin(sc);
            themTheMuon(theMuon);
        }
    }

    // ham hien thi danh sach
    public void hienThiDanhSachTraCuoiThang() {
        System.out.println("\n=== SINH VIEN TRA SACH CUOI THANG ===");
        
        int dem = 0;
        for (TheMuon the : ds150) {
            if (the.getHanTra().getDate() >= 28) {
                dem++;
                System.out.println(dem + ". " + the.hoTen150 + " - Sach: " + the.getTenSach());
            }
        }
        
        if (dem == 0) {
            System.out.println("Khong co ai tra sach cuoi thang!");
        }
        System.out.println("=====================================\n");
    }

    // ham hien thi danh sach tat ca sinh vien
    public void hienThiDanhSachSinhVien() {
        System.out.println("\n=== DANH SACH TAT CA SINH VIEN ===");
        
        if (ds150.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            for (int i = 0; i < ds150.size(); i++) {
                System.out.println("\n--- Sinh vien thu " + (i + 1) + " ---");
                ds150.get(i).hienThiThongTin();
            }
        }
        System.out.println("===================================\n");
    }
}