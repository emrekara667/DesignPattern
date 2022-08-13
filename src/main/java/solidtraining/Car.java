package solidtraining;

public class Car {
    DieselEngine dieselEngine = new DieselEngine();

    public void drive(){
        String start = dieselEngine.start();
        System.out.println(start);
    }
}
