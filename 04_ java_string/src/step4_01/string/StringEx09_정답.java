package step4_01.string;

import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

public class StringEx09_정답 {

	public static void main(String[] args) {
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int num = ran.nextInt(4) + 1;
		String temp;
		for (int i = 0; i < 4; i++) {
			temp = words[num];
			words[num] = words[i];
			words[i] = temp;
		}
		
		int i = 0;
		while (true) {
			if (i == 4) {
				break;
			}
			
			System.out.println("문제 : " + words[i]);
			System.out.print("입력 : ");
			String answer = scan.next();
			
			if (words[i].equals(answer)) {
				i++;
			}
			
			else continue;
			
		}
		
		

	}

}
