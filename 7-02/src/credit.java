import java.util.ArrayList;
import java.util.Scanner;

public class credit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> a = new ArrayList<Character>();
		System.out.print("빈칸으로 분리하여 5 개의 학점을 입력(A/B/C/D/F)>>");
		
		for(int i=0; i<5; i++) {
			char input = scanner.next().charAt(0);
			a.add(input);
		}
		
		for(int i=0; i<5; i++) {
			switch (a.get(i)) {
			case 'A':
				System.out.print("4.0 ");
				break;
			case 'B':
				System.out.print("3.0 ");
				break;
			case 'C':
				System.out.print("2.0 ");
				break;
			case 'D':
				System.out.print("1.0 ");
				break;
			case 'F':
				System.out.print("0.0 ");
				break;
			default:
				System.out.print("잘못입력했습다.");
			}
		}
		scanner.close();
	}
}
