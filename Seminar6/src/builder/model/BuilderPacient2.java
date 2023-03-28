package builder.model;

public class BuilderPacient2 implements Builder{
    private String nume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;


    @Override
    public Pacient build() {
        return new Pacient(this.nume, this.patRabatabil, this.micDejunInclus, this.papuciDeCamera, this.halatPentruInterior);
    }

    public BuilderPacient2() {
        this.nume = "Anonim";
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciDeCamera = false;
        this.halatPentruInterior = false;
    }

    public Builder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public Builder setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public Builder setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
        return this;
    }

    public Builder setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
        return this;
    }

    public Builder setHalatPentruInterior(boolean halatPentruInterior) {
        this.halatPentruInterior = halatPentruInterior;
        return this;
    }
}
