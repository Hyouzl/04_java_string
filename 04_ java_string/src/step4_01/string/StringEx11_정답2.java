package step4_01.string;

import java.util.Scanner;

/*
 * # 쇼핑몰 [관리자]
 * 
 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
 * 3. 아이템은 각 행의 두번째 열에 저장한다.
 *    단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결해준다.
 * 예)
 * {
 * 		{"과일", "사과/포도/"},
 * 		{"과자", "홈런볼/쪼리퐁/"},
 * 		{"음료", "콜라/"},
 * 		{"육류", "소고기/"}
 * 		...
 * 
 * 
 * } 
 */



public class StringEx11_정답2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {  //  아이템 배열 초기화
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int itemCount = 0;
		
		while(true) {

			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");
			
			System.out.print(": ");
			int sel = scan.nextInt();
			
			
			if	    (sel == 1) {
				System.out.print("추가할 카테고리 입력 : ");
				String category = scan.next();
				
				int cnt = 0;
				for (int i = 0; i < itemCount; i++) {
					if (items[i][0].equals(category)) {
						System.out.println("이미 존재하는 카테고리 입니다.");
						break;
					}
					cnt++;
				}
				
				if (cnt == itemCount) {
					items[itemCount][0] = category;
					itemCount++;
				}	
			}
			
			else if (sel == 2) {
				System.out.println("1) 아이템 추가");
				System.out.println("2) 아이템 삭제");
				
				int pick = scan.nextInt();
				
				if (pick == 1) {
					for (int i = 0; i < itemCount; i++) {
						System.out.println("[" + i + "]" + items[i][0]);
					}
					System.out.print("아이템을 추가할 카테고리 입력 : ");
					int num = scan.nextInt();
					System.out.print("아이템 추가 : ");
					String item = scan.next();
					String[] temp = items[num][1].split("/");
					int cnt = 0;
					for (int i = 0; i < temp.length; i++) {
						if (temp[i].equals(item)) {
							System.out.println("이미 존재하는 아이템 입니다.");
							break;
						}
						cnt++;
					}
					if (cnt == temp.length) {
						items[num][1] += item + "/";
					}	
				}
				
				else if (pick == 2) {
					for (int i = 0; i < itemCount; i++) {
						System.out.println("[" + i + "]" + items[i][0]);
					}
					System.out.print("아이템을 삭제할 카테고리 입력 : ");
					int num = scan.nextInt();
					System.out.print("삭제할 아이템 입력 : ");
					String item = scan.next();
					
					int index = 0;
					String[] temp = items[num][1].split("/");
					for (int i = 0; i < temp.length; i++) {
						if (temp[i] == item) {
							index = i;
							break;
						}
					}
					
					for (int i = index; i < temp.length - 1; i++) {
						temp[i] = temp[i+1];
					}
					
					for (int i = 0; i < temp.length - 1; i++) {
						items[num][1] += temp[i] + "/";
					}
					
				}
				
				
			}
			else if (sel == 3) {
				for (int i = 0; i < itemCount; i++) {
					System.out.println("{" + items[i][0] + "}, {" + items[i][1] + "}"  );
				}
				
			}
			
		}



	}

}
