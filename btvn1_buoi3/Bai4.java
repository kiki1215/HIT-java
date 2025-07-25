package btvn1_buoi3;

public class Bai4 {
    public static int fibonacci(int n){
        if(n== 0) return 0;
        if(n == 1) return 1;
        int a = 0, b =1, c =0;
        for(int i = 2 ; i <=n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        for(int i = 0; i <= n; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        int sum = 0;
        for(int i = 0; i <= n ; i++){
            if(i % 2 == 1){
                sum += fibonacci(i);
            }
        }
        System.out.println("Tong cac so fibonacci le trong day la: " + sum);
    }
}
