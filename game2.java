import java.util.Arrays;
import java.util.Scanner;

public class game2 {

    static array_o_linkedlist dict = new array_o_linkedlist();
        
        String display ="",record="";
        Scanner word = new Scanner(System.in);

    public void gamelvl1() {
        String[] vocab;
        System.out.println("play the game (level 1) ");
        System.out.print("enter a word: \n");
        try {
            int a1 = 0;
            for (int l = 0; l < dict.dictionary_read().length; l++) {
                Boolean flag1 = Character.isDigit(dict.dictionary_read()[l].charAt(0));
                if (flag1) {
                    a1 = l;
                }
            }
            String[] words1 = new String[dict.dictionary_read().length -(dict.dictionary_read().length - a1)-1];
            for (int i = 1; i < dict.dictionary_read().length; i++) {
                Boolean flag = Character.isDigit(dict.dictionary_read()[i].charAt(0));
                if (flag) {
                } else {
                        words1[i-1] = dict.dictionary_read()[i];
                }
            }
            Arrays.sort(words1);
            vocab = words1;
            again(vocab);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void again(String[] vocab) {
        try {
            display = word.nextLine();
            for (int i = 0; i < vocab.length; i++) {
                if (vocab[i].equals(display)) {
                    if (record.contains(display)) {
                        System.out.println("word has already been used. \n you didnt win.");
                    } else {
                        record += display + " - ";
                        for (int j = 0; j < vocab.length; j++) {
                            
                        }
                        System.out.println(record);
                        again(vocab);
                    }
                } else {
                    System.out.println("Word doesnt exist in the dictionary. \n you didnt win.");
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void gamelvl2() {
        String[] vocab;
        System.out.println("play the game (level 1) ");
        System.out.print("enter a word: \n");
        try {
            vocab = dict.dictionary_read();
            again(vocab);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

}
