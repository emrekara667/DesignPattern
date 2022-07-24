package creational.factory;

public class PhoneSaler {


    public static void main(String[] args) {


        Phone s8 = PhoneFactory.getPhone("s8", "2600mah", 4, 7);
        Phone note8 = PhoneFactory.getPhone("note8", "300mah", 5, 8);
        System.out.println("S8 spec");
        System.out.println(s8);
        System.out.println("note8 spec");
        System.out.println(note8);


    }
}
