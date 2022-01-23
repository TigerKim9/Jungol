package 함수2.자가진단04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double area = sc.nextDouble();
		
		double radius = getRadiusFromArea(area);
		
		System.out.printf("%.2f", radius);
		
		
		
		sc.close();
	}

	// 매개변수 : area, 원의 넓이 <-- 메소드의 입력값
	// 리턴 값 : double, 반지름 < -- 메소드의 출력값(결과값)
	private static double getRadiusFromArea(double area) {
		return Math.sqrt((area)/ 3.14); // Math.sqrt = 루트를 뜻하는 Math함수
		
	}

}
