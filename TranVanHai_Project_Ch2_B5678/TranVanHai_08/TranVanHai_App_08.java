package TranVanHai_08;

import java.util.Scanner;

public class TranVanHai_App_08 {
    public static void main(String[] args) {
    	System.out.print("Nhap so luong phan tu mang : ");
		Scanner b = new Scanner(System.in);
        
		int n = b.nextInt();
        int[] arr = new int[n];
        int tong = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = b.nextInt();
            tong += arr[i];
        }
        float d = (float)tong / n;
        System.out.println("Trung binh cong cua "+n +" so nguyen duong da nhap la : "+d);
    }
}
