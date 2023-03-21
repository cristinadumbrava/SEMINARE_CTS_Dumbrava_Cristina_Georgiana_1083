package factorymethod;

public class FactoryMedic implements Factory{

    @Override
    public PersonalSpital createObject(String nume) {
        return new Medic(nume);
    }
}
