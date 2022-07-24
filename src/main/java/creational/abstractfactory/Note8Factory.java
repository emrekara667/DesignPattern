package creational.abstractfactory;

public class Note8Factory implements PhoneFactory{
    @Override
    public Phone getPhone(String model, String battery, int en, int boy) {
        return new Note8(model,battery,en,boy);
    }
}
