package cts.teste;

import cts.clase.ExceptieCNPInexistent;
import cts.clase.ExceptieVarsta;
import cts.clase.IPersoana;
import cts.clase.Persoana;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class PersoanaTest {
    @Tag("Tag1")
    @Test
    void testGetVarstaRight() {
        IPersoana persoana = new Persoana("Adrian", "5010512415523");
        assertEquals(22, persoana.getVarsta());

    }

    //test boundary limita superioara
    @Tag("Tag2")
    @Test
    void testGetVarstaBoundaryNonNascut(){
        IPersoana persoana = new Persoana("Marcel", "5230523551122");
        assertEquals(0, persoana.getVarsta());
    }

    @Tag("Tag1")
    @Test
    void testGetVarstaBoundaryAn2000(){
        IPersoana persoana = new Persoana("Valentin", "6000101442333");
        assertEquals(23, persoana.getVarsta());
    }

    //limita superioara pt intervalul (1900,1999)
    @Tag("Tag1")
    @Test
    void testGetVarstaBoundaryAn1999(){
        IPersoana persoana = new Persoana("Valentin", "1991231551177");
        assertEquals(23, persoana.getVarsta());
    }


    //inverse relationship - plecam de la rezultat si ne intoarcem la
    //crosscheck - determin rezultatul prin intermediul altei metode
    //error condition

    @Tag("Tag2")
    @Test
    void testGetVarstaError(){
        IPersoana persoana = new Persoana("Matei", "6230724661122");
        //testam ca daca punem o data din viitor, ne arunca o exceptie
        assertThrows(ExceptieVarsta.class, () -> persoana.getVarsta());

    }

    //performance
    @Tag("Tag2")
    @Test
    void testGetVarstaPerformance(){
        IPersoana persoana = new Persoana("Ana", "6010256845129");
        assertTimeout(Duration.ofMillis(100), () -> persoana.getVarsta());
    }

    @Tag("Tag1")
    @Test
    void testConstructorVarstaConformance(){
        Persoana persoana = new Persoana("Elena", "6020304562318");
        assertEquals(13, persoana.CNP.length());
    }

    //order
    @Tag("Tag1")
    @Test
    void testGetVarstaOrder(){
        IPersoana persoana = new Persoana("Alin", "5020506987456");
        IPersoana persoana1 = new Persoana("Alina", "6030506987456");
        assertTrue(persoana.getVarsta() > persoana1.getVarsta());
    }

    //CORRECT
    //range - trebuiesc verificate si valorile din interior() + limite(boundary) + valori din afara intervalelor(error condition)

    //refference - metoda va apela ceva ce nu tine de ea
    //existence - verificam daca exista ceva ~ error condition

    @Tag("Tag2")
    @Test
    void testGetVarstaCNP(){
        IPersoana persoana = new Persoana(null, null);
        assertThrows(ExceptieCNPInexistent.class, () -> persoana.getVarsta());
    }

    //cardinalitate - 0,1,n elemente
    @Tag("Tag2")
    @Test
    void testGetVarstaCardinalitate(){
        IPersoana persoana = new Persoana("Andra", "6220523446767");
        assertEquals(1, persoana.getVarsta());
    }

    //time ~ performance



}