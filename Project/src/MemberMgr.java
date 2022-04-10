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
		admin.setName("관리자");
		list.add(admin);
	}
	
	@Override
	public void join() {
		System.out.println("========= 회원가입 =========");
		try {
			Member user = new Member();
			System.out.print("아이디를 입력하세요 : ");
			user.setId(br.readLine());
			
			if (readUser(user.getId()) != null) {
				System.out.println("이미 존재하는 아이디입니다.");
				return;
			}
			
			System.out.print("패스워드를 입력하세요 : ");
			user.setPassword(br.readLine());
			
			System.out.print("이름을 입력하세요 : ");
			user.setName(br.readLine());
			
			list.add(user);
			System.out.println("회원 가입이 완료되었습니다!");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void logIn() {
		System.out.println("========= 로그인 ==========");
		String id, password;
		
		try {
			System.out.print("아이디를 입력하세요 : ");
			id = br.readLine();
			
			System.out.print("패스워드를 입력하세요 : ");
			password = br.readLine();
			
			Member user = readUser(id);
			if (user != null) {
				if(user.getPassword().equals(password)) {
					member = user;
					return;
				}
			}
			
			System.out.println("아이디 혹은 패스워드가 일치하지 않습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void logOut() {
		member = null;
		
		System.out.println("로그아웃 되었습니다.");
		
	}

	@Override
	public void memberSearch() {
		System.out.println("========= 사용자 검색 =========");
		try {
			System.out.println("이름을 입력하세요 : ");
			String str = br.readLine();
			Member user = null;
			
			for(Member data : list) {
				if(data.getName().equals(str)) {
					user = data;
					break;
				}
			}
			System.out.print("이름 : " + user.getName());
			System.out.print("아이디 : " + user.getId());
			
			System.out.println("처음으로 돌아갑니다.");
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void memberCheck() {
		System.out.println("========= 회원 명단 =========");
		System.out.println("총 회원 수 : " + list.size());
		for (Member user : list) {
			System.out.print("이름 : " + user.getName() + ", 아이디 : " + user.getId());
		}
		System.out.println();
		
	}

	@Override
	public void delMember() {
		Member user = readUser(member.getId());
		Member admin = readUser("admin");
		
		try {
			if(member.getId() != "admin") {
				System.out.println("회원 탈퇴");
				
				System.out.print("패스워드를 입력하세요 : ");
				String password = br.readLine();
				
				if (!user.getPassword().equals(password)) {
					System.out.println("패스워드가 일치하지 않습니다.");
					return;
				}
			}	
				else if (user.getId() == "admin") {
					System.out.println("========= 회원 삭제 =========");
					
					System.out.println("삭제할 아이디를 입력하세요 : ");
					user=readUser(br.readLine());
					if (user == null) {
						System.out.println("아이디가 존재하지 않습니다.");
						return;
					}
					
					System.out.print(user.getId());
					System.out.print(user.getName());
					System.out.println("삭제할 아이디가 맞나요? [Y/N] ");
					String str = br.readLine();
					
					if (str.equals("Y") || str.equals("y")) {
						System.out.print("관리자 패스워드를 입력하세요 : ");
						String password = br.readLine();
						
						if(! admin.getPassword().equals(password)) {
							System.out.println("패스워드가 일치하지 않습니다.");
							return;
					}		
					
				} else {
					System.out.println("삭제를 취소합니다.");
					return;
				}
			}
			
			list.remove(user);
			
			if(user.getId() != "admin") {
				System.out.println("회원탈퇴가 완료되었습니다.");
			} else {
				System.out.println("회원삭제가 완료되었습니다.");
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			member = null;
	}
}
