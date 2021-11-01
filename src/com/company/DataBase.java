package com.company;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Budynk> budynek=new ArrayList<>();

    public DataBase(){
        this.budynek.add(new Dom("Dom jednorodziny ",90 ,2020 ,4 ,"DSM1","TAK"));
        this.budynek.add(new Dom("Blizniak ",200 ,1998 ,10 ,"DSM2","NIE"));
        this.budynek.add(new Mieszkanie("Kawalerka ",30 ,2012 ,2 ,"DSM3",1));
        this.budynek.add(new Mieszkanie("Mieszkanie ",50 ,2015 ,4 ,"DSM4",3));
        this.budynek.add(new BudynkiPrzemysłowe("Sklep ",200 ,2000 ,1 ,"DSM5"));
        this.budynek.add(new BudynkiPrzemysłowe("Hala magazynowa ",300 ,2011 ,1 ,"DSM5"));
    }
    public Budynk znajdzNieWypozyczonyBudynek(String nrBudynku){
        Budynk budynek=this.znajdzBudynek(nrBudynku);
        if(budynek==null||budynek.isWypozyczony()) {
            return null;
        }else{
            return budynek;
        }

    }
    public Budynk zjadzWypozyczonyBudyne(String nrBudynku){
        Budynk budynek=this.znajdzBudynek(nrBudynku);
        if(budynek==null||(!budynek.isWypozyczony())){
            return null;
        }else{
            return budynek;
        }
    }
    public Budynk znajdzBudynek(String nrBudynku){
        for(Budynk budynek:this.budynek){
            if(budynek.getNrDomu().equals(nrBudynku)){
                return budynek;
            }
        }
        return null;
    }

    public List<Budynk> getBudynek() {
        return budynek;
    }
}
