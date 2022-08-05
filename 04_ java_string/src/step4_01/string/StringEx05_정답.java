package step4_01.string;


public class StringEx05_정답 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 34세
		
		System.out.println("문제 1) 나이 출력");
		System.out.println("정답 1) ");
		String num1 = jumin.substring(0, 2);
		char num2 = jumin.charAt(7);
		int age;
		int year = Integer.parseInt(num1);
		
		if ( 22 < year) {
			age = 2022 - (year + 1900) + 1;
			System.out.println(age);
		}
		
		
		System.out.println();
		
		
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		
		System.out.println("성별 출력");
		if (num2 == '1') System.out.println("남성");
		else if (num2 == '2') System.out.println("여성");

		
	}

}
