package singletonregistry;

import java.util.HashMap;
import java.util.Map;

public class DomeniuInternet {
    private String nume;
    private int anInregistrare;
    private static Map<String, DomeniuInternet> domeniiInternet = new HashMap<>();

    public DomeniuInternet(String nume, int anInregistrare) {
        this.nume = nume;
        this.anInregistrare = anInregistrare;
    }

    public static DomeniuInternet getDomeniu(String nume){
        if(domeniiInternet.containsKey(nume)){
            return domeniiInternet.get(nume);
        }
        else{
            DomeniuInternet domeniuInternet = new DomeniuInternet(nume, 2023);
            domeniiInternet.put(nume, domeniuInternet);
            return domeniuInternet;
        }

    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAnInregistrare(int anInregistrare) {
        this.anInregistrare = anInregistrare;
    }

    @Override
    public String toString() {
        return "DomeniuInternet{" +
                "nume='" + nume + '\'' +
                ", anInregistrare=" + anInregistrare +
                '}';
    }
}


//metoda e indep de obiect; metoda se apeleaza pe obiect, iar functia pe clasa