package creational.factory;

public class Note8 implements Phone {
    private String model;
    private String battery;
    private int en;
    private int boy;

    public Note8(String model, String battery, int en, int boy) {
        this.model = model;
        this.battery = battery;
        this.en = en;
        this.boy = boy;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBattery() {
        return battery;
    }

    @Override
    public int getEn() {
        return en;
    }

    @Override
    public int getBoy() {
        return boy;
    }

    @Override
    public String toString() {
        return "Note8{" +
                "model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", en=" + en +
                ", boy=" + boy +
                '}';
    }
}
