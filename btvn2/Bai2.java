package btvn;
import java.util.Scanner;
public class Bai2 {
    public static Scanner in = new Scanner(System.in);
    public static int nhapSoPT(){
        int n;
        do{
            System.out.println("Nhap so phan tu trong mang: ");
            n = in.nextInt();
            if(n <= 0)
            System.out.println(" Ban da nhap loi vui long nhap lai!");
        }while(n <= 0);
        return n;
    }
    public static void nhapMang(int a[], int n){
        for(int i = 0; i < n; i++)
        {
            a[i] = in.nextInt();
        }
    }
    public static void xuatMang(int a[]){
        for(int x : a){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int n = nhapSoPT();
        int a[] = new int[n];
        nhapMang(a,n);
        if(n == 1){
            System.out.println("Mang duoc giu nguyen");
            xuatMang(a);
        }
    }
}
