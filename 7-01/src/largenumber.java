import java.util.Scanner;
import java.util.Vector;

public class largenumber {
	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 5개 입력해주세요.");
		for(int i=0; i<5; i++) {
			Double input = scanner.nextDouble();
			v.add(input);
		}
		
		double big = v.get(0);
		for(int i=0; i<5; i++) {
			if(big < v.get(i))
				big = v.get(i);
		}
		
		System.out.println("가장 큰수는 " + big);
		scanner.close();
		
	}
}
