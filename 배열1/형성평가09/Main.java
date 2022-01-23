package 배열1.형성평가09;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] num = new int[100];
		
		int cnt = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if(num[i] == 0) break;
			cnt++;
			
			
			
		}
		System.out.println(cnt);
		for (int i = 0; i < cnt; i++) {
			if(num[i] % 2 == 0) {
				System.out.print((num[i] / 2) + " ");
			}else if(num[i] % 2 != 0) {
				System.out.print(num[i] * 2 + " ");
			}
		}
		
		
		
		sc.close();
	}

}
