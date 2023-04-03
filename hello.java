import java.io.Console;


public class hello{
	public static void main(String[] args)  {
		Console console = System.console();
		int a = Integer.parseInt(console.readLine());
		if (0 > a || a > 100) {
			System.out.println("Ok");
		} else if(a < 10)  {
			System.out.println("Be hon 10");
		}else  {
			System.out.println("Not ok");
		}
		
	
		
	}
}