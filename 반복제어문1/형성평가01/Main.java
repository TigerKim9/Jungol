package 반복제어문1.형성평가01;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

	 int num, i = 1;
     num = sc.nextInt();
    
     while (i <= num)
     {
      System.out.print(i + " ");
      i++;
     }
     sc.close();
 }

		
}


