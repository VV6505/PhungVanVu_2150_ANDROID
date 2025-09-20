package Bai3_TaiLieu;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSach {
    private ArrayList<TaiLieu> dstl150;
    
    public QLSach() {
        dstl150 = new ArrayList<TaiLieu>(10);
    }

    public void themTaiLieu(TaiLieu tl) {
        dstl150.add(tl);
    }
   
    public void nhapDanhSach(Scanner sc) {
        int chon;
        String dung;
        TaiLieu tl;

        do {
            System.out.print("Chon loai tai lieu (1-Sach; 2-Tap chi; 3-Bao): ");
            chon = sc.nextInt();
            sc.nextLine();
            
            switch (chon) {
                case 1:
                    tl = new Sach();
                    break;
                case 2:
                    tl = new Tapchi();
                    break;
                case 3:
                    tl = new Bao();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    return;
            }
            
            tl.nhapThongTin(sc);
            themTaiLieu(tl);
            
            System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
            dung = sc.nextLine();
        } while(dung.equals("c"));
    }        
    
    public void timKiemTheoMa(String maTL) {
        boolean tim = false;
        for (TaiLieu tl : dstl150) {
            if (maTL.equals(tl.getMaTaiLieu())) {
                tl.hienThiThongTin();
                System.out.println("-----------------------");
                tim = true;
            }
        }
        if (!tim) {
            System.out.println("Không tìm thấy tài liệu với mã: " + maTL);
        }
    }
    
    public void timKiemLoaiTL(String loai) {
        for (TaiLieu tl : dstl150) {
            if (loai.equals("Sach") && (tl instanceof Sach)) {
                tl.hienThiThongTin();
            } else if (loai.equals("Tapchi") && (tl instanceof Tapchi)) {
                tl.hienThiThongTin();
            } else if (loai.equals("Bao") && (tl instanceof Bao)) {
                tl.hienThiThongTin();
            }
        }
    }
    
    public void hienThiTatCa() {
        if (dstl150.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (TaiLieu tl : dstl150) {
            tl.hienThiThongTin();
            System.out.println("----------------------------");
        }
    }        
}