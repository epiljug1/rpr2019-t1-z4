package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {



    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();
        assertTrue(korpa.dodajArtikl(new Artikl("Lopta",123,"100")));
    }

    @Test
    void testUkupneCijenePrazneKorpe(){
        Korpa korpa = new Korpa();
        assertEquals(0,korpa.dajUkupnuCijenuArtikala());
    }

    @Test
    void testUkupneCijeneKorpe(){
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Lopta",100,"1"));
        korpa.dodajArtikl(new Artikl("Auto",100,"2"));
        korpa.dodajArtikl(new Artikl("Lampa",100,"3"));
        korpa.dodajArtikl(new Artikl("Lopta",100,"4"));
        assertNotEquals(500,korpa.dajUkupnuCijenuArtikala());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Lopta",100,"1"));
        korpa.dodajArtikl(new Artikl("Auto",100,"2"));
        korpa.dodajArtikl(new Artikl("Lampa",100,"3"));
        korpa.dodajArtikl(new Artikl("Lopta",100,"4"));
        Artikl a = korpa.izbaciArtiklSaKodom("2");
        assertEquals("Auto 2 100", a.toString());
    }
}