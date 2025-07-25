package btvn1_buoi3;

public class Bai1 {
    public static java.util.Scanner in = new java.util.Scanner(System.in);
    public static int[] taoMang(){
        System.out.print("Nhap so phan tu mang: ");
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = (int) (Math.random() * 100);
        }
        return a;
    }
    public static void tinhCL(int a[]){
        int sumC = 0, sumL = 0;
        for(int i : a){
            if(i % 2 == 0){
                sumC += i;
            }else
                sumL += i;
        }
        System.out.println("Tong ca so chan la: " + sumC);
        System.out.println("Tong cac so le la: " + sumL);
    }
    public static boolean checkSNT(int i){
        if(i == 2 ) return true; 
        if(i == 1 || i % 2 == 0) return false;
        for(int c = 3; c < Math.sqrt(i); c+=2){
            if(i % c == 0)
            return false;
        }
        return true;
    }
    public static void soLuongSNT(int[] a){
        int count = 0;
        for(int i: a){
            if(checkSNT(i))
            count++;
        }
        System.out.println("So luong so nguyen to trong mang la: " + count);
    }
    public static void inMang(int[] a){
        System.out.println("Mang cua ban la:");
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a = taoMang();
        inMang(a);
        tinhCL(a);
        soLuongSNT(a);
    }
}
