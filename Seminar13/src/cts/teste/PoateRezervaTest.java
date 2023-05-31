package cts.teste;

import cts.clase.IPersoana;
import cts.clase.PachetTuristic;
import cts.clase.Persoana;
import cts.dubluri.StubPersoana;
import cts.dubluri.StubPersoanaMinora;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PoateRezervaTest  {

    @Tag("Tag1")
    @Test
    void poateRezervaPachet() {
        IPersoana persoana = new StubPersoana();
        PachetTuristic pachet1 = new PachetTuristic(persoana, "Roma", 1000.0);
        assertTrue(pachet1.poateRezerva());
    }

    //dezavantaj: cream prea multe stub uri

    @Tag("Tag2")
    @Test
    void poateRezervaPersoanaMinora(){
        IPersoana persoana = new StubPersoanaMinora();
        PachetTuristic pachet = new PachetTuristic(persoana, "Madrid", 2500.0);
        assertFalse(pachet.poateRezerva());
    }



}