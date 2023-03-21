package prototype;

public class Autobuz implements MijlocTransport{
    private String nrInmatriculare;
    private Integer nrLocuri;

    public Autobuz(String nrInmatriculare, Integer nrLocuri){
        if(nrLocuri > 10 && nrLocuri < 50){
            this.nrLocuri = nrLocuri;
        }
        if(nrInmatriculare.length() == 7){
            this.nrInmatriculare = nrInmatriculare;
        }
    }

    public Autobuz(){
        this.nrInmatriculare = "";
        this.nrLocuri = 0;
    }

    @Override
    public MijlocTransport clonare() {
        Autobuz autobuz = new Autobuz();
        autobuz.nrLocuri = this.nrLocuri;
        autobuz.nrInmatriculare = this.nrInmatriculare; //deep copy
        return autobuz;
    }

    public void setNrInmatriculare(String nrInmatriculare){
        this.nrInmatriculare = nrInmatriculare;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "nrInmatriculare='" + nrInmatriculare + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
