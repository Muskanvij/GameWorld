/**
 * @author vikrantsingh
 *
 */
import java.util.Scanner;
public class menu_pg {
	static menu_func func = new menu_func();
	
	public static void main(String[] args) throws Exception {
		
		Scanner selection = new Scanner(System.in);
		String option = null;
		
		System.out.println(
			"\n	Word Link" + 
			"\n\n	A.	set the difficulty level" + 
			"\n	B.	display the dictionary" +
			"\n	C.	insert a word to the dictionary" +
			"\n	D.	play the game (1 player)" +
			"\n	E.	exit" +
			"\n	F.	play the game (2 players)" + 
			"\n\n	Select a function from the menu:");
		
		option = selection.nextLine();
		while(
				!option.equalsIgnoreCase("a") &&
				!option.equalsIgnoreCase("b") &&
				!option.equalsIgnoreCase("c") &&
				!option.equalsIgnoreCase("d") &&
				!option.equalsIgnoreCase("e") &&
				!option.equalsIgnoreCase("f")
			)
		{
			System.out.println("\n enter a valid option : ");
			option = selection.nextLine();
		}
		optionselect(option);
		selection.close();
	}
	
	static void optionselect(String selection) throws Exception {

		String option = selection.toLowerCase();
		switch(option) {
			case "a":
			  	func.lvlset();
			  break;
			case "b":
				func.dictionarydisp();
			  break;
			case "c":
				func.insertion();
			  break;
			case "d":
				func.game_1();
			  break;
			case "e":
				func.exit();
			  break;
			case "f":
				func.game2();
			  break;
		  }
	}

}
