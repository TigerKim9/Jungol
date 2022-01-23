package 반복제어문1.형성평가05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("Base = ");
			int base = sc.nextInt();
			System.out.print("Height = ");
			int height = sc.nextInt();
			double width = (double)(base * height) / 2;
			System.out.printf("Triangle width = %.1f\n",width);
			System.out.print("Continue? ");
			char ans = sc.next().charAt(0);
//			if(ans == 'Y' && ans == 'y') continue;
			if(ans != 'Y' && ans != 'y') break;
			
			
		}
		sc.close();
		
	}

}
