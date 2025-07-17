package btvn1;
import java.util.Scanner;

public class Bai6 {
    public static Scanner in = new Scanner(System.in);
    String name;
    byte age;
    double dTB;
    public static int nhapSoLuong(){
        System.out.print("Nhap so luong sinh vien: ");
        int n = in.nextInt();
        return n;
    }
    public static void nhapThongTin(Bai6 a[], int n){
        for(int i = 0; i < n; i++)
        {
            System.out.println("Sinh vien " + (i + 1) + " :");
            a[i] = new Bai6();
            System.out.print("Nhap ten: ");
            in.nextLine();
            a[i].name = in.nextLine();
            System.out.print("Nhap tuoi: ");
            a[i].age = in.nextByte();
            System.out.print("Nhap diem trung binh: ");
            a[i].dTB = in.nextDouble();
            System.out.println("-------------------------------------------------------");
        }
    }
    public static void inThongTin(Bai6 a)
    {
        System.out.println("Ten: " + a.name);
        System.out.println("Tuoi: " + a.age);
        System.out.println("Diem trung binh: " + a.dTB);
    }
    public static double diemTrungBinh(Bai6 a[], int n){
        double sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += a[i].dTB;
        }
        double temp = sum / n;
        return temp;
    }
    public static void timMax(Bai6 a[], int n){
        double temp = a[0].dTB;
        int pos = 0;
        for(int i = 1; i < n; i++){
            if(temp < a[i].dTB)
            {
                temp = a[i].dTB;
                pos = i;
            }
        }
        System.out.println("Sinh vien co diem cao nhat la: " + a[pos].name);
    }
    public static void main(String[] args) {
        int n = nhapSoLuong();
        Bai6 a[] = new Bai6[n];
        nhapThongTin(a,n); 
        System.out.println("Diem trung binh ca lop la: " + diemTrungBinh(a,n));
        timMax(a,n);
    }
}
