
import java.util.Scanner;

public class menu_func {
    int lvl = 1;
    Scanner lvl_scn = new Scanner(System.in);
    static array_o_linkedlist dict = new array_o_linkedlist();
    static game1 gm1 = new game1();
    static game2 gm2 = new game2();
    
	public void lvlset() throws Exception {
		System.out.println("\n Set the difficulty level");
		System.out.println(
			"\n The current difficulty level is "+ 
			lvl + 
            ". Type the new level: ");
        lvl = lvl_scn.nextInt();
        if (lvl == 1) {
            System.out.println("\n The difficulty level has now been set as 1.");
        } else if ( lvl == 2) {
            System.out.println("\n The difficulty level has now been set as 2.");
        } else {
            System.out.println("\n select difficulty level from 1 and 2");
            lvl = lvl_scn.nextInt();
        }   
        if (lvl != 1 && lvl != 2) {
            System.out.println("\n select difficulty level from 1 and 2 again from the menu");
        }
        menu_pg.main(null);
    }

    public void dictionarydisp() throws Exception {
        dict.main(null);
        menu_pg.main(null);
    }

    public void insertion() throws Exception {
        dict.appendStrToFile();
        menu_pg.main(null);
    }

    public void game_1() throws Exception {
        if (lvl == 1) {
            gm1.gamelvl1(); 
        } else {
            gm1.gamelvl2();
        }
    }

    public void exit() {
        System.out.println("\n Updating dictionary.txt ... Bye");
    }
    
    public void game2() {
        if (lvl == 1) {
            gm2.gamelvl1(); 
        } else {
            gm2.gamelvl2();
        }
    }

}
