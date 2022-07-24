package creational.abstractfactory;

public interface PhoneFactory {
    Phone getPhone(String model, String battery, int en, int boy);
}
