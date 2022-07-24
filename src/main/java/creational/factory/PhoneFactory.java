package creational.factory;

public class PhoneFactory {

    public static Phone getPhone(String model, String battery, int en, int boy){
        Phone phone;
        if("S8".equalsIgnoreCase(model)){
            phone = new S8(model, battery,en, boy);
        }else if ("note8".equalsIgnoreCase(model)){
            phone = new Note8(model, battery, en, boy);
        }else{
            throw new RuntimeException("It is not valid phone name!");
        }
        return phone;
    }

}
