package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void izbaciArtklSaKodomKodPraznogSupermarketa() {
        Supermarket supermarket = new Supermarket();
        assertEquals(null, supermarket.izbaciArtiklSaKodom("kod"));
    }

    @Test
    void izbaciArtklSaKodomSupermarketa() {
        Supermarket supermarket =  new Supermarket();
        supermarket.dodajArtikl(new Artikl("aa",10,"12"));
        supermarket.dodajArtikl(new Artikl("aa",104,"3"));
        supermarket.dodajArtikl(new Artikl("aa",103,"1"));
        Artikl izbaceni = supermarket.izbaciArtiklSaKodom("3");
        assertEquals("aa 3 104", izbaceni.toString());
    }


}