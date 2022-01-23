package 반복제어문1.형성평가04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		while(true) {
			int num = sc.nextInt();

			if(num == 0)break;
			if(num % 3 == 0 || num % 5 == 0) {
				continue;
			}
			i++;
		}
		System.out.println(i);
		sc.close();
	}

}
