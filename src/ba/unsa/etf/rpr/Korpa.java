package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Artikl> artikli;

    public Korpa(){
        artikli  = new ArrayList<Artikl>();
    }

    public  Artikl[] getArtikli() {
        return artikli.toArray(new Artikl[0]);
    }

    public boolean dodajArtikl(Artikl a){
        if(artikli.size()==50) return false;
        artikli.add(a);
        return  true;
    }
    public int dajUkupnuCijenuArtikala(){
        int suma=0;
        for(int i=0;i<artikli.size();i++){
            suma = suma + artikli.get(i).getCijena();
        }
        return  suma;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl novi = null;
        for(int i=0;i<artikli.size();i++)
            if(kod.equals(artikli.get(i).getKod())) {
                novi = artikli.get(i);
                break;
            }

        artikli.remove(novi);
        return novi;
    }
}
