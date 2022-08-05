package step4_01.string;

/*
 *
 * 문자열 관련 데이터 형 변환 (casting)
 * 
 */

public class StringEx04 {

	public static void main(String[] args) {
		// [1] 문자열 > 숫자 형 변환
		String birth = "2022";
		System.out.println(birth + 1); // 20221
		// Integer.parseInt("문자열"); 메서드를 사용하여 형변환 한다.only 숫자만 있을 때만 가능
		int nBirth = Integer.parseInt(birth); 
		System.out.println(nBirth + 1); //2023
		System.out.println();
	
		// [2] 숫자 > 문자열 형 변환
		int salary = 2000000;
		
		// 2-1) + "" 사용 **
		String str1 = salary + "";
		System.out.println(str1 + 50000);
		
		// 2-2) Integer.toString(숫자) 사용 **
		String str2 = Integer.toString(salary);
		System.out.println(str2 + 50000);
		
		
		// 2-3) String.valueOf(숫자) 사용
		String str3 = String.valueOf(salary);
		System.out.println(str3 + 50000);
		System.out.println();
		
		// 참고) 구글에서 ASCII 코드표 검색 ( 65 : 'A' , 97 : 'a' 상식적으로 외우기)
		// 문자 > 숫자 (문자열 x)
		char ch1 = 'a';
		int n1 = (int)ch1;
		
		System.out.println(ch1 + " / " + n1);
		
		// 숫자 > 문자
		int n2 = 65;
		char ch2 = (char)n2;
		
		System.out.println(ch2 + " / " + n2);
		
		System.out.println((int)'s' + 3);
		System.out.println((char)(65 + 10));
		
		
		
		
		
		
	}

}
