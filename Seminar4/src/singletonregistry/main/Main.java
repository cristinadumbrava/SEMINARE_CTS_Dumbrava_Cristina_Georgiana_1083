package singletonregistry.main;

import singletonregistry.DomeniuInternet;

public class Main {
    public static void main(String[] args){
        DomeniuInternet domeniuInternet1 = DomeniuInternet.getDomeniu("seminar4.ro");
        DomeniuInternet domeniuInternet2 = DomeniuInternet.getDomeniu("seminar5.ro");
        DomeniuInternet domeniuInternet3 = DomeniuInternet.getDomeniu("seminar5.ro");

        domeniuInternet1.setAnInregistrare(2003);
        domeniuInternet2.setAnInregistrare(2011);
        domeniuInternet3.setAnInregistrare(2008);

        System.out.println(domeniuInternet1.toString());
        System.out.println(domeniuInternet2.toString());  //nu apelam constructorul, ci setter-ul
        System.out.println(domeniuInternet3.toString());

        //fac modificarile pt aceeasi instanta, deci ia in considerare ultima modificare
    }
}
