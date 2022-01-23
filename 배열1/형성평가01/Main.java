package 배열1.형성평가01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char []	arr = new char[10];
		
		
		
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
		}
		for (int j = 1; j <= 10; j++) {
			System.out.print(arr[arr.length - j] + " ");
		}
	
		sc.close();
	}

}
