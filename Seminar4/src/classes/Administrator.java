package classes;

public class Administrator {
    private String nume;
    private int varsta;

    //eager initialization- dezavantaj: obiectul e crear fie ca e folosit, fie ca nu
    private static Administrator instanta = new Administrator("Gigel", 20);


    public Administrator(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public static Administrator getInstance(){
        return Administrator.instanta;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
