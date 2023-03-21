package factorymethod;

import factorymethod.PersonalSpital;

public class Brancardier implements PersonalSpital {
    private String nume;

    protected Brancardier(String nume){
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Brancardierul " + this.nume);
    }
}
