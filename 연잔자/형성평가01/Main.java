package 연잔자.형성평가01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		int com = sc.nextInt();
		
		int sum = kor + eng + mat + com;
		int avg = sum / 4;
		
		System.out.println("sum " + sum);
		System.out.println("avg " + avg);
		
		sc.close();
	}

}
