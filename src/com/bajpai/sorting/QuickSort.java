package com.bajpai.sorting;
import java.util.Iterator;
import java.util.Scanner;

public class QuickSort {
	// 0 - 9
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

	// So simply all element before i is less than pivot and at last pivot can
	// replace with i
	// We choose pivot as last element
	public static void quickSort(int[] a, int l, int r) {
		if (l < r) {
			int pivot = partitionLeft(a, l, r);

			quickSort(a, l, pivot - 1);
			quickSort(a, pivot + 1, r);
		}

	}

	private static int partition(int[] a, int l, int r) {
		int pivot = r;
		int i = l; // i start from -1 index

		for (int j = l; j <= r - 1; j++) {
			if (a[pivot] > a[j]) {
				// Swap
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				i++;
			}
		}

		int t = a[i];
		a[i] = a[pivot];
		a[pivot] = t;

		return i;
	}

	// Start index as partition
	private static int partitionLeft(int[] a, int l, int r) {
		int pivot = l;
		int i = r;
		for (int j = i; j > l; j--) {
			if (a[pivot] < a[j]) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				i--;
			}
		}
		int t = a[i];
		a[i] = a[pivot];
		a[pivot] = t;

		return i;
	}
}
