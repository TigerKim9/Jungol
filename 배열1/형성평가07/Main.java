package 배열1.형성평가07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 100;
		int [] num = new int[n];
		

		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
			if(num[i] > 1000) continue;
			if(num[i] == 999) {
				//break가 나오면 입력한 수까지만 배열로 제한하면..?
				n = i;
				break;
			}
			}
		
		
		int max = num[0];
		int min = num[0];
		
		for (int i = 1; i < n; i++) {
			
					
			if(max < num[i]) {
				max = num[i];
			}
			
			
			if(min > num[i])
				min = num[i];
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		//문제.. 양수만 입력시 0을 입력하지 않아도 초기화된 0값이 최소값으로 나옴..
		

	}

}
