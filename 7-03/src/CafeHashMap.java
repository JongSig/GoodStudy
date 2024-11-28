import java.util.HashMap;
import java.util.Scanner;

public class CafeHashMap {
	private HashMap<String, Integer> h = new HashMap<String, Integer>();
	private Scanner scanner;
	
	public CafeHashMap(){
		scanner = new Scanner(System.in);
		h.put("에스프레소", 2000);
		h.put("아메리카노", 2500);
		h.put("카푸치노", 3000);
		h.put("카페라떼", 3500);
	}
	
	public void run() {
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");
		
		while(true) {
			System.out.print("주문 >> ");
			String coffee = scanner.next();
			
			if(coffee.equals("그만"))
				break;
			
			Integer money = h.get(coffee);
				
			if(money == null)
				System.out.println(coffee + "는 없습니다.");
			else
				System.out.println(coffee+"는 " + money +"입니다.");
		}
	}
	
	public static void main(String[] args) {
		CafeHashMap app = new CafeHashMap();
		app.run();
	}
}
