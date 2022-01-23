package 배열1.자가진단07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		int maxhun = 0; // 100 미만의 수 중 가장 큰 수
		int minhun = 10001; // 100 이상의 수중 가장 작은 수

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] >= 1 && arr[i] < 10000) {
				if(arr[i] < 100) {
					if(maxhun < arr[i]) {
						maxhun = arr[i];
					}
				}else if(arr[i] >= 100) {
					if(minhun > arr[i]) {
						minhun = arr[i];
					}
				}
			}
		}
		if(maxhun == 0) maxhun = 100;
		if(minhun == 10001) minhun = 100;
				
				
		System.out.print(maxhun + " " + minhun);
		sc.close();

	}

}
