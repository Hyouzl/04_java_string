package step4_01.string;

import java.util.Scanner;

/*
 * # 쇼핑몰 [장바구니]
 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
 * 	1) 사과
 *  2) 바나나
 *  3) 딸기
 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
 * 예)
 * {
 * 		{0, 1},				qwer회원 			> 사과구매
 * 		{1, 2},				javaking회원 		> 바나나구매
 * 		{2, 1},				abcd회원			> 사과구매
 * 		{0, 3},				qwer회원			> 딸기구매
 * 		..
 * }
 */



public class StringEx12_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		int count = 0;
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int identifier = -1;
		
		while(true) {
			
			if (identifier == 1) {
				System.out.println("---------------------------------");
				System.out.println("상태 : "+ ids[0] + "로그인");
				System.out.println("---------------------------------");
			}
			else if (identifier == 2) {
				System.out.println("---------------------------------");
				System.out.println("상태 : "+ ids[1] + "로그인");
				System.out.println("---------------------------------");
			}
			else if(identifier == 3) {
				System.out.println("---------------------------------");
				System.out.println("상태 : "+ ids[2] + "로그인");
				System.out.println("---------------------------------");
			}
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				System.out.print("Id 입력 : ");
				String id = scan.next();
				System.out.print("Pw 입력 : ");
				String pw = scan.next();
				
				int cnt = 0;
				for (int i = 0; i < 3; i++) {
					if (id.equals(ids[i]) && pw.equals(pws[i])) {
						System.out.println(ids[i] +"님 , 환영합니다.");
						identifier = i+1;
						break;
					}
					else cnt++;
				}
				if (cnt == 3) {
					System.out.println("아이디와 비밀번호를 확인하세요");
				}
			}
			
			else if (sel == 2) {
				identifier = -1;
				System.out.println("로그아웃 중 ...");
			}
			else if (sel == 3) {
		
				while (true) {	
					for (int i = 0; i < items.length; i++) {
						System.out.println(i+1 + ") " +items[i]);
					}
					System.out.println("4) 뒤로가기");
				System.out.print("상품번호를 선택하세요 : ");
				int num = scan.nextInt();
				jang[count][0] = identifier - 1;
				jang[count][1] = num;
				count++;
				
				if (num == 4) {
					break;
				}
				
			}
			}
			else if (sel == 4) {

					System.out.println("id : " + ids[identifier-1]);
					for (int i = 0; i < items.length; i++) {
						int cnt = 0;
						for (int j = 0; j <count; j++) {
							if (jang[j][0] == identifier - 1 && jang[j][1] == i+1) {
								cnt++;
								}
						}
						System.out.println(items[i] + " : " + cnt + "개");
					}
				}

	
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}



	}

}
