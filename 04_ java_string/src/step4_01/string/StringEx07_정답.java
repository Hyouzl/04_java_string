package step4_01.string;


public class StringEx07_정답 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
				
		
		String[] student = str.split(",");
		
		for (int i = 0; i < 3; i++) {
			String[] information = student[i].split("/");
			name[i] = information[0];
			score[i] = Integer.parseInt(information[1]);
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(name[i]);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(score[i]);
		}
	}
}
