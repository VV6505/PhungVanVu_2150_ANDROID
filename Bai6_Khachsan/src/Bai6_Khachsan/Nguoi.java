package Bai6_Khachsan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    // thuoc tinh
    protected String hoTen150;
    protected Date ngaySinh150;
    protected int CMND150;

    // phuong thuc
    // ham khoi tao khong doi so
    public Nguoi() {

    }

    // ham khoi tao co doi so
    public Nguoi(String hoTen, Date ngaySinh, int CMND) {
        this.hoTen150 = hoTen;
        this.ngaySinh150 = ngaySinh;
        this.CMND150 = CMND;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ho ten: ");
        hoTen150 = sc.nextLine();
        System.out.print("\tNhap ngay sinh: ");
        String strDate = sc.nextLine();
        ngaySinh150 = strToDate(strDate);
        System.out.print("\tNhap CMND: ");
        CMND150 = sc.nextInt();
    }

    private Date strToDate(String strDate) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = sdf.parse(strDate);
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay thang!");
        }

        return date;
    }

    // ham hien thi
    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen150);
        System.out.println("\tNgay sinh: " + ngaySinh150);
        System.out.println("\tCMND: " + CMND150);
    }

    // ham lay ra thong tin CMND
    public int getCMND() {
        return CMND150;
    }
}