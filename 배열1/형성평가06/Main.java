package 배열1.형성평가06;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] arr = { 'J', 'U', 'N', 'G', 'O', 'L' };
		char c = sc.next().charAt(0);
		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {

			if (c == arr[i]) {
				System.out.println(i);
				break;
			} else if (c != arr[i]) {
				cnt++;
			}
			if(cnt == arr.length) {
				System.out.println("none");
			}

		}
		sc.close();
	}

}
