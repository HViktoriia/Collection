package com.company;

import java.io.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Powtorzenie {
    public static void main(String[] args) throws IOException {
        HashSet filtred = new HashSet<>();
        HashSet powt = new HashSet<>();
        File Fl = new File("C:\\Users\\Victoria\\Desktop\\NAPIS.txt");
        FileReader fr = new FileReader("C:\\Users\\Victoria\\Desktop\\NAPIS.txt");
        Scanner odczyt = new Scanner(Fl);
        InputStream Fil = new FileInputStream(Fl);
        //filtred.addAll(Fil);
        while(odczyt.hasNextLine()){
            filtred.add(odczyt);
            if (!filtred.equals(Fil)) {
                powt.add(Fil);
            }
            System.out.println(odczyt.nextLine());
            //System.out.println("Potórzenie: ");
           // System.out.println(powt);
        }
        System.out.println("Potórzenie: ");
        System.out.println(powt);
        fr.close();
    }
}
