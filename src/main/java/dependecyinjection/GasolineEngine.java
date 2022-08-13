package dependecyinjection;

public class GasolineEngine implements Engine{
    @Override
    public String start() {
        return "Gasoline engine started\n";
    }
}
