package ba.unsa.etf.rpr;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Supermarket {
    ArrayList<Artikl> artikli;

    public Supermarket(){
        artikli  = new ArrayList<Artikl>();
    }


    public Artikl[] getArtikli() {
        return artikli.toArray(new Artikl[0]);
    }
/*
    public Artikl izbaciArtklSaKodom(String kod){
        Artikl novi = null;
        for(int i=0;i<artikli.size();i++)
            if(artikli.get(i).getKod().equals(kod))
                novi = artikli.get(i);

        artikli.remove(novi);
        return novi;
    }
*/
    public void dodajArtikl(Artikl novi){

        artikli.add(novi);

    }



    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl novi = null;
        for(int i=0;i<artikli.size();i++)
            if(artikli.get(i).getKod().equals(kod))
                novi = artikli.get(i);

       // if(artikli.size())
            artikli.remove(novi);
        return  novi;
    }
}
