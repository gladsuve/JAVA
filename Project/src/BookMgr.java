import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class BookMgr implements BookUtil {

	Scanner sc = new Scanner(System.in);
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	Map<String, Book> map = new HashMap<>();
	DecimalFormat df = new DecimalFormat();
	
	
	@Override
	public void AddBook() {
		System.out.println("책 등록");
		
		try {
			String isbn;
			Book book = new Book();
			
			System.out.print("ISBN : ");
			isbn = br.readLine();
			
			if(map.containsKey(isbn)) {
				System.out.println("이미 등록된 책입니다");
				return;
			}
			System.out.print("제목 : ");
			book.setTitle(br.readLine());
			
			System.out.print("저자 : ");
			book.setAuthor(br.readLine());
			
			System.out.print("출판사 : ");
			book.setPublisher(br.readLine());
			
			map.put(isbn, book);
	
			System.out.println("책 등록 완료!");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void DelBook() {
		System.out.print("삭제할 책 : ");
		
		String str = sc.next();
		Iterator<String> it = map.keySet().iterator();
		
		while (it.hasNext()) {
			String isbn = it.next();
			Book value = map.get(isbn);
			
			if(str.equals(value.getTitle())) {
				map.remove(isbn);
				System.out.println(str + "삭제");
			}
		}
		
}

	@Override
	public void borrow() {
		try {
			String name;
			System.out.println("대여할 책 이름을 입력하세요 : ");
			name = br.readLine();
			
			Iterator<String> it = map.keySet().iterator();
			
			while (it.hasNext()) {
				String isbn = it.next();
				Book book = map.get(isbn);
				
				if(book.getTitle().startsWith(name)) {
					if(book.getRent()) {
						System.out.println("이미 대여중인 책입니다.");
						break;
					}
					System.out.println("제목 : " + book.getTitle() + ", 저자 : " + book.getAuthor() + ", 출판사 : " + book.getPublisher());
					System.out.println("대여가 완료되었습니다.");
					book.setRent(true);
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void back() {
		System.out.println("반납합 책 이름을 입력하세요 : ");
		String str = sc.next();
		Iterator<String> it = map.keySet().iterator();
		
		
		while (it.hasNext()) {
			String isbn = it.next();
			Book value = map.get(isbn);
			
			if (str.equals(value.getTitle())) {
				if (!value.getRent()) {
					System.out.println("대여중이 아닌 책입니다.");
				}
			} else if (value.getRent()) {
				System.out.println("책이 반납되었습니다");
				value.setRent(false);
			}
		}
	}

	@Override
	public void search() {
		Iterator<String> it = map.keySet().iterator();
		int num = 0;
		int count = 0;
		
		try {
			System.out.println("책 이름을 입력하세요 : ");
			String str1 = br.readLine();
			
			while (it.hasNext()) {
				String str2 = df.format(++num);
				String isbn = it.next();
				Book book = map.get(isbn);
				if (book.getTitle().indexOf(str1) > -1) {
					System.out.println("ISBN : " + isbn);
					System.out.println("제목 : " + book.getTitle());
					System.out.println("저자 : " + book.getAuthor());
					System.out.println("출판사 : " + book.getPublisher());
					count ++;
				}
			}
			if (count == 0) {
				System.out.println("검색된 책이 없습니다.");
				return;
			}
			System.out.println();
			System.out.println("총 " + count + "건의 책이 검색되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void check() {
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String isbn = it.next();
			Book book = map.get(isbn);
			
			System.out.println("ISBN : " + isbn + " 제목 : " + book.getTitle() + " 저자 : " + book.getAuthor() + " 출판사 : " + book.getPublisher());
			
		}
		
	}
	

}
