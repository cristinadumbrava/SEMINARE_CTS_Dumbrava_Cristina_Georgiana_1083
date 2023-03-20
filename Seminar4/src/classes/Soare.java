package classes;

public class Soare {
    private float diametru;
    private String culoare;

    //lazy initialization
    private static Soare instance = null;

    private Soare(float diametru, String culoare) {
        this.diametru = diametru;
        this.culoare = culoare;
    }

    public static synchronized Soare getInstance(float diametru, String culoare){
        if(Soare.instance == null){
            instance = new Soare(diametru, culoare);
        }
        return Soare.instance;
    }

    @Override
    public String toString() {
        return "Soare{" +
                "diametru=" + diametru +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
