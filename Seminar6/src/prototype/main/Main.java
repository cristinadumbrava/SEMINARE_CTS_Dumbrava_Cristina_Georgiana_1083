package prototype.main;

import prototype.classes.Prototype;
import prototype.classes.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<String, Float> solutii = new HashMap<>();
        solutii.put("solutia1", (float) 40.2);
        solutii.put("solutia2", (float) 10);
        solutii.put("solutia3", (float) 60);

        Reteta reteta1 = new Reteta(solutii,"reteta1",(float)110.2);

        Prototype retetaLaborator = reteta1.clonare();
        Prototype retetaPacient = reteta1.clonare();


        System.out.println(reteta1.toString());
        System.out.println(retetaLaborator.toString());
        System.out.println(retetaPacient.toString());

    }
}
