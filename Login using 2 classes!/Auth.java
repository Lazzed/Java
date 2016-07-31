import java.util.*;

public class Auth 
{
		public static void Login()
		{
			Scanner ss = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = ss.nextLine();
			
			if(name.equals("Alex")){
			Scanner sc = new Scanner(System.in);
			System.out.println("Username:");
			String user = sc.nextLine();
			System.out.println("Password:");
			String pass = sc.nextLine();
			System.out.println("Passcode:");
			String code = sc.nextLine();
			Auth Check = new Auth();
			Auth.Check(user,pass,code);
			}
			else
			{
			System.out.println("Not valid.");
				
			}


		}
		public static void Check(String user,String pass,String code)
		{
			if(user.equals("Admin")&&(pass.equals("Kappa")&&(code.equals("1111")))) 
			{
			System.out.println("Welcome back admin");	
			Scanner ssc = new Scanner(System.in);
			System.out.println("Are you connected to the internet? Y/N");
			String connected = ssc.nextLine();
			if(connected.equals("Y")){
			Auth Server = new Auth();
			int login = 1;
			Auth.Server(login);
			}	
			else
			{
			System.out.println("Error!");
			}
			
			
			
			}
		}
		public static void Server(int login){
			if(login == 1)
			{
				
			System.out.println("Logging in now...");
				
			}
			else
			{
			System.out.println("Unable to Login");
			}
			
			
			
			
		}
}