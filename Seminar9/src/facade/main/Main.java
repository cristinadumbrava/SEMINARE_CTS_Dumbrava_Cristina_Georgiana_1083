package facade.main;

import facade.clase.Autobuz;
import facade.clase.AutobuzSimplificat;

public class Main {
    public static void main(String[] args){

     //   Autobuz autobuz = new Autobuz("B1235");
//        autobuz.deschideUsaFata();
//        autobuz.deschideUsaSpate();
//        autobuz.deschideUsaMijloc();

       // AutobuzSimplificat autobuzSimplificat = new AutobuzSimplificat(autobuz);
        AutobuzSimplificat autobuzSimplificat = new AutobuzSimplificat("B1235");
        autobuzSimplificat.deschideUsi();
        autobuzSimplificat.ramaneLibera();
    }
}
