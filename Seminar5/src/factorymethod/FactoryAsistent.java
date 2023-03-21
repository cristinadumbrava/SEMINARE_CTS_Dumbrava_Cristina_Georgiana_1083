package factorymethod;

public class FactoryAsistent implements Factory{

    @Override
    public PersonalSpital createObject(String nume) {
        return new Asistent(nume);
    }
}
