import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		System.out.println("========== 도서관에 오신 것을 환영합니다 ===========");
		Scanner sc = new Scanner(System.in);
		MemberMgr mm = new MemberMgr();
		BookMgr bm = new BookMgr(); 
		int num;
		
		while(true) {
			if(mm.loginMember() == null)  {   // 로그인이 되지 않은 경우
				System.out.print("번호를 입력하세요(1.로그인 2.회원가입 3. 종료) : ");
				num = sc.nextInt();
				if(num == 3) break;
				
				switch (num) {
				case 1:
					mm.logIn();
					break;
				case 2:
					mm.join();
					break;
				}
				
			} else if(mm.loginMember().getId() == "admin") {
				System.out.print("번호를 입력하세요(1.도서관리 2.회원관리 3.로그아웃 4.종료) : ");
				num = sc.nextInt();
				if(num == 4) break;
				
				switch (num) {
				case 1:
					System.out.print("1.도서등록 2.도서삭제 3.도서검색 4.도서 리스트 5.복귀 ");
					num =sc.nextInt();
					switch (num) {
					case 1 : 
						bm.AddBook();
						System.out.println();
						break;
					case 2 :
						bm.DelBook();
						System.out.println();
						break;
					case 3 :
						bm.search();
						System.out.println();
						break;
					case 4 :
						bm.check();
						System.out.println();
						break;
					case 5 :
						break;
					} break;
				case 2:
					System.out.print("1.회원 리스트 2.이름검색 3.회원삭제 4.복귀");
					num = sc.nextInt();
					if (num == 4) break;
					
					switch (num) {
					case 1:
						mm.memberCheck();
						break;
					case 2:
						mm.memberSearch();
						break;
					case 3:
						mm.delMember();
						break;
					} break;
				case 3:
					mm.logOut();
					break;
				}
			} else {
				System.out.print("번호를 입력하세요(1.도서 대여 2.도서 반납 3.도서 검색 4.로그아웃 5.탈퇴 6.종료");
				num = sc.nextInt();
				if (num == 6) break;
				
				switch (num) {
				case 1:
					bm.borrow();
					break;
				case 2:
					bm.back();
					break;
				case 3:
					bm.search();
					break;
				case 4:
					mm.logOut();
					break;
				case 5:
					mm.delMember();
					break;
					
				}
			}
			
		}
				
	}
}

