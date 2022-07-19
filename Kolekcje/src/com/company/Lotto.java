package com.company;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;


public class Lotto {

    public static void main(String[] args) {
        int i, days;
        days = 1;
        Scanner in = new Scanner(System.in);
        TreeSet LiczbyM = new TreeSet();
        TreeSet LosLiczby = new TreeSet();
        System.out.println("Napisz 6 liczb z puli od 1 do 49");
        for (i=0; i<6; i++){
            int liczba = in.nextInt();
            LiczbyM.add(liczba);
        }
        System.out.println("Your numbers" + LiczbyM);
        Random los = new Random();
        for (i = 0; i < 6; i++){
            int Losliczba;
            Losliczba = los.nextInt(50);
            LosLiczby.add(Losliczba);
        }
        System.out.println(LosLiczby);
        do{
            LosLiczby.removeAll(LosLiczby);
            for (i = 0; i < 6; i++){
                int Losliczba;
                Losliczba = los.nextInt(50);
                LosLiczby.add(Losliczba);
            }
            //System.out.println(LosLiczby);
            days++;
        } while ((LiczbyM.equals(LosLiczby)) == false);
        System.out.println("Potrzebne " + days + " dni, żeby wprowadzone liczby były jednakowe z losowanymi ");
        LocalDate tomorrow = LocalDate.now().plusDays(days);
        System.out.println("You will win lotto at "+ tomorrow);
    }

}
