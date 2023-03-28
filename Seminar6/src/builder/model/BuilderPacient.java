package builder.model;

public class BuilderPacient implements Builder{

    Pacient pacient;

    @Override
    public Pacient build() {
        return pacient;
    }

    public BuilderPacient(String nume) {
        this.pacient = new Pacient(nume, false, false, false, false);
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public BuilderPacient setNume(String nume) {
        throw new IllegalArgumentException("not aplicable!");
    }

    public BuilderPacient setPatRabatabil(boolean patRabatabil) {
        pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public BuilderPacient setMicDejunInclus(boolean micDejunInclus) {
        pacient.setMicDejunInclus(micDejunInclus);
        return this;
    }

    public BuilderPacient setPapuciDeCamera(boolean papuciDeCamera) {
       pacient.setPapuciDeCamera(papuciDeCamera);
       return this;
    }

    public BuilderPacient setHalatPentruInterior(boolean halatPentruInterior) {
        pacient.setHalatPentruInterior(halatPentruInterior);
        return this;
    }


}
