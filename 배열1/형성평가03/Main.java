package 배열1.형성평가03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int oddsum = 0;
		int evensum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if ((i + 1) % 2 != 0) {
				oddsum += arr[i];
			} else if ((i + 1) % 2 == 0) {
				evensum += arr[i];
			}
		}
		
		System.out.println("odd : " + oddsum);
		System.out.println("even : " + evensum);
		sc.close();
	}

}
