import java.util.*;
public class main
{
		
public static void main(String[] args) 
{
	int exp;
	String w2gamemode = "Which gamemode are you transfering to?";
	String wgamemode = "Please input which gamemode you want to transfer to.";
	String test;
	String gamemodet;
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
				if(gamemodet.equals("Gm") || (gamemodet.equals("GM") || (gamemodet.equals("gm"))))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your GM exp will be:" +sexp/75);
						return;
						
				}
				else if(gamemodet.equals("Immortal") || (gamemodet.equals("immortal")))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Immortal exp will be:" +sexp/15);
						return;
						
				}
				else if(gamemodet.equals("Legend") || (gamemodet.equals("legend")))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Legend exp will be:" +sexp/3);
						return;
						
				}
				else if(gamemodet.equals("Extreme") || (gamemodet.equals("extreme")))
				{
						System.out.println("Silly, you are Extreme.");
						return;      
				}
						
				
				
		}
		if(test.equals("Legend") || (test.equals("legend"))) //legend
		{
				System.out.println("I see that you are in Legend Mode");
				System.out.println(wgamemode);
				System.out.println(w2gamemode);
				gamemodet = listener.nextLine();
				if(gamemodet.equals("Gm") || (gamemodet.equals("GM") || (gamemodet.equals("gm"))))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your GM exp will be:" +sexp/25);
						return;
				}
				else if(gamemodet.equals("Immortal") || (gamemodet.equals("immortal")))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Immortal exp will be:" +sexp/5);
						return;
				}
				else if(gamemodet.equals("Legend") || (gamemodet.equals("legend")))
				{
						System.out.println("Silly, you are Legend");
						return;
				}		
				else if(gamemodet.equals("Extreme") || (gamemodet.equals("extreme")))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Extreme exp will be:" +sexp*3);
						return;
				}
		} 
		if(test.equals("Immortal") || (test.equals("immortal"))) //immortal
		{
				System.out.println("I see that you are in Immortal Mode");
				System.out.println(wgamemode);
				System.out.println(w2gamemode);
				gamemodet = listener.nextLine();
				if(gamemodet.equals("Gm") || (gamemodet.equals("GM") || (gamemodet.equals("gm"))))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your GM exp will be:" +sexp/5);
						return;
				}
				else if(gamemodet.equals("Immortal") || (gamemodet.equals("immortal")))
				{
						System.out.println("Silly, You are Immortal!");
						return;
				}
				else if(gamemodet.equals("Legend") || (gamemodet.equals("legend")))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Legend exp will be:" +sexp*5);
						return;
				}		
				else if(gamemodet.equals("Extreme") || (gamemodet.equals("extreme")))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Extreme exp will be:" +sexp*15);
						return;
				}
		}
		if(test.equals("Gm") || (test.equals("GM") || (test.equals("gm")))) //grandmaster
		{
				System.out.println("I see that you are in Grand Master Mode");
				System.out.println(wgamemode);
				System.out.println(w2gamemode);
				gamemodet = listener.nextLine();
				if(gamemodet.equals("Gm") || (gamemodet.equals("GM") || (gamemodet.equals("gm"))))
				{
						System.out.println("Silly, You are GM!");
						return;
				}
				else if(gamemodet.equals("Immortal") || (gamemodet.equals("immortal")))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Immortal exp will be:" +sexp*5);
						return;
				}
				else if(gamemodet.equals("Legend") || (gamemodet.equals("legend")))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Legend exp will be:" +sexp*25);
						return;
				}		
				else if(gamemodet.equals("Extreme") || (gamemodet.equals("extreme")))
				{
						System.out.println("Alright, now please input your current skill exp.");
						sexp = listener.nextInt();
						System.out.println("Your Extreme exp will be:" +sexp*75);
						return;
				}
		}
	 
		else
		{
			System.out.println("Error, Try a different Syntax (Extreme/Legend/Immortal/GM)!");
			return;
		}

		
		
		
}
		
}
