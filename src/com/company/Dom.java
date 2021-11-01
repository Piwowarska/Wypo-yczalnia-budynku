package com.company;

public class Dom extends Budynk{
    private String garaz;

    public Dom(String rodzaj, int metrazs, int rokBudowy, int iloscPokoji, String nrDomu, String garaz) {
        super(rodzaj, metrazs, rokBudowy, iloscPokoji, nrDomu);
        this.garaz = garaz;
    }

    public String getGaraz() {
        return garaz;
    }

    public void setGaraz(String garaz) {
        this.garaz = garaz;
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
                .append(" Unikalny numer domu: |")
                .append(this.getNrDomu())
                .append(" Garaz: ")
                .append(this.getGaraz());
        if(this.isWypozyczony()){
            sb.append("--wypozyczony");
        }else{
            sb.append("--wolny");
        }
        return sb.toString();
    }
}
