import java.util.Scanner;

public class compiler
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		try 
		{
			String[] splitInp = input.split("\\s+");
			System.out.println(splitInp[1]);
		} 
		catch (PatternSyntaxException ex) {
			// 
		}
	}
}
