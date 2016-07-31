import java.util.*;
public class main
{
		
public static void main(String[] args) 
{
	int extreme;
	int legend;
	int immortal;
	int gm;
	int exp;
	String w2gamemode = "Which gamemode are you transfering to?";
	String wgamemode = "Please input which gamemode you want to transfer to.";
	String test;
	String gamemodet;
	String d = "Gm";
	String c = "Immortal";
	String b = "Legend";
	String a = "Extreme";
	int sexp;
	Scanner listener = new Scanner(System.in);
	System.out.println("Which gamemode are you using? (Extreme/Legend/Immortal/GM)");
	test = listener.nextLine();
		if(test.equals("Extreme") || (test.equals("extreme")))
		{
				System.out.println("I see that you are in Extreme Mode");
				System.out.println(wgamemode);
				System.out.println(w2gamemode);
				gamemodet = listener.nextLine();
				if(gamemodet.equals(d))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your GM exp will be:" +sexp/75);
						
				}
				else if(gamemodet.equals(c))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Immortal exp will be:" +sexp/15);
						
				}
				else if(gamemodet.equals(b))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Legend exp will be:" +sexp/3);
						
				}
				else if(gamemodet.equals(a))
				{
						System.out.println("Silly, you are Extreme.");      
				}
						
				
				
		}
		if(test.equals("Legend") || (test.equals("legend"))) //legend
		{
				System.out.println("I see that you are in Legend Mode");
				System.out.println(wgamemode);
				System.out.println(w2gamemode);
				gamemodet = listener.nextLine();
				if(gamemodet.equals(d))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your GM exp will be:" +sexp/25);
				}
				else if(gamemodet.equals(c))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Immortal exp will be:" +sexp/5);
				}
				else if(gamemodet.equals(b))
				{
						System.out.println("Silly, you are Legend");
				}		
				else if(gamemodet.equals(a))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Extreme exp will be:" +sexp*3);
				}
		} 
		if(test.equals("Immortal") || (test.equals("immortal"))) //immortal
		{
				System.out.println("I see that you are in Immortal Mode");
				System.out.println(wgamemode);
				System.out.println(w2gamemode);
				gamemodet = listener.nextLine();
				if(gamemodet.equals(d))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your GM exp will be:" +sexp/5);
				}
				else if(gamemodet.equals(c))
				{
						System.out.println("Silly, You are Immortal!");
						return;
				}
				else if(gamemodet.equals(b))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Legend exp will be:" +sexp*5);
				}		
				else if(gamemodet.equals(a))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Extreme exp will be:" +sexp*15);
				}
		}
		if(test.equals("Gm") || (test.equals("GM"))) //grandmaster
		{
				System.out.println("I see that you are in Grand Master Mode");
				System.out.println(wgamemode);
				System.out.println(w2gamemode);
				gamemodet = listener.nextLine();
				if(gamemodet.equals(d))
				{
						System.out.println("Silly, You are GM!");
				}
				else if(gamemodet.equals(c))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Immortal exp will be:" +sexp*5);
				}
				else if(gamemodet.equals(b))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Legend exp will be:" +sexp*25);
				}		
				else if(gamemodet.equals(a))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Extreme exp will be:" +sexp*75);
				}
		}
	 
		{
		
		}

		
		
		
}
		
}
