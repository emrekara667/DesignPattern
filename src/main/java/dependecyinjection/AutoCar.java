package dependecyinjection;

public class AutoCar implements Car{

    Engine engine;

    public AutoCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        String start = engine.start();
        System.out.println(start);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
