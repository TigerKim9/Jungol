package 연잔자.형성평가03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int garo = sc.nextInt();
		int sero = sc.nextInt();
		
		int width = garo + 5;
		int length = sero * 2;
		int area = width * length;
		
		System.out.println("width = " + width);
		System.out.println("length = " + length);
		System.out.println("area = " + area);
		
		sc.close();
	}

}
