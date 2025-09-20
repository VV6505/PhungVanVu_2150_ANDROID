package Bai7_Hocsinh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    // thuoc tinh
    protected String hoTen150;
    protected Date ngaySinh150;
    protected String queQuan150;

    // phuong thuc
    // ham khoi tao khong doi so
    public Nguoi() {

    }

    // ham khoi tao co doi so
    public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
        this.hoTen150 = hoTen;
        this.ngaySinh150 = ngaySinh;
        this.queQuan150 = queQuan;
    }

    // ham nhap vao thong tin
    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ho ten: ");
        hoTen150 = sc.nextLine().trim();

        System.out.print("\tNhap ngay sinh (dd-MM-yyyy): ");
        String strDate = sc.nextLine().trim();
        ngaySinh150 = strToDate(strDate);

        System.out.print("\tNhap que quan: ");
        queQuan150 = sc.nextLine().trim();
    }

    private Date strToDate(String strDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false); // Không cho phép parse ngày không hợp lệ

        try {
            return sdf.parse(strDate);
        } catch (ParseException e) {
            System.out.println("\tLoi dinh dang ngay thang! Vui long nhap lai theo dinh dang dd-MM-yyyy");
            return new Date(); // Gán ngày mặc định nếu có lỗi
        }
    }

    // ham hien thi
    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen150);
        System.out.println("\tNgay sinh: " + ngaySinh150);
        System.out.println("\tQue quan: " + queQuan150);
    }

    // ham lay ra que quan
    public String getQueQuan() {
        return queQuan150;
    }

    // ham lay ra thong tin ve ngay sinh
    public Date getNgaySinh() {
        return ngaySinh150;
    }
}