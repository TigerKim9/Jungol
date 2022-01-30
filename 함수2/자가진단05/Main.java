package 함수2.자가진단05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(Math.round(3.54354)); 	// 반올림
		System.out.println(Math.ceil(3.14354)); 	//올림 
		System.out.println(Math.floor(3.14354)); 	// 내림
		
		System.out.println();
		
		System.out.println(Math.round(3.54354 * 10) /10.0); 	// 둘째자리 반올림
		System.out.println(Math.ceil(3.14354 * 10) / 10.0); 	//둘째자리 올림 
		System.out.println(Math.floor(3.14354 * 10) / 10.0); 	// 둘째자리 내림
		
		System.out.println();
		
		System.out.println(Math.round(3.54354 * 100) / 100.0); 	// 셋째자리 반올림
		System.out.println(Math.ceil(3.14354 * 100) / 100.0); 	//셋째자리 올림 
		System.out.println(Math.floor(3.14354 * 100) / 100.0); 	// 셋째자리 내림
		
		
		
//		double area = sc.nextDouble();
		
//		double radius = getRadiusFromArea(area);
		
//		System.out.printf("%.2f", radius);
		
		
		
//		sc.close();
	}

	// 매개변수 : area, 원의 넓이 <-- 메소드의 입력값
	// 리턴 값 : double, 반지름 < -- 메소드의 출력값(결과값)
	private static double getRadiusFromArea(double area) {
		return Math.sqrt((area)/ 3.14); // Math.sqrt = 루트를 뜻하는 Math함수
		
	}

}
