package com.company;

public class Mieszkanie extends Budynk {
    public int ktorePietro;

    public Mieszkanie(String rodzaj, int metrazs, int rokBudowy, int iloscPokoji, String nrDomu,int ktorePietro) {
        super(rodzaj, metrazs, rokBudowy, iloscPokoji, nrDomu);
        this.ktorePietro = ktorePietro;
    }

    public int getKtorePietro() {

        return ktorePietro;
    }

    public void setKtorePietro(int ktorePietro) {
        this.ktorePietro = ktorePietro;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Rodzaj budynku: |")
                .append(this.getRodzaj())
                .append(" Ilość metrów mieszkania: |")
                .append(this.getMetrazs())
                .append(" Rok budowy mieszkania: |")
                .append(this.getRokBudowy())
                .append(" Ilość pokoji w mieszkaniu: |")
                .append(this.getIloscPokoji())
                .append(" Unikalny numer mieszkania: |")
                .append(this.getNrDomu())
                .append(" Piętro na którym znajduje się mieszkanie: |")
                .append(this.getKtorePietro());
        if(this.isWypozyczony()){
            sb.append("--wypozyczony");
        }else{
            sb.append("--wolny");
        }
        return sb.toString();
    }
}
