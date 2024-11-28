import java.util.Scanner;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력");
		System.out.print(">>");
		
		int h1 = scanner.nextInt();
		for(int i=0; i<9; i++) {
			int h2 = scanner.nextInt();
			v.add(h2-h1);
			h1 = h2;
		}
		
		double grow = v.get(0);
		int year = 0;
		for(int i=0; i<9; i++) {
			if(grow < v.get(i)) {
				grow = v.get(i);
				year = i;
			}
			
		}
		System.out.println("가장 키가 많이 자란 년도는 " + (year+2000) + "년 " + grow + "m");
	}
}
