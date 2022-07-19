package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class ASCII {
    public static void main(String[] args) throws IOException {
        int i;
        TreeSet Ascii = new TreeSet<>();
        FileReader fr = new FileReader("C:\\Users\\Victoria\\Desktop\\NAPIS.txt");
        Scanner odczyt = new Scanner(fr);
        while(odczyt.hasNextLine()) {
            String odcz = odczyt.toString();
            String napis = fr.toString();
            char[] tablicaChar;
            for(i = 0; i < odcz.length() - 1; i++){
                tablicaChar = napis.toCharArray();
                System.out.println(tablicaChar);
                System.out.println((int) tablicaChar[i]);
                if ((int)tablicaChar[i+1] == ((int)tablicaChar[i])+1){
                    Ascii.add(napis);
                    System.out.println(Ascii);
                }
            }
        }
        fr.close();
    }
}
