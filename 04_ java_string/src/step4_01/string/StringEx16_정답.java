package step4_01.string;

import java.util.Scanner;

/*
 * # 단어 검색
 * 
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class StringEx16_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		
		int i = 0;
		int len = word.length();
		while (true) {
			if (i + len > text.length()) {
				System.out.println("false");
				break;
			}
			else if(text.substring(i, i + len).equals(word)) {
				System.out.println("true");
				break;
			}
			else i++;
		}

	}

}
