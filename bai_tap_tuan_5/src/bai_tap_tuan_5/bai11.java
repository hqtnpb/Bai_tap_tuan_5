package bai_tap_tuan_5;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int n;
			System.out.print("Nhap so luong phan tu mang : ");
			n = scn.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n ; i++) {
				System.out.print("Nhap vao phan tu thu "+i +" = ");
				a[i] = scn.nextInt();
			}
			System.out.println("Mang vua nhap la : ");
			for(int i=0; i<n ; i++) {
				System.out.print(a[i]+"     ");
			}
			
			System.out.println("\nMang sau khi da sap xep tang dan la : ");
			for(int i=0; i<n ; i++) {
				for(int j=i; j<n ; j++) {
					if(a[i]>a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			for(int i=0; i<n ; i++) {
				System.out.print(a[i]+"     ");
			}
		}
	}
}