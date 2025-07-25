package btvn1_buoi3;

public class Bai5 {
    public static void taoMTXO(int[][] a, int n){
        int num = 1;
        int trai = 0, phai = n -1,
        tren = 0, duoi = n - 1;
        while(num <= n * n){
            for(int i = trai; i <= phai; i++){
                a[tren][i] = num++;
            }
            tren++;
            for(int i = tren; i <= duoi; i++){
                a[i][phai] = num++;
            }
            phai--;
            for(int i = phai; i >= trai; i--){
                a[duoi][i] = num++;
            }
            duoi--;
            for(int i = duoi; i >= tren; i--){
                a[i][trai] = num++;
            }
            trai++;
        }
    }
    public static void inMang(int[][] a){
        for(int[] i : a){
            for(int l : i){
                System.out.printf("%-4d", l);
            }
            System.out.println();
        }
    }
    public static void tinhDuongCheo(int[][] a, int n){
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n; i++){
            sum1 += a[i][i];
            sum2 += a[i][n - 1 - i];
        }
        System.out.println("Tong cac phan tu duong cheo chinh la: " + sum1);
        System.out.println("Tong cac phan tu duong cheo phu: " + sum2);
    }
    public static void main(String[] args) {
        System.out.print("Nhap kich thuoc ma tran xuan oc: ");
        int n = new java.util.Scanner(System.in).nextInt();
        int[][] a = new int[n][n];
        taoMTXO(a,n);
        inMang(a);
        tinhDuongCheo(a,n);
    }
}
