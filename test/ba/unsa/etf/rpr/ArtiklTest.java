package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl artikl = new Artikl("Lopta", 50,"100");
        assertEquals("Lopta",artikl.getNaziv());
    }

    @Test
    void getKod() {
        Artikl artikl = new Artikl("Auto", 50000,"77");
        assertEquals("77",artikl.getKod());
    }

    @Test
    void getCijena() {
        Artikl artikl = new Artikl("Monitor", 250,"11");
        assertEquals(250,artikl.getCijena());
    }
}