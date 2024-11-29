import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ScoreManagement {
	private HashMap<String, Integer> h;
	private Set<String> keys;
	private Iterator<String> it;
	private Scanner scanner;
	
	
	public ScoreManagement() {
		h = new HashMap<String, Integer>();
		scanner = new Scanner(System.in);
		System.out.println("** 포인터 관리 프로그램입니다. **");
	}
	
	public void run() {
		String name;
		int score;
		
		while(true) {
			System.out.print("이름으로 포인터 입력>>");
			name = scanner.next();
			
			if(name.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			
			score = scanner.nextInt();
			
			if(!h.containsKey(name)) {
				h.put(name, score);
			}else {
				h.remove(name);
				h.put(name, score);
			}
			
			name = "";
			score = 0;
			keys = h.keySet();
			it = keys.iterator();
			
			while(it.hasNext()) {
				name = it.next();
				score = h.get(name);	
				System.out.print("(" + name + "," + score + ")");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		ScoreManagement App = new ScoreManagement();
		App.run();
	}
}
