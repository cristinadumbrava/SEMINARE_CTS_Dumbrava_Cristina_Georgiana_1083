package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;

	private static Integer sumaFinantata = 30;

	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	@Override
	public String toString() {
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
				+ varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte  + ", DenumireProiect="
				+ Arrays.toString(denumireProiect) + "Clasa=" + clasa + ", Tutore=" + tutore;
	}

	public static void setSumaFinantata(Integer sumaFinantata) {
		Elev.sumaFinantata = sumaFinantata;
	}

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
				int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public void afisareFinantare() {
		System.out.println("Elevul " + super.getNume() + " " + super.getPrenume() + " primeste" + Elev.sumaFinantata + " Euro/zi in proiect.");
	}
	
}
