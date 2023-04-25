package facade.clase;

public class Autobuz {
    private String nrInmatriculare;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void deschideUsaFata(){
        System.out.println("Usa din fata a fost deschisa pentru autobuzul cu numarul " + this.nrInmatriculare);
    }

    public void deschideUsaMijloc(){
        System.out.println("Usa din mijloc a fost deschisa pentru autobuzul cu numarul " + this.nrInmatriculare);
    }

    public void deschideUsaSpate(){
        System.out.println("Usa din spate a fost deschisa pentru autobuzul cu numarul " + this.nrInmatriculare);
    }

    public void ramaneLiberaUsaFata(){
        System.out.println("Usa din fata poate fi deschisa pentru calatori pentru autobuzul cu numarul " + this.nrInmatriculare);
    }

    public void ramaneLiberaUsaMijloc(){
        System.out.println("Usa din mijloc poate fi deschisa pentru calatori pentru autobuzul cu numarul " + this.nrInmatriculare);
    }

    public void ramaneLiberaUsaSpate(){
        System.out.println("Usa din spate poate fi deschisa pentru calatori pentru autobuzul cu numarul " + this.nrInmatriculare);
    }
}
