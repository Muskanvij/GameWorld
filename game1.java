import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class game1 {

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
            String[] words2 = new String[dict.dictionary_read().length - a1 -1]; 
            boolean decide = false;
            int k = 0;
            for (int i = 1; i < dict.dictionary_read().length; i++) {
                Boolean flag = Character.isDigit(dict.dictionary_read()[i].charAt(0));
                if (flag) {
                    decide = flag;
                    k = i;
                } else {
                    if (decide) {
                        words2[i-k-1] = dict.dictionary_read()[i];
                    } else {
                        words1[i-1] = dict.dictionary_read()[i];
                    }

                }
            }
            vocab = words1;
            result(again(vocab));
            again(vocab);
        } catch (Exception e) {
            e.printStackTrace();
            //TODO: handle exception
        }
    }

    public int again(String[] vocab) {
        int whttosay=4;
        try {
            display = word.nextLine();
            for (int i = 0; i < vocab.length; i++) {
                if (vocab[i].equals(display)) {
                    if (record.contains(display)) {
                        whttosay =0;
                    } else if (!record.contains(display)){
                        record += " - " + display + " - ";
                        String last = display.substring(display.length()-1);
                        for (int j = 0; j < vocab.length; j++) {
                            if (last.substring(0,1).equals(vocab[j].substring(0,1)) && !record.contains(vocab[j])) {
                                record += vocab[j];
                                System.out.print(record + " - ");
                                again(vocab);
                                break;
                            } else {
                                whttosay = 2;
                            }
                        }
                    }
                } else if(!vocab[i].equals(display)){
                    whttosay =1;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return whttosay;
    }

    public void result(int whttosay) {
        switch (whttosay) {
            case 0:
                System.out.println("word has already been used. \n you didnt win.");
                break;
            case 1:
                System.out.println("Word doesnt exist in the dictionary. you didnt win.");
                break;
            case 2:
                System.out.println("Well done! You win.");
                break;
            case 3:
                System.out.println("Well done! You win.");
                break;
            default :
                System.out.println("error");
                break;
        }
    }

    public void gamelvl2() {
        String[] vocab;
        System.out.println("play the game (level 2) ");
        System.out.print("enter a word: \n");
        try {
            vocab = dict.dictionary_read();
            result(again(vocab));
            again(vocab);
        } catch (Exception e) {
            //TODO: handle exception
        }

    }

}
