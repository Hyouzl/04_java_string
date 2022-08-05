package step4_01.string;

// # 정렬 (사전순으로 정렬해 보시오.)

public class StringEx13_정답 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		
		String temp;
		for (int i = 0; i < names.length - 1; i++) {
			
			for (int j = i + 1; j <names.length; j++) {
				if (names[i].compareTo(names[j]) > 0) {
						temp = names[j];
						names[j] = names[i];
						names[i] = temp;
					}
				}
			}
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i] + " ");
			}
		}
	}
	
