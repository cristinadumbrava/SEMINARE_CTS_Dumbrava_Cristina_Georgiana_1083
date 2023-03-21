package factorymethod;

public class FactoryBrancardier implements Factory{

    @Override
    public PersonalSpital createObject(String nume) {
        return new Brancardier(nume);
    }
}
