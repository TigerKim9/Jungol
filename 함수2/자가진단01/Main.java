package 함수2.자가진단01;

import java.util.Scanner;

public class Main {
	public static void call(int[] arr) {

		int temp;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					temp = arr[j];

					arr[j] = arr[i];

					arr[i] = temp;

				}

			}

		}

		for(int i=0;i<arr.length;i++) {

			System.out.print(arr[i]+" ");

		}

	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();

		}

		call(arr);
		
		
		sc.close();
	}

}
