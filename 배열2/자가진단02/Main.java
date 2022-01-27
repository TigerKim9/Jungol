package 배열2.자가진단02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i =0;
		int[] arr = new int[10];
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			arr[i] += n / 10;
			i++;

		}
		i = 0;
		int cnt = 0;
		for (i = 0; i < arr.length; i++) {
			for(int j = 0; j < 10; j++) {
				if(arr[i] == j) {
					cnt++;
				}
				System.out.println(arr[i] + " : " + cnt);

			}
		}
		sc.close();
		// 못풀었음
	}

}
