package 배열1.형성평가02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[5];
		int cnt = 0;
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			cnt++;
			if(cnt == 1) {
				sum += arr[i];
			}
			if(cnt ==3) {
				sum +=arr[i];
			}
			if(cnt == 5){
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}

}
