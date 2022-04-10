import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class MemberMgr implements MemberUtil {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	private List<Member> list = new LinkedList<Member>();
	private Member member;
	
	private Member readUser(String id) {
		Member user = null;
		
		for(Member data : list) {
			if(data.getId().equals(id)) {
				user = data;
				break;
			}
		}
		return user;
	}
	
	public Member loginMember() {
		return member;
	}
	
	public MemberMgr() {
		Member admin = new Member();
		admin.setId("admin");
		admin.setPassword("1234");
		admin.setName("������");
		list.add(admin);
	}
	
	@Override
	public void join() {
		System.out.println("========= ȸ������ =========");
		try {
			Member user = new Member();
			System.out.print("���̵� �Է��ϼ��� : ");
			user.setId(br.readLine());
			
			if (readUser(user.getId()) != null) {
				System.out.println("�̹� �����ϴ� ���̵��Դϴ�.");
				return;
			}
			
			System.out.print("�н����带 �Է��ϼ��� : ");
			user.setPassword(br.readLine());
			
			System.out.print("�̸��� �Է��ϼ��� : ");
			user.setName(br.readLine());
			
			list.add(user);
			System.out.println("ȸ�� ������ �Ϸ�Ǿ����ϴ�!");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void logIn() {
		System.out.println("========= �α��� ==========");
		String id, password;
		
		try {
			System.out.print("���̵� �Է��ϼ��� : ");
			id = br.readLine();
			
			System.out.print("�н����带 �Է��ϼ��� : ");
			password = br.readLine();
			
			Member user = readUser(id);
			if (user != null) {
				if(user.getPassword().equals(password)) {
					member = user;
					return;
				}
			}
			
			System.out.println("���̵� Ȥ�� �н����尡 ��ġ���� �ʽ��ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void logOut() {
		member = null;
		
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		
	}

	@Override
	public void memberSearch() {
		System.out.println("========= ����� �˻� =========");
		try {
			System.out.println("�̸��� �Է��ϼ��� : ");
			String str = br.readLine();
			Member user = null;
			
			for(Member data : list) {
				if(data.getName().equals(str)) {
					user = data;
					break;
				}
			}
			System.out.print("�̸� : " + user.getName());
			System.out.print("���̵� : " + user.getId());
			
			System.out.println("ó������ ���ư��ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void memberCheck() {
		System.out.println("========= ȸ�� ��� =========");
		System.out.println("�� ȸ�� �� : " + list.size());
		for (Member user : list) {
			System.out.print("�̸� : " + user.getName() + ", ���̵� : " + user.getId());
		}
		System.out.println();
		
	}

	@Override
	public void delMember() {
		Member user = readUser(member.getId());
		Member admin = readUser("admin");
		
		try {
			if(member.getId() != "admin") {
				System.out.println("ȸ�� Ż��");
				
				System.out.print("�н����带 �Է��ϼ��� : ");
				String password = br.readLine();
				
				if (!user.getPassword().equals(password)) {
					System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
					return;
				}
			}	
				else if (user.getId() == "admin") {
					System.out.println("========= ȸ�� ���� =========");
					
					System.out.println("������ ���̵� �Է��ϼ��� : ");
					user=readUser(br.readLine());
					if (user == null) {
						System.out.println("���̵� �������� �ʽ��ϴ�.");
						return;
					}
					
					System.out.print(user.getId());
					System.out.print(user.getName());
					System.out.println("������ ���̵� �³���? [Y/N] ");
					String str = br.readLine();
					
					if (str.equals("Y") || str.equals("y")) {
						System.out.print("������ �н����带 �Է��ϼ��� : ");
						String password = br.readLine();
						
						if(! admin.getPassword().equals(password)) {
							System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
							return;
					}		
					
				} else {
					System.out.println("������ ����մϴ�.");
					return;
				}
			}
			
			list.remove(user);
			
			if(user.getId() != "admin") {
				System.out.println("ȸ��Ż�� �Ϸ�Ǿ����ϴ�.");
			} else {
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			member = null;
	}
}
