package Bai9_Thuvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
    // thuoc tinh
    private int soMuon150;
    private Date ngayMuon150;
    private Date hanTra150;
    private String soHieu150;
    private String tenSach150;

    // phuong thuc
    // ham khoi tao khong doi so
    public TheMuon() {

    }

    // ham khoi tao co doi so
    public TheMuon(int soMuon, Date ngayMuon, String soHieu) {
        this.soMuon150 = soMuon;
        this.ngayMuon150 = ngayMuon;
        this.soHieu150 = soHieu;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("\tNhap so muon: ");
        soMuon150 = sc.nextInt();
        sc.nextLine();

        System.out.print("\tNhap ngay muon (dd-MM-yyyy): ");
        String strNgayMuon = sc.nextLine();
        ngayMuon150 = strToDate(strNgayMuon);
        
        System.out.print("\tNhap ngay tra (dd-MM-yyyy): ");
        String strNgayTra = sc.nextLine();
        hanTra150 = strToDate(strNgayTra);

        System.out.print("\tNhap so hieu: ");
        soHieu150 = sc.nextLine();

        System.out.print("\tNhap ten sach: ");
        tenSach150 = sc.nextLine();
    }

    private Date strToDate(String strDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        try {
            return sdf.parse(strDate);
        } catch (ParseException e) {
            System.out.println("\tLoi dinh dang ngay!");
            return new Date();
        }
    }

    // ham hien thi
    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("  So phieu muon: " + soMuon150);
        System.out.println("  Ngay muon: " + ngayMuon150);
        System.out.println("  Han tra: " + hanTra150);
        System.out.println("  So hieu: " + soHieu150);
        System.out.println("  Ten sach: " + tenSach150);
    }

    // ham lay ra thong tin ve han tra
    public Date getHanTra() {
        return hanTra150;
    }

    // ham lay ra thong tin ve ten sach
    public String getTenSach() {
        return tenSach150;
    }
}