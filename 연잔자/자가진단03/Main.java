package 연잔자.자가진단03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(num++);
		System.out.println(++num);
		
		sc.close();
	}

}
