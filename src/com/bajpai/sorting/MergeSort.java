package com.bajpai.sorting;
import java.util.Scanner;

public class MergeSort {
	// 0 - 9
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		mergeSort(a, 0, n-1);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}
	
	public static void sort(int[] a, int m, int i, int j) {
		int n1 = m - i + 1;
		int n2 = j - m;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for (int k = 0; k < n1; k++) {
			left[k] = a[i + k];
		}
		
		for (int k = 0; k < n2; k++) {
			right[k] = a[m + 1 + k];
		}

		// comparison
		int l = 0;
		int r = 0;
		int count = i;
		
		while(n1 != 0 && n2 != 0) {
			if(left[l] < right[r]) {
				a[count++] = left[l++];
				n1--;
			} else {
				a[count++] = right[r++];
				n2--;
			}
		}
		while(n1 !=0) {
			a[count++] = left[l++];
			n1--;
		}

		while(n2 !=0) {
			a[count++] = right[r++];
			n2--;
		}		
	}
	
	public static void mergeSort(int[] a, int i, int j) {
		// n = 9, i = 0, j = 8
		if(i==j) return;
		
		int m = (i + j)/2;	// 
		mergeSort(a, i, m);
		mergeSort(a, m + 1, j);
		
		sort(a, m, i, j);
	}
}
