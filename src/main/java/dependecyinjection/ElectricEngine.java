package dependecyinjection;

public class ElectricEngine implements Engine{

    @Override
    public String start() {
        return "Electric engine started.\n";
    }
}
