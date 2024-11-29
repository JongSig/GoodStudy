import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PopulationManagerment {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("나라 이름과 임구를 5개 입력하세요.(예: korea 5000)");
		String city = "";
		int population;
		
		
		for(int i=0;i<5;i++) {
			System.out.print("나라 이름, 인구 >> ");
			city = scanner.next();
			population = scanner.nextInt();
			nations.put(city, population);
		}
		
		population = 0;
		Set<String> keys = nations.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			int value = nations.get(key);
			if(population < value) {
				city = key;
				population = value;
			}
		}
		
		System.out.println("제일 인구가 많은 나라는 (" + city + ", " + population +")");
		scanner.close();
	}
}
