package step4_01.string;

import java.util.Random;
import java.util.Scanner;

/*

	# 영어단어 맞추기  
	
	1) 영어단어가 전부 * 로 표시된다. 
	2) 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
	3) 만약에 같은 철자가 여러개면 한번에 벗겨진다. 
	4) 전부 벗겨지거나 맞추면 종료 

*/
public class StringEx18_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int size = word.length();
		int[] check = new int[size];  // 힌트 체크를 통해서 확인할수있다.
		Random ran = new Random();
		int letter;
		int cnt = 0;
		
		while (true) {
			
			for (int i = 0; i < size; i++) {
				if(check[i] == 1) {
					cnt ++;
				}
			}
			if (cnt == size) {
				System.out.println("정답 : " + word);
				break;
			}
			
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			for (int i = 0; i < size; i++) {
				if (check[i] == 0) System.out.print("*");
				else if (check[i] == 1) System.out.print(word.charAt(i));
			}
		
			System.out.println();
			System.out.println("영어단어를 입력하세요 >>> ");
			String me = scan.next();
			
		
			
			if (word.equals(me)) {
				System.out.println("정답 : " + word);
				System.out.println("점수 : " + score);
				break;
			}
			else {
				while (true) {
					letter = ran.nextInt(size);
					if (check[letter] != 1) {
						check[letter] = 1;
						for (int i = 0; i < size; i++) {
							if (word.charAt(letter) == word.charAt(i)) {
								check[i] = 1;
								}
						}
						score -= 5;
						break;
					} 
				}
			}
			
		}

	}

}
