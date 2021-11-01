package com.company;

public class Budynk {
    private String rodzaj;
    private int metrazs;
    private int rokBudowy;
    private int iloscPokoji;
    private String nrDomu;
    private boolean Wypozyczony;

    public Budynk(String rodzaj, int metrazs, int rokBudowy, int iloscPokoji, String nrDomu) {
        this.rodzaj = rodzaj;
        this.metrazs = metrazs;
        this.rokBudowy = rokBudowy;
        this.iloscPokoji = iloscPokoji;
        this.nrDomu = nrDomu;
        this.Wypozyczony = false;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public int getMetrazs() {
        return metrazs;
    }

    public void setMetrazs(int metrazs) {
        this.metrazs = metrazs;
    }

    public int getRokBudowy() {
        return rokBudowy;
    }

    public void setRokBudowy(int rokBudowy) {
        this.rokBudowy = rokBudowy;
    }

    public int getIloscPokoji() {
        return iloscPokoji;
    }

    public void setIloscPokoji(int iloscPokoji) {
        this.iloscPokoji = iloscPokoji;
    }

    public String getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }

    public boolean isWypozyczony() {
        return Wypozyczony;
    }

    public void setWypozyczony(boolean wypozyczony) {
        Wypozyczony = wypozyczony;
    }
}
