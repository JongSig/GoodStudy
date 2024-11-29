import java.util.ArrayList;
import java.util.Scanner;

class Location{
	int x, y;
	public Location(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public double distance(Location b){
		x = x-b.x;
		y = y-b.y;
		double value = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return value;
	}
}

public class ExperimentalMouse {
	private Scanner scanner;
	private ArrayList<Location> a;
	
	public ExperimentalMouse() {
		scanner = new Scanner(System.in);
		a = new ArrayList<Location>();
		System.out.println("쥐가 이동한 위치 (x,y)를 5개 입력하라.");
	}
	
	public void run() {
		int x, y;
		double sum = 0;
		
		a.add(new Location(0, 0));
		for(int i=0; i<5; i++) {
			System.out.print(">> ");
			x = scanner.nextInt();
			y = scanner.nextInt();
			a.add(new Location(x, y));
		}
		a.add(new Location(0, 0));
		
		for(int i=0; i<a.size()-1; i++) {
			sum = sum + a.get(i).distance(a.get(i+1));
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		ExperimentalMouse App = new ExperimentalMouse();
		App.run();
	}
}
