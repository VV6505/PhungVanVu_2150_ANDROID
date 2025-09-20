package Bai2_CanBo;

import java.util.Scanner;

public class CanBo {
    private String hoTen150;
    private String ngSinh150;
    private String gioiTinh150;
    private String diaChi150;
    
    public CanBo() {
    }
    
    public CanBo(String hoTen, String ngSinh, String gioiTinh, String diaChi) {
        this.hoTen150 = hoTen;
        this.ngSinh150 = ngSinh;
        this.gioiTinh150 = gioiTinh;
        this.diaChi150 = diaChi;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhập họ tên: ");
        hoTen150 = sc.nextLine();
        System.out.print("\tNhập ngày sinh (dd/MM/yyyy): ");
        ngSinh150 = sc.nextLine();
        System.out.print("\tNhập giới tính: ");
        gioiTinh150 = sc.nextLine();
        System.out.print("\tNhập địa chỉ: ");
        diaChi150 = sc.nextLine();
    }
    
    public void hienThiThongTin() {
        System.out.println("\tHọ tên: " + hoTen150);
        System.out.println("\tNgày sinh: " + ngSinh150);
        System.out.println("\tGiới tính: " + gioiTinh150);
        System.out.println("\tĐịa chỉ: " + diaChi150);
    }

    public String getHoTen() {
        return hoTen150;
    }
}