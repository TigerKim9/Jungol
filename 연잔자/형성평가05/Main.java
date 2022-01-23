package 연잔자.형성평가05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int minsutall = sc.nextInt();
		int minsuweight = sc.nextInt();
		int giyontall = sc.nextInt();
		int giyonweight = sc.nextInt();
		
		if(minsutall > giyontall && minsuweight > giyonweight) {
			System.out.println(1);
		}else {
			System.out.println(0);			
		}
		
		sc.close();
	}

}
