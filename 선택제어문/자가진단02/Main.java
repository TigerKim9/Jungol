package 선택제어문.자가진단02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//키 몸무게 입력
		int height = sc.nextInt();
		int weight = sc.nextInt();
		
		//비만수치
		int obesity = weight + 100 - height;
		
		System.out.println(obesity);
		
		if(obesity > 0)
			System.out.println("Obesity");
		
		
		
		sc.close();

	}

}
