package prototype.main;

import prototype.Autobuz;
import prototype.MijlocTransport;

public class Main {
    public static void main(String[] args){
        MijlocTransport autobuz1 = new Autobuz("PH01CTS",23);
        MijlocTransport autobuz2 = new Autobuz("TR20DCG",32);
        Autobuz autobuz3 = (Autobuz) autobuz1.clonare();
        Autobuz autobuz4 = (Autobuz)autobuz2.clonare();

        autobuz4.setNrInmatriculare("TR10HAI");
        autobuz3.setNrInmatriculare("CT13WHY");

        System.out.println(autobuz1.toString());
        System.out.println(autobuz2.toString());
        System.out.println(autobuz3.toString());
        System.out.println(autobuz4.toString());

    }
}
