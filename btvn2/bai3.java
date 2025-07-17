package btvn;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int n;
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Nhap kich thuoc ma tran xoan: ");
            n = in.nextInt();
        }
        int a[][] = new int[n][n];
        int value = 1;
        int top = 0, bottom = n -1;
        int left = 0, right = n - 1;
        while(value <= (n * n)){
            for(int i = left;i <= right;i++){
                a[top][i] = value++;
            }
            top++;
            for(int i = top; i <= bottom;i++){
                a[i][right] = value++;
            }
            right--;
            for(int i = right; i >= left; i--){
                a[bottom][i] = value++;
            }
            bottom--;
            for(int i = bottom; i >= top; i--){
                a[i][left] = value ++;
            }
            left++;
        }
        for (int[] row : a) {
            for (int val : row) {
            System.out.printf("%3d", val);
            }
            System.out.println();
        }
    }
}
