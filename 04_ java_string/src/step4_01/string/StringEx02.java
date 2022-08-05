package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 비교 메서드 equals();
 * 
 * - 문자열은  == 로 비교하지 않고 equals()메소드를 이용하여 비교한다.
 * 
 * */

public class StringEx02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("이름을 입력하세요 : ");
		
		String getName = scan.next();	
		
		String name = "제임스";
		
		//비교불가
//		if (name == getName) System.out.println("제임스입니다.");
//		else System.out.println("제임스가 아닙니다.");	
//		if (name.equals (getName)) System.out.println("제임스입니다.");
//		else System.out.println("제임스가 아닙니다.");	
		if (getName.equals(name)) System.out.println("제임스입니다.");
		else System.out.println("제임스가 아닙니다.");		
		
		
		
	}
}
