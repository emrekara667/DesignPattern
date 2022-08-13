package dependecyinjection;

public class main {
    public static void main(String[] args) {

        ElectricEngine electricEngine = new ElectricEngine();
        Car autoCar = new AutoCar(electricEngine);
        autoCar.drive();

       /* DieselEngine dieselEngine = new DieselEngine();
        AutoCar autoCar = new AutoCar();
        autoCar.setEngine(dieselEngine);
        autoCar.drive();*/

      /*  AutoCar car = new AutoCar();
        car.setEngine(new DieselEngine());
        car.drive();*/




    }
}
