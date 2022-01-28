package 함수1.형성평가03;

import java.util.Scanner;

public class Main {
	
	static int sum(int a) {
		return (a*(a+1))/2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(sum(a));
		sc.close();
	}

}
