package 함수2.자가진단03;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		float f = sc.nextFloat();
		float g = sc.nextFloat();
		
		
		System.out.println(intabs(a,b));
		System.out.printf("%.2f",floatabs(f, g));
		sc.close();
		
	}
	
	
	
	
	
	public static int intabs(int a, int b) {
		if(Math.abs(a) > Math.abs(b)) {
			return a;
		}else {
			return b;
		}
	}
	
	public static float floatabs(float a, float b) {
		if(Math.abs(a) < Math.abs(b)) {
			return a;
		}else {
			return b;
		}
	}
}
