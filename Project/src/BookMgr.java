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
		System.out.println("å ���");
		
		try {
			String isbn;
			Book book = new Book();
			
			System.out.print("ISBN : ");
			isbn = br.readLine();
			
			if(map.containsKey(isbn)) {
				System.out.println("�̹� ��ϵ� å�Դϴ�");
				return;
			}
			System.out.print("���� : ");
			book.setTitle(br.readLine());
			
			System.out.print("���� : ");
			book.setAuthor(br.readLine());
			
			System.out.print("���ǻ� : ");
			book.setPublisher(br.readLine());
			
			map.put(isbn, book);
	
			System.out.println("å ��� �Ϸ�!");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void DelBook() {
		System.out.print("������ å : ");
		
		String str = sc.next();
		Iterator<String> it = map.keySet().iterator();
		
		while (it.hasNext()) {
			String isbn = it.next();
			Book value = map.get(isbn);
			
			if(str.equals(value.getTitle())) {
				map.remove(isbn);
				System.out.println(str + "����");
			}
		}
		
}

	@Override
	public void borrow() {
		try {
			String name;
			System.out.println("�뿩�� å �̸��� �Է��ϼ��� : ");
			name = br.readLine();
			
			Iterator<String> it = map.keySet().iterator();
			
			while (it.hasNext()) {
				String isbn = it.next();
				Book book = map.get(isbn);
				
				if(book.getTitle().startsWith(name)) {
					if(book.getRent()) {
						System.out.println("�̹� �뿩���� å�Դϴ�.");
						break;
					}
					System.out.println("���� : " + book.getTitle() + ", ���� : " + book.getAuthor() + ", ���ǻ� : " + book.getPublisher());
					System.out.println("�뿩�� �Ϸ�Ǿ����ϴ�.");
					book.setRent(true);
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void back() {
		System.out.println("�ݳ��� å �̸��� �Է��ϼ��� : ");
		String str = sc.next();
		Iterator<String> it = map.keySet().iterator();
		
		
		while (it.hasNext()) {
			String isbn = it.next();
			Book value = map.get(isbn);
			
			if (str.equals(value.getTitle())) {
				if (!value.getRent()) {
					System.out.println("�뿩���� �ƴ� å�Դϴ�.");
				}
			} else if (value.getRent()) {
				System.out.println("å�� �ݳ��Ǿ����ϴ�");
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
			System.out.println("å �̸��� �Է��ϼ��� : ");
			String str1 = br.readLine();
			
			while (it.hasNext()) {
				String str2 = df.format(++num);
				String isbn = it.next();
				Book book = map.get(isbn);
				if (book.getTitle().indexOf(str1) > -1) {
					System.out.println("ISBN : " + isbn);
					System.out.println("���� : " + book.getTitle());
					System.out.println("���� : " + book.getAuthor());
					System.out.println("���ǻ� : " + book.getPublisher());
					count ++;
				}
			}
			if (count == 0) {
				System.out.println("�˻��� å�� �����ϴ�.");
				return;
			}
			System.out.println();
			System.out.println("�� " + count + "���� å�� �˻��Ǿ����ϴ�.");
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
			
			System.out.println("ISBN : " + isbn + " ���� : " + book.getTitle() + " ���� : " + book.getAuthor() + " ���ǻ� : " + book.getPublisher());
			
		}
		
	}
	

}
