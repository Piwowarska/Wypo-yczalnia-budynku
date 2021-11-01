package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws IOException {
	DataBase dataBase=new DataBase();
        GUI gui = new GUI();
        while(true){
            gui.showMenu();

            Scanner sc=new Scanner(System.in);
            String choose=sc.nextLine();
            switch(choose){
                case "1":
                    for(Budynk budynek:dataBase.getBudynek()) {
                        System.out.println(budynek);
                    }
                    break;
                case"2":
                    System.out.println("Podaj unikalny numer budynku");
                    String nrBudynku=sc.nextLine();
                    Budynk budynek = dataBase.znajdzNieWypozyczonyBudynek(nrBudynku);
                    if(budynek==null) {
                        System.out.println("Nie ma takiego numeru domu lub jest wypożyczony");
                    }else {
                        budynek.setWypozyczony(true);
                        System.out.println("Wypożyczyłeś budynek");
                    }
                    break;
                case"3":
                    System.out.println("Podaj unikalny numer budynku");
                    String nrBudynku1=sc.nextLine();
                    Budynk budynk1=dataBase.zjadzWypozyczonyBudyne(nrBudynku1);
                    if(nrBudynku1==null){
                        System.out.println("Nie ma takiego numeru domu lub jest wypożyczony");
                    }else{
                        budynk1.setWypozyczony(false);
                    }
                    break;
                case"4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nie ma takiego numeru menu");

            }
        }
    }
}
