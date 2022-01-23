package 배열2.자가진단01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char [] arr = new char[100];
		char ch;
		for (int i = 0; i < arr.length; i++) {
			ch = sc.next().charAt(0);
			arr[i] = ch;
			if(ch < 'A' || ch> 'Z') break;
			
			arr[ch-'A']++;
		}
		for (int i = 0; i < 26; i++) {
			if(arr[i] > 0) {
				System.out.printf("%c : %d\n",('A' +i), arr[i]);
			}
			
		}
		sc.close();
		
	}

}
///////////////////못풀었음