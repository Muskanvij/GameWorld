import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class array_o_linkedlist {

	Node dictionary,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;// head node
    
    static class Node { // static so that it can be accesed by main
        String word;
        String level;
        Node next;

        Node(String w, String l) {
            word = w;
            level = l;
        } // constructor
    }

    /* This function prints contents of linked list starting from head */
    public void printList() {
        String display1 = "", display2 = "";
        Node ah = a,bh = b,ch = c,dh =d,eh=e,fh=f,gh=g,hh=h,ih=i,jh=j,kh=k,lh=l,mh=m,nh=n,oh=o,ph=p,qh=q,rh=r,sh=s,th=t,uh=u,vh=v,wh=w,xh=x,yh=y,zh=z;
        while (ah != null) {
            if (ah.level.equals("1")) {
                display1 += ah.word +" " ;
            } else if (ah.level.equals("2")){
                display2 += ah.word+ " " ;
            }
            ah = ah.next;
        }
        while (bh != null) {
            if (bh.level.equals("1")) {
                display1 += bh.word+ " " ;
            } else if (bh.level.equals("2")) {
                display2 += bh.word+ " " ;
            }
            bh = bh.next;
        }
        while (ch != null) {
            if (ch.level.equals("1")) {
                display1 += ch.word+ " " ;
            } else if (ch.level.equals("2")) {
                display2 += ch.word+ " " ;
            }
            ch = ch.next;
        }
        while (dh != null) {
            if (dh.level.equals("1")) {
                display1 += dh.word+ " " ;
            } else if (dh.level.equals("2")) {
                display2 += dh.word+ " " ;
            }
            dh = dh.next;
        }
        while (eh != null) {
            if (eh.level.equals("1")) {
                display1 += eh.word+ " " ;
            } else if (eh.level.equals("2")) {
                display2 += eh.word+ " " ;
            }
            eh = eh.next;
        }
        while (fh != null) {
            if (fh.level.equals("1")) {
                display1 += fh.word+ " " ;
            } else if (fh.level.equals("2")) {
                display2 += fh.word+ " " ;
            }
            fh = fh.next;
        }
        while (gh != null) {
            if (gh.level.equals("1")) {
                display1 += gh.word+ " " ;
            } else if (gh.level.equals("2")) {
                display2 += gh.word+ " " ;
            }
            gh = gh.next;
        }
        while (hh != null) {
            if (hh.level.equals("1")) {
                display1 += hh.word+ " " ;
            } else if (hh.level.equals("2")) {
                display2 += hh.word+ " " ;
            }
            hh = hh.next;
        }
        while (ih != null) {
            if (ih.level.equals("1")) {
                display1 += ih.word+ " " ;
            } else if (ih.level.equals("2")) {
                display2 += ih.word+ " " ;
            }
            ih = ih.next;
        }
        while (jh != null) {
            if (jh.level.equals("1")) {
                display1 += jh.word+ " " ;
            } else if (jh.level.equals("2")) {
                display2 += jh.word+ " " ;
            }
            jh = jh.next;
        }
        while (kh != null) {
            if (kh.level.equals("1")) {
                display1 += kh.word+ " " ;
            } else if (kh.level.equals("2")) {
                display2 += kh.word+ " " ;
            }
            kh = kh.next;
        }
        while (lh != null) {
            if (lh.level.equals("1")) {
                display1 += lh.word+ " " ;
            } else if (lh.level.equals("2")) {
                display2 += lh.word+ " " ;
            }
            lh = lh.next;
        }
        while (mh != null) {
            if (mh.level.equals("1")) {
                display1 += mh.word+ " " ;
            } else if (mh.level.equals("2")) {
                display2 += mh.word+ " " ;
            }
            mh = mh.next;
        }
        while (nh != null) {
            if (nh.level.equals("1")) {
                display1 += nh.word+ " " ;
            } else if (nh.level.equals("2")) {
                display2 += nh.word+ " " ;
            }
            nh = nh.next;
        }
        while (oh != null) {
            if (oh.level.equals("1")) {
                display1 += oh.word+ " " ;
            } else if (oh.level.equals("2")) {
                display2 += oh.word+ " " ;
            }
            oh = oh.next;
        }
        while (ph != null) {
            if (ph.level.equals("1")) {
                display1 += ph.word+ " " ;
            } else if (ph.level.equals("2")) {
                display2 += ph.word+ " " ;
            }
            ph = ph.next;
        }
        while (qh != null) {
            if (qh.level.equals("1")) {
                display1 += qh.word+ " " ;
            } else if (qh.level.equals("2")) {
                display2 += qh.word+ " " ;
            }
            qh = qh.next;
        }
        while (rh != null) {
            if (rh.level.equals("1")) {
                display1 += rh.word+ " " ;
            } else if (rh.level.equals("2")) {
                display2 += rh.word+ " " ;
            }
            rh = rh.next;
        }
        while (sh != null) {
            if (sh.level.equals("1")) {
                display1 += sh.word+ " " ;
            } else if (sh.level.equals("2")) {
                display2 += sh.word+ " " ;
            }
            sh = sh.next;
        }
        while (th != null) {
            if (th.level.equals("1")) {
                display1 += th.word+ " " ;
            } else if (th.level.equals("2")) {
                display2 += th.word+ " " ;
            }
            th = th.next;
        }
        while (uh != null) {
            if (uh.level.equals("1")) {
                display1 += uh.word+ " " ;
            } else if (uh.level.equals("2")) {
                display2 += uh.word+ " " ;
            }
            uh = uh.next;
        }
        while (vh != null) {
            if (vh.level.equals("1")) {
                display1 += vh.word+ " " ;
            } else if (vh.level.equals("2")) {
                display2 += vh.word+ " " ;
            }
            vh = vh.next;
        }
        while (wh != null) {
            if (wh.level.equals("1")) {
                display1 += wh.word+ " " ;
            } else if (wh.level.equals("2")) {
                display2 += wh.word+ " " ;
            }
            wh = wh.next;
        }
        while (xh != null) {
            if (xh.level.equals("1")) {
                display1 += xh.word+ " " ;
            } else if (xh.level.equals("2")) {
                display2 += xh.word+ " " ;
            }
            xh = xh.next;
        }
        while (yh != null) {
            if (yh.level.equals("1")) {
                display1 += yh.word+ " " ;
            } else if (yh.level.equals("2")) {
                display2 += yh.word+ " " ;
            }
            yh = yh.next;
        }
        while (zh != null) {
            if (zh.level.equals("1")) {
                display1 += zh.word+ " " ;
            } else if (zh.level.equals("2")) {
                display2 += zh.word+ " " ;
            }
            zh = zh.next;
        }
        System.out.println("level 1 \n");
        String[] disp1,disp2;
        disp1 = display1.split(" ");
        disp2 = display2.split(" ");
        int i;
        for (int j = 0; j < 5; j++) {
            for (i = 0; i <=  6; i++) {
                System.out.print(disp1[i + (j*7)] + " ");
            }
            System.out.println("\n");
        }
        for (int j = 0; j < 5; j++) {
            for (i = 35; i <=  41; i++) {
                System.out.print(disp1[i + (j*7)] + " ");
            }
            System.out.println("\n");
        }
        for (int j = 0; j < 5; j++) {
            for (i = 70; i <=  76; i++) {
                if (i+(j*7)<disp1.length) {
                    System.out.print(disp1[i + (j*7)] + " ");
                }
            }
            if(i+(j*7)<disp1.length){
                System.out.println("\n");
            }
        }
        System.out.println("\n\nlevel 2 \n");

        for (int j = 0; j < 5; j++) {
            for (i = 0; i <=  6; i++) {
                System.out.print(disp2[i + (j*7)] + " ");
            }
            System.out.println("\n");
        }
        if (disp2.length>=35) {
            for (int j = 0; j < 5; j++) {
                for (i = 35; i <=  41; i++) {
                    if (i+(j*7)<disp2.length) {
                        System.out.print(disp2[i + (j*7)] + " ");
                    }
                }
                if(i+(j*7)<disp2.length){
                    System.out.println("\n");
                }
            }
        }
    }

    public static String[] dictionary_read() throws Exception {
        // System.out.println("wait whille the dictionary is loading..");
        File file = new File("dictionary.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st,load=null;
        String[] fnl ,ini;
        while ((st = br.readLine()) != null) {
            load += " " + st;
        }
        ini = load.split(" ");
        fnl = new String[ini.length-1];
        for (int i = 1; i < ini.length; i++) {
            fnl[i-1] = ini[i];
        }
        br.close();
        return fnl;
    }
    //insertion
    public static void appendStrToFile() throws Exception {
        String newword = "";
        int newlvl = 0;
        Scanner newscn = new Scanner(System.in);
        System.out.println("insert a word to the dictionary: ");
        System.out.println("Enter the word: ");
        newword = newscn.nextLine();
        System.out.println("difficulty level: ");
        newlvl = newscn.nextInt();
        Boolean flag = false;
        try { 
            for (int i = 0; i < dictionary_read().length-1; i++) {
                if (dictionary_read()[i].equals(newword)) {
                    flag = true;
                }
            }
            if (flag) {
                System.out.println("word already exists");
            } else {
                BufferedWriter out = new BufferedWriter(new FileWriter("dictionary.txt", true)); 
                if (newlvl == 2) {
                    out.write(" "+newword); 
                } else {
                // out.write(str);
                }
                System.out.println(newword+ " word is inserted");
                out.close();
            } 
        } 
        catch (IOException e) { 
            System.out.println("exception occoured" + e); 
        }
         
        newscn.close();
    }
    
    public static void main(String[] args) {

        try {
            int a1 = 0;
            for (int l = 0; l < dictionary_read().length; l++) {
                Boolean flag1 = Character.isDigit(dictionary_read()[l].charAt(0));
                if (flag1) {
                    a1 = l;
                }
            }
            String[] words1 = new String[dictionary_read().length -(dictionary_read().length - a1)-1]; 
            String[] words2 = new String[dictionary_read().length - a1 -1]; 
            boolean decide = false;
            int k = 0;
            for (int i = 1; i < dictionary_read().length; i++) {
                Boolean flag = Character.isDigit(dictionary_read()[i].charAt(0));
                if (flag) {
                    decide = flag;
                    k = i;
                } else {
                    if (decide) {
                        
                        words2[i-k-1] = dictionary_read()[i];
                        
                    } else {
                        words1[i-1] = dictionary_read()[i];
                    }

                }
            }
            Arrays.sort(words1);
            Arrays.sort(words2);
            // System.out.println(Arrays.toString(words1) + " \n" );
            // System.out.println(Arrays.toString(words2) + " \n" );
            array_o_linkedlist lst = new array_o_linkedlist();
            lst.dictionary = new Node("dictionary", "");
            //a
            lst.a = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'a') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.a; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'a') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.a; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //b
            lst.b = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'b') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.b; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'b') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.b; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //c
            lst.c = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'c') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.c; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'c') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.c; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //d
            lst.d = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'd') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.d; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'd') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.d; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //e
            lst.e = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'e') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.e; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'e') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.e; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //f
            lst.f = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'f') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.f; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'f') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.f; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //g
            lst.g = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'g') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.g; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'g') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.g; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //h
            lst.h = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'h') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.h; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'h') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.h; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //i
            lst.i = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'i') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.i; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'i') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.i; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //j
            lst.j = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'j') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.j; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'j') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.j; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //k
            lst.k = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'k') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.k; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'k') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.k; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //l
            lst.l = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'l') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.l; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'l') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.l; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //m
            lst.m = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'm') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.m; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'm') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.m; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //n
            lst.n = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'n') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.n; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'n') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.n; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //o
            lst.o = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'o') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.o; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'o') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.o; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //p
            lst.p = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'p') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.p; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'p') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.p; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //q
            lst.q = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'q') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.q; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'q') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.q; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //r
            lst.r = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'r') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.r; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'r') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.r; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //s
            lst.s = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 's') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.s; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 's') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.s; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //t
            lst.t = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 't') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.t; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 't') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.t; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //u
            lst.u = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'a') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.a; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'u') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.u; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //v
            lst.v = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'v') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.v; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'v') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.v; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //w
            lst.w = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'w') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.w; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'w') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.w; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //x
            lst.x = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'x') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.x; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'x') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.x; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //y
            lst.y = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'y') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.y; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'y') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.y; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            //z
            lst.z = new Node("", "");
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].charAt(0) == 'z') {
                    Node first = new Node(words1[i], "1");   
                    Node last = lst.z; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            for (int i = 0; i < words2.length; i++) {
                if (words2[i].charAt(0) == 'z') {
                    Node first = new Node(words2[i], "2");   
                    Node last = lst.z; 
                    while (last.next != null) { 
                    last = last.next; 
                    } 
                    last.next = first;
                }
            }
            lst.printList();

        } catch (Exception e) {
            e.printStackTrace();
        }

        
        
    }


}
