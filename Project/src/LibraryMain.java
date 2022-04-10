import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		System.out.println("========== �������� ���� ���� ȯ���մϴ� ===========");
		Scanner sc = new Scanner(System.in);
		MemberMgr mm = new MemberMgr();
		BookMgr bm = new BookMgr(); 
		int num;
		
		while(true) {
			if(mm.loginMember() == null)  {   // �α����� ���� ���� ���
				System.out.print("��ȣ�� �Է��ϼ���(1.�α��� 2.ȸ������ 3. ����) : ");
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
				System.out.print("��ȣ�� �Է��ϼ���(1.�������� 2.ȸ������ 3.�α׾ƿ� 4.����) : ");
				num = sc.nextInt();
				if(num == 4) break;
				
				switch (num) {
				case 1:
					System.out.print("1.������� 2.�������� 3.�����˻� 4.���� ����Ʈ 5.���� ");
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
					System.out.print("1.ȸ�� ����Ʈ 2.�̸��˻� 3.ȸ������ 4.����");
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
				System.out.print("��ȣ�� �Է��ϼ���(1.���� �뿩 2.���� �ݳ� 3.���� �˻� 4.�α׾ƿ� 5.Ż�� 6.����");
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

