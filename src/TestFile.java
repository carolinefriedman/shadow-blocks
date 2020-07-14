import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TestFile {
	public static void main(String[] args) throws FileNotFoundException { 
		Scanner scanner = new Scanner(new File("res/levels/0.lvl"));
		scanner.useDelimiter(",");
		while(scanner.hasNext()) {
			System.out.print(scanner.next()+"|");
		}
		scanner.close();
	}
}