package 반복제어문3.형성평가07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char a = 65;
		
		for(int i = 0; i < n ; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(a);
				a++;
			}
				System.out.println(i);
			
		}
		sc.close();
	}

}
