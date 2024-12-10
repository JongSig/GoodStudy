import java.io.*;

public class FileInputStreamEx {
	public static void main(String[] args) {
		byte b[] = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("c:\\Temp\\text.out");
			int n=0, c;
			while((c = fin.read()) != -1) {
				b[n] = (byte)c;
				n++;
			}
			
			System.out.println("배열 출력!");
			for(int i=0; i<b.length; i++)
				System.out.print(b[i] + " ");
			System.out.println();
			
			fin.close();
		} catch(IOException e) { }
	}
}
