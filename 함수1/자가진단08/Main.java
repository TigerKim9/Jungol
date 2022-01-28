package 함수1.자가진단08;

import java.util.Scanner;

public class Main {
	
	static void gugudan(int a, int b) {
		if(a < b) {
			for (int i = a; i <= b; i++) {
				System.out.printf("== %ddan ==",i);
				System.out.println();
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d * %d = %2d",i,j,i*j);
					System.out.println();
				}
				System.out.println();
				
			}
			return;
		}else {
			for (int i = b; i <= a; i++) {
				System.out.printf("== %ddan ==",i);
				System.out.println();
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d * %d = %2d",i,j,i*j);
					System.out.println();
				}
				System.out.println();
				
			}
			return;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		gugudan(a,b);
		sc.close();
	}

}
