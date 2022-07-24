package creational.abstractfactory;

public class S8Factory implements PhoneFactory {

    @Override
    public Phone getPhone(String model, String battery, int en, int boy) {
        return new S8(model, battery, en, boy);
    }
}
