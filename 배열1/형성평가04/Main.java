package 배열1.형성평가04;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[100];
		int n;
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			n =sc.nextInt();
			if(n == -1) {
				break;
			}
			arr[i] = n;
			cnt++;
		}
		if(cnt < 3) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(arr[i] + " ");
			}
		}else if(cnt >= 3) {
			for(int i = 1; i <= 3; i++) {
				System.out.print(arr[cnt-1 -3+ i] + " ");
			}
			
		}
		sc.close();
	}

}
