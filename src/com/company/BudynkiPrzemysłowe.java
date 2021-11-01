package com.company;

public class BudynkiPrzemysłowe extends Budynk{
    public BudynkiPrzemysłowe(String rodzaj, int metrazs, int rokBudowy, int iloscPokoji, String nrDomu) {
        super(rodzaj, metrazs, rokBudowy, iloscPokoji, nrDomu);
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Rodzaj budynku: |")
                .append(this.getRodzaj())
                .append(" Ilość metrów budynku: |")
                .append(this.getMetrazs())
                .append(" Rok budowy budynku: |")
                .append(this.getRokBudowy())
                .append(" Ilość pokoji w budynku: |")
                .append(this.getIloscPokoji())
                .append(" Unikalny numer budynku: |")
                .append(this.getNrDomu());
        if(this.isWypozyczony()){
            System.out.println("--wypozyczony");
        }else{
            System.out.println("--wolny");
        }
        return sb.toString();
    }
}
