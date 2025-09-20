package Bai1_PhanSo;

import java.util.Scanner;

public class PhanSo {
    private int tuso150;
    private int mauso150;
    
    public PhanSo() {
        tuso150 = 0;
        mauso150 = 1;
    }
    
    public PhanSo(int tuso, int mauso) {
        this.tuso150 = tuso;
        this.mauso150 = mauso;
    }

    public int getTuSo() {
        return tuso150;
    }

    public int getMauSo() {
        return mauso150;
    }
    
    public void NhapPS(Scanner sc) {
        int a, b;
        do {
            System.out.print("Nhap tu so: ");
            a = sc.nextInt();
            System.out.print("Nhap mau so: ");
            b = sc.nextInt();
            
            if (b == 0)
                System.out.println("Mau so phai khac 0. Hay nhap lai!");
            else {
                tuso150 = a;
                mauso150 = b;
            }
        } while (b == 0);
    }
    
    public void HienThiPS() {
        if (tuso150 * mauso150 < 0) {
            System.out.println("\t-" + Math.abs(tuso150) + "/" + Math.abs(mauso150));
        } else {
            System.out.println("\t" + Math.abs(tuso150) + "/" + Math.abs(mauso150));
        }
    }
    
    public PhanSo CongPS(PhanSo ps) {
        int a = tuso150 * ps.mauso150 + ps.tuso150 * mauso150;
        int b = mauso150 * ps.mauso150;
        
        return new PhanSo(a, b);
    }
    
    public PhanSo TruPS(PhanSo ps) {
        int a = tuso150 * ps.mauso150 - ps.tuso150 * mauso150;
        int b = mauso150 * ps.mauso150;
        
        return new PhanSo(a, b);
    }
        
    public PhanSo NhanPS(PhanSo ps) {
        int a = tuso150 * ps.tuso150;
        int b = mauso150 * ps.mauso150;
        
        return new PhanSo(a, b);
    }
         
    public PhanSo ChiaPS(PhanSo ps) {
        int a = tuso150 * ps.mauso150;
        int b = mauso150 * ps.tuso150;
        
        return new PhanSo(a, b);
    }
    
    private int timUSCLN(int a, int b) {
        while (a % b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }       
        return b;
    }
    
    public boolean KiemTraToiGian() {
        return timUSCLN(tuso150, mauso150) == 1;
    }
    
    public void ToigianPS() {
        int x = timUSCLN(tuso150, mauso150);
        
        tuso150 /= x;
        mauso150 /= x;
    }
    
    public int getUCLN() {
        return timUSCLN(tuso150, mauso150);
    }
}