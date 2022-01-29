package 함수1.형성평가04;

import java.util.Scanner;

public class Main {
	static int mulAndhalf(int a, int b) {
		if (a > b) {
			a = (int) Math.pow(a, 2);//제곱을 구하는 수학 연산자 double을 리턴하므로 int로 형변환
			b = (int) Math.pow(b, 2);
			return a - b;
		} else {
			a = (int) Math.pow(a, 2);
			b = (int) Math.pow(b, 2);
			return b - a;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int j = sc.nextInt();
		int k = sc.nextInt();
		

		System.out.print(mulAndhalf(j,k));
		sc.close();
		
	}

}
