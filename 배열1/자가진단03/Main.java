package 배열1.자가진단03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char [] arr = new char[10];
		char a;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			a = sc.next().charAt(0);
			cnt++;
			
			if(cnt == 1) {
				System.out.print(a + " ");
			}else if(cnt == 4) {
				System.out.print(a + " ");
			}else if(cnt == 7) {
				System.out.println(a + " ");
			}
		}
		sc.close();
	}

}
