public class Welcome {
	
	public static void main(String[] arg) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Welcom!!");
		java.util.StringTokenizer st = new java.util.StringTokenizer(scanner.nextLine(), "/");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		scanner.close();
	}
}