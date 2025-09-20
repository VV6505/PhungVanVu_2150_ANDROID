package Bai2_CanBo;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> dscb150;

    public QLCB() {
        dscb150 = new ArrayList<CanBo>(10);
    }

    public void themCanBo(CanBo cb) {
        dscb150.add(cb);
    }

    public void nhapDanhSach(Scanner sc) {
        System.out.print("Nhap vao so luong can bo: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap thong tin chi tiet:");
        for (int i = 0; i < n; i++) {
            System.out.println("Lan nhap thu " + (i + 1) + ":");
            System.out.print("Chon can bo (1-Cong nhan; 2-Ky su; 3-Nhan vien): ");
            int chon = sc.nextInt();
            sc.nextLine();

            CanBo cb = new CanBo();
            switch (chon) {
                case 1:
                    cb = new CongNhan();
                    break;
                case 2:
                    cb = new KySu();
                    break;
                case 3:
                    cb = new NhanVien();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    return;
            }

            cb.nhapThongTin(sc);
            themCanBo(cb);
        }
    }

    public void timKiemTheoTen(String hoTen) {
        boolean tim = false;
        for (CanBo cb : dscb150) {
            if (hoTen.equals(cb.getHoTen())) {
                cb.hienThiThongTin();
                System.out.println("--------------------");
                tim = true;
            }
        }
        if (!tim) {
            System.out.println("Không tìm thấy cán bộ tên: " + hoTen);
        }
    }
}