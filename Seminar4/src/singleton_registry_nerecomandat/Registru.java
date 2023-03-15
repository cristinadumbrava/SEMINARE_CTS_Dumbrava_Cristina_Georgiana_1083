package singleton_registry_nerecomandat;

import java.util.HashMap;
import java.util.Map;

public class Registru {
    private static Map<String, Firma> firmeInregistrate = new HashMap<>();

   public static synchronized Firma getFirma(String denumire){
       if(!firmeInregistrate.containsKey(denumire)){
           Firma firma = new Firma(denumire, 0);
           firmeInregistrate.put(denumire, firma);
           return firma;
       }

       return firmeInregistrate.get(denumire);
   }
}
