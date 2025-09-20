package Bai7_Hocsinh;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
    // thuoc tinh
    private ArrayList<HocSinh> dshs150;

    // phuong thuc
    // ham khoi tao
    public QLHS() {
        dshs150 = new ArrayList<HocSinh>(10);
    }

    // ham them hoc sinh
    public void themHS(HocSinh hs) {
        dshs150.add(hs);
    }

    // ham nhap danh sach
    public void nhapDanhSachHS(Scanner sc) {
        HocSinh hs;

        System.out.print("Nhap vao so luong hoc sinh: ");
        int n = sc.nextInt();
        sc.nextLine(); // Đọc ký tự xuống dòng còn lại

        System.out.println("Nhap thong tin cho hoc sinh trong danh sach:");
        for (int i = 0; i < n; i++) {
            System.out.println("\tHoc sinh thu " + (i + 1) + " la:");

            hs = new HocSinh();
            hs.nhapThongTin(sc);

            themHS(hs);
        }
    }

    // ham hien thi
    public void hienThiDanhSach() {
        int n = dshs150.size();
        for (int i = 0; i < n; i++) {
            System.out.println("\tHoc sinh thu " + (i + 1) + " la:");
            dshs150.get(i).hienThiThongTin();
        }
    }

    // ham tim kiem thong tin
    public void timKiemThongTin(int nam, String que) {
        boolean found = false; // Biến để kiểm tra có tìm thấy hay không
        for (HocSinh hs : dshs150) {
            if ((hs.getNgaySinh().getYear() + 1900 == nam) && (que.equals(hs.getQueQuan()))) {
                hs.hienThiThongTin();
                found = true; // Đánh dấu là đã tìm thấy
            }
        }
        if (!found) {
            System.out.println("Khong co hoc sinh sinh nam " + nam + " va que " + que + ".");
        }
    }

    public void timKiemThongTin(String lop) {
        boolean found = false; // Biến để kiểm tra có tìm thấy hay không
        for (HocSinh hs : dshs150) {
            if (lop.equals(hs.getLop())) {
                hs.hienThiThongTin();
                found = true; // Đánh dấu là đã tìm thấy
            }
        }
        if (!found) {
            System.out.println("Khong co hoc sinh hoc lop " + lop + ".");
        }
    }
}