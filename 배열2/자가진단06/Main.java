package 배열2.자가진단06;

import java.util.Scanner;

/*
85 67 95 65
80 95 86 56
100 98 67 86
95 76 84 65
67 86 90 76
 * 
 * 
 */


//5명 학생의 국어 영어 수학 과학 4과목의 점수를 입력 받아서 
//각 개인별로 평균이 80 이상이면“합격” 그렇지 않으면“불합격”을 출력하고
//합격한 사람의 수를 출력하는 프로그램을 작성하시오.
public class Main {
	public static void main(String[] args) {
		
		int [][] score = new int[5][4];// 5명 학생의 4개 과목 점수
		
		Scanner sc = new Scanner(System.in);
		
		
		for (int stu = 0; stu < score.length; stu++) {
			for(int subj = 0; subj < score[stu].length; subj++) {
				score[stu][subj] = sc.nextInt();
			}
		}
		
		int success = 0; //합격한 학생 수
		
		
		//학생별로 점수 계산
		for(int stu = 0; stu < score.length; stu++) {
			int sum = 0;
			double avg = 0.0;
			
			//총점 구하기
			for(int subj = 0; subj < score[stu].length; subj++) {
				sum += score[stu][subj];	//stu번째 학생의 과목점수 누적 합산
			}
			avg = (double)sum / score[stu].length;
			
			//System.out.println(stu + " : " + avg);
		
			if(avg >= 80) {
				System.out.println("pass");
				success++; //합격자 수 1 증가
			}else {
				System.out.println("fail");
			}
			
	}
		System.out.println("Successful : " + success);
		sc.close();

	}// end main()
}// end class
