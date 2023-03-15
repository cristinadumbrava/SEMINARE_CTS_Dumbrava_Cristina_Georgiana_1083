package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.readers.AngajatReader;
import cts.s02.principii_clean_code.clase.readers.AplicantReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AplicantReader readerAplicanti = new AngajatReader("angajati.txt");
			listaAngajati = readerAplicanti.readAplicants();
			Angajat.setSumaFinantata(20);
			for(Aplicant angajat : listaAngajati){
				System.out.println(angajat.toString());
				angajat.afisareFinantare();
				angajat.afisareStatus();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
