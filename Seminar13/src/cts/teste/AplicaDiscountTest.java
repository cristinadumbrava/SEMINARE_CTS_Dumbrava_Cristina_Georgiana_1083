package cts.teste;

import cts.categorii.Categorie1;
import cts.clase.PachetTuristic;
import cts.dubluri.FakePersoana;
import jdk.jfr.Category;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AplicaDiscountTest {

    @Tag("Tag1")
    @Test
    void poatePrimiDiscount(){
        FakePersoana persoana = new FakePersoana();
        persoana.setGetVarstaValue(65);
        PachetTuristic pachet = new PachetTuristic(persoana, "Baile Felix", 1000.0);
        pachet.aplicaDiscountVarstnici(20);
        assertEquals(800, pachet.getPret());
   }

    @Tag("Tag2")
    @Test
    void nuPoatePrimiDiscount(){
        FakePersoana persoana = new FakePersoana();
        persoana.setGetVarstaValue(25);
        PachetTuristic pachet = new PachetTuristic(persoana, "Baile Felix", 1000.0);
        pachet.aplicaDiscountVarstnici(20);
        assertEquals(800, pachet.getPret());
    }




}