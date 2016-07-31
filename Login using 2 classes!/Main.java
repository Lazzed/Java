import java.util.*;
public class Main {
	public static void main(String[] args) 
	{
		Auth A = new Auth();
		Scanner sc = new Scanner(System.in);
		System.out.println("Username:");
		String user = sc.nextLine();
		System.out.println("Password:");
		String pass = sc.nextLine();
		System.out.println("Passcode:");
		String code = sc.nextLine();
		Auth.A(user,pass,code);
		
		
		
	}
}
