package pl.kurcaba.Decorator;

public class Main {



    public static void main(String... args)
    {
        CarDecorator car = new EsrSystem(new AbsSystem( new SimpleCar("Skoda")));
        car.printSystems();
    }
}
