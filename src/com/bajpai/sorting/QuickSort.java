package com.bajpai.sorting;

import java.util.Scanner;

public class QuickSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		quickSort(a, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}

	public static void quickSort(int[] a, int l, int r) {
		if (l < r) {
			int pivot = partitionLeft(a, l, r);

			quickSort(a, l, pivot - 1);
			quickSort(a, pivot + 1, r);
		}

	}

	private static int partition(int[] a, int l, int r) {
		int pivot = r;
		int i = l;

		for (int j = l; j <= r - 1; j++) {
			if (a[pivot] > a[j]) {
				swap(a, i, j);
				i++;
			}
		}

		swap(a, i, pivot);

		return i;
	}

	private static int partitionLeft(int[] a, int l, int r) {
		int pivot = l;
		int i = r;
		for (int j = i; j > l; j--) {
			if (a[pivot] < a[j]) {
				swap(a, i, j);
				i--;
			}
		}
		swap(a, i, pivot);
		return i;
	}
	
	public static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
