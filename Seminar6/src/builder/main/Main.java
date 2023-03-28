package builder.main;

import builder.model.Builder;
import builder.model.BuilderPacient;
import builder.model.BuilderPacient2;
import builder.model.Pacient;

public class Main {
    public static void main(String[] args){
        //BuilderPacient builderPacient = new BuilderPacient();//trebuie sa folosim tipul abstract pt declarare
        Builder builderPacient = new BuilderPacient("Mihai");
        Pacient pacient1 = builderPacient.setMicDejunInclus(true).build();
        Pacient pacient2 = builderPacient.setMicDejunInclus(true).build(); //nu apelam constructorul pacientului; daca modific aici atributul, se modifica si in prima insanta
        System.out.println(pacient1); //builder e apelat o singura data; avem o singura instanta
        System.out.println(pacient2);

        Builder builderPacient2 = new BuilderPacient2();
        Pacient pacient3 = builderPacient2.setNume("Matei").setHalatPentruInterior(true).build();
        Pacient pacient4 = builderPacient2.setNume("Alex").build();//folosim acelasi builder, deci atributul va fi deja initializat; pt reinitializare apelam setter-ul pt atributul pe care vrem sa l modificam
        System.out.println(pacient3);
        System.out.println(pacient4);

    }
}
