package learning;

import java.util.Scanner;

public class Reversearray {


			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter how many numbers do you want");
				int n = sc.nextInt();
				int arr[] = new int[n];
				System.out.println("enter ur numbers");
				for (int i = 0; i < n; i++) {
					arr[i] = sc.nextInt();
				}
				for (int i = n - 1; i >= 0; i--) {
					System.out.print(arr[i] + " ");
				}
			}

	}

