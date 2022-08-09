package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 속 숫자검사
 * 
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */

public class StringEx15_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String text = scan.next();
		char ch;
		int cnt = 0;
		int i;
		for (i = 0; i < text.length(); i++) {
			ch = text.charAt(i);
			if ( (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) ) {
					cnt++;
			}
		 
		}
		
		if (cnt == text.length()) {
			System.out.println("문자만 있다.");
		}
		else if (cnt > 0 && cnt < text.length()) {
			System.out.println("문자와 숫자가 섞여있다.");
		}
		else if (cnt == 0) {
			System.out.println("숫자만 있다.");
		}
		
		}

	}

