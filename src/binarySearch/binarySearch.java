package binarySearch;

import java.util.Scanner;

public class binarySearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Array Size:");

		int arraySize = scanner.nextInt();
		int[] size = new int[arraySize];

		for (int i = 0; i < size.length; i++) {
			System.out.printf("Input Number%d：", i + 1);
			int input = scanner.nextInt();
			size[i] = input;
		}

		System.out.print("Before: ");
		for (int i = 0; i < size.length; i++) {
			System.out.print(size[i] + " ");
		}

		System.out.println();
		System.out.print("After : ");
		for (int a = arraySize; a >= 0; a--) {
			for (int k = 0; k < arraySize - 1; k++) {
				if (size[k] > size[k + 1]) {
					int j = 0;
					j = size[k];
					size[k] = size[k + 1];
					size[k + 1] = j;
				}
			}
		}
		for (int i = 0; i < size.length; i++) {
			System.out.print(size[i] + " ");
		}

		System.out.println();
		System.out.print("Search : ");

		int search = scanner.nextInt();
		int left = 0;
		int right = arraySize;
		int middle = (right + left) / 2;

		while (left < right) {
			if (search == size[middle]) {
				System.out.print(search + " is the number " + (middle + 1));
				break;
			} else if (search > size[middle]) {
				left = middle + 1;
				middle = (right + left) / 2;
			} else if (search < size[middle]) {
				right = middle - 1;
				middle = (right + left) / 2;
			}
		}
		if (left == right)
			System.out.print("error");
	}
}