package step4_01.string;

import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */

public class StringEx10_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String start = "자전거";
		System.out.println("제시어 : " + start);
		
		String temp = start;
		while (true) {
		System.out.print("입력 : ");
		String str = scan.next();
	
		if( str.charAt(0) == temp.charAt(temp.length()-1)) {
			System.out.println("제시어 : " + str);
			temp = str;
		}
		
		else if (str.equals("quit")) {
			break;
		}
		
		}
	}

	}
